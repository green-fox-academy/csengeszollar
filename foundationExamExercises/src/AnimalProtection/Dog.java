package AnimalProtection;

public class Dog extends Animal{
    public Dog() {
        super("Dog");
        this.setHealCost((int)(Math.random() * 7 + 1));
    }
}
