package Flyable;

public class Helicopter extends Vehicle implements Flyable {
    public Helicopter(String name) {
        super(name);
    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void takeOff() {
        System.out.println("Pushing the start button.");

    }
}
