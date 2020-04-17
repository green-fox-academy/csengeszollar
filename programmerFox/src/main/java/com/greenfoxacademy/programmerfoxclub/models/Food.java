package com.greenfoxacademy.programmerfoxclub.models;

import java.util.Arrays;
import java.util.List;

public enum Food {
    APPLE("apple"),
    GOOSE("goose leg"),
    CHICKEN("chicken tight"),
    SALAD("Waldorf salad");

    public final String name;

    private Food(String name){
        this.name = name;
    }

    public static List<Food> getFoods(){
        return Arrays.asList(values());
    }

    @Override
    public String toString() {
        return name;
    }
}