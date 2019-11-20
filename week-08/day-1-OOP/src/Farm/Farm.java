package Farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    List<Animal> animalList;
    int freeSlots;

    public Farm() {
        this.animalList = new ArrayList<>();
        this.freeSlots = 10;
    }

    public void add(Animal animal) {
        animalList.add(animal);
    }

    public void breed(String animal) {
        Animal newAnimal = new Animal(animal);
        if (freeSlots > 0) {
            animalList.add(newAnimal);
            freeSlots--;
            System.out.println("New breed in the farm: " + animal);
        } else System.out.println("Sorry, there is no free slot for a new animal: " + animal);
    }

    public void slaughter() {
        if (freeSlots >= 10) {
            System.out.println("No animal left in the farm to slaughter");
        } else {
            Animal leastHungry = animalList.get(0); //declare min value as the first element of the list
            // int minIndex = 0; //declare min element index as 0 (i.e. first element)
            for (int i = 0; i < animalList.size(); i++) {
                if (animalList.get(i).hungerValue < leastHungry.hungerValue) {
                    leastHungry = animalList.get(i);
                }

            }
            animalList.remove(leastHungry);
            freeSlots++;
            System.out.println("One least hungry animal, a " + leastHungry.name + " is slaughtered");
        }


    }

}

