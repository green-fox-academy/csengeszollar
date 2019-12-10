package main.java.animals;

public class Mammal extends Animal {
    boolean hasBreast;

    public Mammal(String name) {
        super(name);
        this.hasBreast = true;
    }

    public Mammal(String name, int age, String gender, boolean isFurry, int numberOfLegs, boolean hasBreast) {
        super(name, age, gender, isFurry, numberOfLegs);
        this.hasBreast = hasBreast;
    }

    @Override
    public String breed() {
        return "pushing miniature versions out.";
    }
}
