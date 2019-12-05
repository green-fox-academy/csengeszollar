package GardenApplication;

public class Flower extends Plants {

    public Flower(String color) {
        super(color);
        this.setAbsorptionRate(0.75);
        this.setThirstyLevel(5);
    }

}
