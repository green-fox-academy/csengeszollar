package com.greenfoxacademy.programmerfoxclub.models;

import java.util.List;

public class Fox {
    private String name;
    private List<String> tricks;
    private String food;
    private String drink;

    public Fox(String name, List<String> tricks, String food, String drink) {
        this.name = name;
        this.tricks = tricks;
        this.food = food;
        this.drink = drink;
    }

    public Fox(){
    }
}

