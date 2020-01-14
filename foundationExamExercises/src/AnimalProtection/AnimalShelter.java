package AnimalProtection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnimalShelter {
    private int budget;
    private List<Animal> animals;
    private List<String> adoptersName;

    public AnimalShelter() {
        animals = new ArrayList<>();
        adoptersName = new ArrayList<>();
        setBudget(50);
    }

    public int rescue(Animal animal) {
        int animalsNumber;
        animals.add(animal);
        return animalsNumber = animals.size();
    }

    public int heal() {
        for (int i = 0; i < animals.size(); i++) {
            if (!animals.get(i).isHealthy()) {
                if (animals.get(i).getHealCost() <= this.budget) {
                    animals.get(i).heal();
                    this.budget -= animals.get(i).getHealCost();
                    return 1;
                }
            }
        }
        return 0;
    }

    public void addAdopter(String name) {
        adoptersName.add(name);
    }

    public int earnDonation(int amount) {
        setBudget(this.budget += amount);
        return budget;
    }

    public String toString() {
        String shelterInfo = String.format("Budget: %d €\nThere are %d animal(s) and %d potential adopters\n", budget, animals.size(), adoptersName.size());
        for (Animal animal : animals) {
            shelterInfo += animal.toString();
        }
        return shelterInfo;
    }

    public void findNewOwner() {
        String randomAdopter = adoptersName.get(new Random().nextInt(adoptersName.size()));
        Animal randomAnimal = animals.get(new Random().nextInt(animals.size()));
        if (randomAnimal.isAdoptable()) {
            System.out.println(randomAdopter + " can adopt " + randomAnimal.getName());
            adoptersName.remove(randomAdopter);
            animals.remove(randomAnimal);
        }
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
}
