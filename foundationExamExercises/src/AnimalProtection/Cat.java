package AnimalProtection;

public class Cat extends Animal {

    public Cat() {
        super("Cat");
        setHealCost((int)(Math.random() * 6));
    }

}
