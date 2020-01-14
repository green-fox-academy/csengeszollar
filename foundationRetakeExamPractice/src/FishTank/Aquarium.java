package FishTank;

import java.util.ArrayList;
import java.util.List;

public class Aquarium {
    private List<Fish> fishes;

    public Aquarium() {
        fishes = new ArrayList<>();
    }

    public void addFish(Fish fish) {
        fishes.add(fish);
    }

    public void feed() {
        for (int i = 0; i < fishes.size(); i++) {
            fishes.get(i).feed();
        }
    }

    public void removeFish() {
        for (int i = 0; i < fishes.size(); i++) {
            if (fishes.get(i).getWeight() >= 11) {
                System.out.println(fishes.get(i).getName() + " removed.");
                fishes.remove(i);
            }
        }
    }

    public void getStatus() {
//       for (Fish fish : fishes) {
//           fish.status();
//       }
        for (int i = 0; i < fishes.size(); i++) {
            fishes.get(i).status();
        }

    }
}

