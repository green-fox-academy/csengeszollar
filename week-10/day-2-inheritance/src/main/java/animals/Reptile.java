package main.java.animals;

public class Reptile extends Animal {
    public Reptile(String name) {
        super(name, 0, "female", false);
    }

    public Reptile(String name, int age, String gender) {
        super(name, age, gender, false);
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }

    public void sunbathing() {
        System.out.println("I regularly need to recharge my batteries on the sun");
    }
}
