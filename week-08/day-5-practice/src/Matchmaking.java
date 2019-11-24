import java.util.*;

public class Matchmaking {
    public static void main(String... args) {
        ArrayList<String> girls = new ArrayList<String>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        ArrayList<String> boys = new ArrayList<String>(Arrays.asList("Joe", "Fred", "Tom", "Todd", "Neef", "Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be the element of the list too
        // Exepected output: "Eve", "Joe", "Ashley", "Fred"...

        System.out.println(makingMatches(girls, boys));
    }

    public static ArrayList makingMatches(ArrayList a, ArrayList b) {
        int size = 0;
        int size2 = 0;
        ArrayList matches = new ArrayList();

        if (a.size() <= b.size()) {
            size = a.size();
            size2 = b.size();
            for (int i = 0; i < size; i++) {
                matches.add(a.get(i));
                matches.add(b.get(i));
            }
        } else {
            size = b.size();
            size2 = a.size();
            for (int i = size + 1; i < size2; i++) {
                matches.add(a.get(i));
                matches.add(b.get(i));
            }

        }
        return matches;


    }
}
