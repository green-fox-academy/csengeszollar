package Farm;

//Reuse your Animal class
//Create a Farm class
//it has list of Animals
//it has slots which defines the number of free places for animals
//breed() -> creates a new animal if there's place for it
//slaughter() -> removes the least hungry animal




import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Animal weasel = new Animal("weasel");
//        Animal raccoon = new Animal("raccoon");
//        Animal sealion = new Animal("sealion");
//        Animal armadillo = new Animal("armadillo");
//        Animal slug = new Animal("slug");

     Farm animals = new Farm();
//        animals.add(weasel);
//        animals.add(raccoon);
//        animals.add(sealion);
//        animals.add(armadillo);
//        animals.add(slug);

        animals.breed("sealion");
        animals.breed("weasel");
        animals.breed("armadillo");

        animals.animalList.get(2);
        for (int i = 0; i < 40 ; i++) {
            animals.animalList.get(2).eat();
        }
        System.out.println(animals.animalList.get(2) + " hunger value: " + animals.animalList.get(2).hungerValue);

        animals.slaughter();


    }
}
