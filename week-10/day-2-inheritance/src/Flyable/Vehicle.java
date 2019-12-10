package Flyable;

public abstract class Vehicle {
   private String name;
    private int numberOfWheels;
    private String kindOfVehicle;

    public Vehicle(String name) {
        this.name = name;
    }

    public Vehicle(String name, int numberOfWheels, String kindOfVehicle) {
        this.name = name;
        this.numberOfWheels = numberOfWheels;
        this.kindOfVehicle = kindOfVehicle;
    }
}




