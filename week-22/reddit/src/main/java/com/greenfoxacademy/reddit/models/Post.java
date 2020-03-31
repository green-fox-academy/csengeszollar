package com.greenfoxacademy.reddit.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int numberOfVoting;
    private String title;
    private String URL;
    @ManyToOne
    private User user;
    @OneToMany (cascade = CascadeType.ALL)
    private List<Vote> votes;

    public Post() {
    }

    public Post(String title, String URL) {
        this.numberOfVoting = 0;
        this.title = title;
        this.URL = URL;
    }

    public Post(String title, String URL, User user) {
        this.title = title;
        this.URL = URL;
        this.user = user;
        this.numberOfVoting = 0;
    }

    public int getNumberOfVoting() {
        return numberOfVoting;
    }

    public void setNumberOfVoting(int numberOfVoting) {
        this.numberOfVoting = numberOfVoting;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }

    public void addVoteToList(Vote vote) {
        votes.add(vote);
    }
}
