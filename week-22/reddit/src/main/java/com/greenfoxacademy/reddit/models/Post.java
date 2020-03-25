package com.greenfoxacademy.reddit.models;

import javax.persistence.*;

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

    public Post() {
    }

    public Post(String title, String URL) {
        this.numberOfVoting = 0;
        this.title = title;
        this.URL = URL;
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
}
