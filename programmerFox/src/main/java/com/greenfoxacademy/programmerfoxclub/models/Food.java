package com.greenfoxacademy.programmerfoxclub.models;

public enum Food {
    APPLE("apple"),
    GOOSE("goose leg"),
    CHICKEN("chicken tight"),
    SALAD("Waldorf salad");

    public final String name;

    private Food(String name){
        this.name = name;
    }
}