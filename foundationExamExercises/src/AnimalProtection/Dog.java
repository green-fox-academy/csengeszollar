package AnimalProtection;

public class Dog extends Animal{
    public Dog() {
        super("Dog");
        setHealCost((int)(Math.random() * 7 + 1));
    }
}
