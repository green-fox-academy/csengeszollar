package com.example.ratemymentor.models;

import javax.persistence.*;

@Entity
@Table(name = "mentors")
public class Mentor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
    private String className;
    @ManyToOne
    private ClassName namesOfClass;

    public Mentor() {
    }

    public Mentor(String name, String className) {
        this.name = name;
        this.className = className;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public ClassName getNamesOfClass() {
        return namesOfClass;
    }

    public void setNamesOfClass(ClassName namesOfClass) {
        this.namesOfClass = namesOfClass;
    }

}
