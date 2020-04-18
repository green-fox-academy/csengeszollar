package com.greenfoxacademy.programmerfoxclub.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {
    private String name;
    private List<String> tricks;
    private String food;
    private String drink;

    public Fox(String name, String food, String drink) {
        this.name = name;
        this.tricks = new ArrayList<>();
        this.food = food;
        this.drink = drink;
    }

    public Fox(String name){
        this.name = name;
        this.tricks = new ArrayList<>();
        this.food = "Caesar salad";
        this.drink = "Red Bull";
    }

    public Fox(){
        tricks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getTricks() {
        return tricks;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTricks(List<String> tricks) {
        this.tricks = tricks;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public int numberOfTricks(){
        if (tricks.isEmpty()){
            return 0;
        } else {
            return tricks.size();
        }
    }

    public List<String> removingTricksFoxAlreadyKnows() {
      List<String> trickList = Trick.getTricks();
        for (String trick : tricks) {
            trickList.remove(trick);
        }
        return trickList;
    }
}