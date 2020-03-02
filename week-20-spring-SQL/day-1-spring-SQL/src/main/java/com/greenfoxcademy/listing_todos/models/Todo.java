package com.greenfoxcademy.listing_todos.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Todo {
    @Id
    private long id;
    private String title;
    private boolean isUrgent;
    private boolean isDone;

    public Todo() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isUrgent() {
        return isUrgent;
    }

    public void setUrgent(boolean urgent) {
        isUrgent = urgent;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
