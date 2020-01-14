package AnimalProtection;

public class Parrot extends Animal {
    public Parrot() {
        super("Parrot");
        this.setHealCost((int)(Math.random() * 6 + 4));
    }
}
