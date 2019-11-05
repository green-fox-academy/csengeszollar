import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
    public static void main(String[] args) {
        HashMap<String, String> firstMap = new HashMap<>();
        firstMap.put("978-1-60309-452-8", "A Letter to Jo");
        firstMap.put("978-1-60309-459-7", "Lupus");
        firstMap.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        firstMap.put("978-1-60309-461-0", "The Lab");

      //Print all the key-value pairs in the following format
        //
        //A Letter to Jo (ISBN: 978-1-60309-452-8)
        //Lupus (ISBN: 978-1-60309-459-7)
        //Red Panda and Moon Bear (ISBN: 978-1-60309-444-3)
        //The Lab (ISBN: 978-1-60309-461-0)

        for (Map.Entry<String, String> TitleNumber : firstMap.entrySet()) {
            System.out.printf("%s (ISBN: %s)\n", TitleNumber.getValue(), TitleNumber.getKey());
        }
// Remove the key-value pair with key 978-1-60309-444-3
        firstMap.remove("978-1-60309-444-3", "Red Panda and Moon Bear");

        // Remove the key-value pair with value The Lab
        firstMap.remove("978-1-60309-461-0", "The Lab");

//Add the following key-value pairs to the map
//
//Key	Value
//978-1-60309-450-4	They Called Us Enemy
//978-1-60309-453-5	Why Did We Trust Him?

        firstMap.put("978-1-60309-450-4", "They Called Us Enemy");
        firstMap.put("978-1-60309-453-5", "Why Did We Trust Him?");

//Print whether there is an associated value with key 478-0-61159-424-8 or not

        System.out.println("There is no value with key 478-0-61159-424-8: " + (firstMap.get("478-0-61159-424-8") == null));

 //Print the value associated with key 978-1-60309-453-5
        System.out.println(firstMap.get("978-1-60309-453-5"));



    }
}
