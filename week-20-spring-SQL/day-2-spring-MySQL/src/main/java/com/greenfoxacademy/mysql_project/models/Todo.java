package com.greenfoxacademy.mysql_project.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private boolean isUrgent;
    private boolean isDone;
    @ManyToOne
    private Assignee assignee;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfCreation;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dueDate;


    public Todo() {
        dateOfCreation = LocalDate.now();

    }

    public Todo(String title, boolean isUrgent, boolean isDone) {
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
        dateOfCreation = LocalDate.now();
    }

    public Todo(String title, boolean isUrgent, boolean isDone, Assignee assignee) {
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
        this.assignee = assignee;
        dateOfCreation = LocalDate.now();
    }

    public Todo(String title, boolean isUrgent, boolean isDone, Assignee assignee, LocalDate dueDate) {
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
        this.assignee = assignee;
        dateOfCreation = LocalDate.now();
        this.dueDate = dueDate;
    }

    public Todo(String title, LocalDate dueDate){
        this.title = title;
        dateOfCreation = LocalDate.now();
        this.dueDate = dueDate;
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

    public boolean getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(boolean urgent) {
        isUrgent = urgent;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void setIsDone(boolean done) {
        isDone = done;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    public String getAssigneeName() {
        if (assignee == null) {
            return "";
        } else {
            return assignee.getName();
        }
    }

    public String getAssigneeEmail() {
        if (assignee == null){
            return "";
        } else {
            return assignee.getEmail();
        }
    }

    public LocalDate getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(LocalDate dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
