import packageExample2.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human kati = new Human();
        Human mark = new Human();
        Dog dog = new Dog();

        List<Human> humans = new ArrayList<Human>();
        humans.add(kati);
        humans.add(mark);
        System.out.println(humans.size());
        System.out.println(humans.get(1).getHeight());

        mark.height = 50;
        System.out.println("marks height " + mark.height);
        mark.setHeight(40);
        System.out.println("marks height " + mark.height);
       // System.out.println(mark.getHeight());
       // System.out.println("Humans created static: " + Human.humansCreatedStatic);
       // System.out.println("Humans created non static: " + mark.humansCreatedNonStatic);

        //System.out.println("katis age " + kati.age);
        //Human olga = new Human("olga", 39, 177);
       // Human maja = new Human("maja", 34, 155);


       // System.out.println(olga.age);

       /* System.out.println(tom.name);

        kati.age = 31;
        kati.name = "katalin";*/


        //System.out.println("Kati neve " + kati.name + " magassage " + kati.height + " kor " + kati.age + " balkezes-e " + kati.isLeftHanded);



      /* kati.fight(olga);
        System.out.println(kati.isAlive);
        System.out.println(olga.isAlive);*/

       // Human jani = new Human();

        //System.out.println(jani.name + " name ");

        //System.out.println(olga.name);

    }
}
