package com.greenfoxacademy.reddit.services;

import com.greenfoxacademy.reddit.models.Post;
import com.greenfoxacademy.reddit.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PostService {

    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Iterable<Post> findAll(){
        return postRepository.findAll();
    }

    public void incrementVoting(long id){
        Optional<Post> optional = postRepository.findById(id);
        if (optional.isPresent()) {
            Post post = optional.get();
            post.setNumberOfVoting(post.getNumberOfVoting()+1);
            postRepository.save(post);
        }
    }

    public void decrementVoting(long id){
        Optional<Post> optional = postRepository.findById(id);
        if (optional.isPresent()) {
            Post post = optional.get();
            post.setNumberOfVoting(post.getNumberOfVoting()-1);
            postRepository.save(post);
        }
    }

    public void addNewPost(String title, String URL){
        postRepository.save(new Post(title, URL));
    }
}
