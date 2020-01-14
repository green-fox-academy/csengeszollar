package AnimalProtection;

public class Cat extends Animal {

    public Cat() {
        super("Cat");
        this.setHealCost((int)(Math.random() * 6));
    }

}
