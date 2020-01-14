package FishTank;

public class FishTank {
    public static void main(String[] args) {
        Clownfish clownfish = new Clownfish("Jack");
        Tang tang = new Tang("Dory");
        Kong kong = new Kong("Lily");
        Aquarium aquarium = new Aquarium();

//        clownfish.status();
//        clownfish.feed();
//        clownfish.status();
//        clownfish.feed();
//        clownfish.status();
//        clownfish.feed();
//        clownfish.status();
//        tang.status();
//        kong.feed();
//        kong.status();
//
//        for (int i = 0; i < 10 ; i++) {
//            tang.feed();
//        }
//        tang.status();
        aquarium.getStatus();
        aquarium.addFish(tang);
        aquarium.addFish(kong);
        aquarium.addFish(clownfish);
        aquarium.feed();
        tang.status();
        aquarium.getStatus();
        for (int i = 0; i < 8; i++) {
            aquarium.feed();
        }
        aquarium.getStatus();
        aquarium.removeFish();

    }
}
