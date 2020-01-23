package Garage;

public abstract class Car {
    private String licensePlate;
    private String color;
    private int speed;
    private int tankCapacity;  //originally: fuelTank
    private int actualFuelLevel;


    public Car(String color, int tankCapacity, String licensePlate) {
        this.color = color;
        this.tankCapacity = tankCapacity;
        this.licensePlate = licensePlate;
        this.actualFuelLevel = 0;
        this.speed = 120;
    }

    public int fill(int amountOfFuel) {

        if (actualFuelLevel == tankCapacity) {
            return amountOfFuel;
        }
        int missingFuelAmount = tankCapacity - actualFuelLevel;
        if (amountOfFuel >= missingFuelAmount) {
            actualFuelLevel += missingFuelAmount;
            return amountOfFuel - missingFuelAmount;
        } else {
            actualFuelLevel += amountOfFuel;
            return 0;
        }
    }

    public void honk() {
        System.out.println("Tu-tu");
    }

    public int getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
