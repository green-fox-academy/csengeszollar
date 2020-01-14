package AnimalProtection;

public class Main {
    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();
        Cat kitty = new Cat();
        Dog doggie = new Dog();
        Parrot pityu =  new Parrot();

        System.out.println(shelter.rescue(kitty));
        System.out.println(kitty.toString());
        shelter.earnDonation(808);
        System.out.println(shelter.toString());
        shelter.addAdopter("Joci");
        shelter.addAdopter("Joe");
        shelter.addAdopter("Juli");
        shelter.rescue(pityu);
        shelter.rescue(doggie);
        System.out.println(shelter.toString());
        shelter.heal();
        System.out.println(shelter.toString());
        shelter.heal();
        System.out.println(shelter.toString());
        shelter.findNewOwner();
        System.out.println(shelter.toString());

    }
}
