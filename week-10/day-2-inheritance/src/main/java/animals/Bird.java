package main.java.animals;

public class Bird extends Animal {
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
}
