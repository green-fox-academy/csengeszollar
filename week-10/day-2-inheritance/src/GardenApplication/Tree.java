package GardenApplication;

public class Tree extends Plants{
    public Tree(String color) {
        super(color);
        this.setAbsorptionRate(0.4);
        this.setThirstyLevel(10);
    }

}
