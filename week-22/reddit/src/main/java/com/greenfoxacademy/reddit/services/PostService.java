package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.models.User;
import com.greenfoxacademy.reddit.models.Vote;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import com.greenfoxacademy.reddit.repositories.UserRepository;
import com.greenfoxacademy.reddit.repositories.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PostService {

    private PostRepository postRepository;
    private VoteRepository voteRepository;

    @Autowired
    public PostService(PostRepository postRepository, VoteRepository voteRepository) {
        this.postRepository = postRepository;
        this.voteRepository = voteRepository;
    }

    public Iterable<Post> findAll() {
        return postRepository.findAll();
    }

    public void incrementVoting(long id, User user) {
        Optional<Post> optional = postRepository.findById(id);
        if (optional.isPresent()) {
            Post post = optional.get();
            Vote vote = new Vote(post, user, true);
            post.setNumberOfVoting(post.getNumberOfVoting() + 1);
            post.addVoteToList(vote);
            postRepository.save(post);
//            voteRepository.save(vote);
        }
    }

    public void decrementVoting(long id, User user) {
        Optional<Post> optional = postRepository.findById(id);
        if (optional.isPresent()) {
            Post post = optional.get();
            Vote vote = new Vote(post, user, false);
            post.setNumberOfVoting(post.getNumberOfVoting() - 1);
            post.addVoteToList(vote);
            postRepository.save(post);
//            voteRepository.save(vote);
        }
    }

    public boolean hasVoted(Post post, User user) {
        for (int i = 0; i < post.getVotes().size(); i++) {
            if (post.getVotes().get(i).getUser().equals(user)) {
                return true;
            }
        }
        return false;
    }

    public boolean votedByPositive(Post post, User user) {
        for (int i = 0; i < post.getVotes().size(); i++) {
            if (post.getVotes().get(i).getUser().equals(user)) {
                return post.getVotes().get(i).isPositiveVote();
            }
        }

    }

    public void addNewPost(Post post) {
        postRepository.save(post);
    }

    public Post findById(long id) {
        Optional<Post> optional = postRepository.findById(id);
        return optional.orElse(null);
    }

    public Iterable<Post> listingPostDescendingOrder() {
        return postRepository.findAllByOrderByNumberOfVotingDesc();
    }
}
