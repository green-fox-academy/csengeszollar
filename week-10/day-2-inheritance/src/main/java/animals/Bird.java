package main.java.animals;

import Flyable.Flyable;

public class Bird extends Animal implements Flyable {
    private boolean hasBeak;
    private boolean hasFeather;


    public Bird(String name) {
        super(name);
        this.hasBeak = true;
        this.hasFeather = true;
    }

    public Bird(String name, int age, String gender, boolean isFurry) {
        super(name, age, gender, false, 2);
        this.hasBeak = true;
        this.hasFeather = true;
    }

    @Override
    public String breed() {
        return "laying eggs.";

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {
        System.out.println("Moving its wings up and down");
    }

    @Override
    public void takeOff() {

    }
}
