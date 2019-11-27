package Pirates;

public class Pirate {

    String name;
    int amountOfGold;
    int healthPoints;
    boolean hasPirateWoodenLeg;
    boolean isPirateACaptain;

    public Pirate(String pirateName, boolean woodenLegged, boolean captain) {
        this.name = pirateName;
        this.amountOfGold = 0;
        this.healthPoints = 10;
        this.hasPirateWoodenLeg = woodenLegged;
        this.isPirateACaptain = captain;
    }

    public void work(Pirate pirate) {
        if (pirate.isPirateACaptain) {
            pirate.amountOfGold += 10;
            pirate.healthPoints -= 5;
        } else {
            pirate.amountOfGold += 1;
            pirate.healthPoints -= 1;
        }
    }

    public void party(Pirate pirate) {
        if (pirate.isPirateACaptain) {
            pirate.healthPoints += 10;
        } else {
            pirate.healthPoints += 1;
        }

    }

    @Override
    public String toString() {
        if (this.hasPirateWoodenLeg) {
            return "Hello, I'm " + this.name + ". I have a wooden leg and " + this.amountOfGold + " golds.";
        } else {
            return "Hello, I'm " + this.name + ". I still have my real legs and " + this.amountOfGold + " golds.";
        }
    }
}