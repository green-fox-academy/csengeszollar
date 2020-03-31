package com.greenfoxacademy.reddit.models;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
public class Vote {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Post post;
    @ManyToOne
    private User user;
    private boolean isPositiveVote;

    public Vote() {
    }

    public Vote(Post post, User user, boolean isPositiveVote) {
        this.post = post;
        this.user = user;
        this.isPositiveVote = isPositiveVote;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isPositiveVote() {
        return isPositiveVote;
    }

    public void setPositiveVote(boolean positiveVote) {
        isPositiveVote = positiveVote;
    }
}
