import java.util.HashMap;

public class MapIntroduction {
    public static void main(String[] args) {

//Create an empty map where the keys are integers and the values are characters
        HashMap<Integer, Character> firstMap = new HashMap<>();

//Print out whether the map is empty or not
        System.out.println(firstMap.isEmpty());

//Add the following key-value pairs to the map
        firstMap.put(97, 'a');
        firstMap.put(98, 'b');
        firstMap.put(99, 'c');
        firstMap.put(65, 'A');
        firstMap.put(66, 'B');
        firstMap.put(67,'C');

        //Print all the keys

        System.out.println(firstMap.keySet());

        //Print all the values
        System.out.println(firstMap.values());

       //Add value D with the key 68
        firstMap.put(68, 'D');

        //Print how many key-value pairs are in the map
        System.out.println(firstMap.size());

        //Print the value that is associated with key 99
        System.out.println(firstMap.get(99));

        //Remove the key-value pair where with key 97
        firstMap.remove(97);

        //Print whether there is an associated value with key 100 or not
        System.out.println(firstMap.get(100) != null);

        //Remove all the key-value pairs
        firstMap.clear();
        System.out.println(firstMap.isEmpty());
    }
}
