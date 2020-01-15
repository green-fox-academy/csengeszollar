package AnimalProtection;

public class Parrot extends Animal {
    public Parrot() {
        super("Parrot");
        setHealCost((int)(Math.random() * 6 + 4));
    }
}
