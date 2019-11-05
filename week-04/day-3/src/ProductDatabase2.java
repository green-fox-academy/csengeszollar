import java.util.HashMap;
import java.util.Map;

public class ProductDatabase2 {
    public static void main(String[] args) {

        //Create a map with the following key-value pairs.

        HashMap<String, Integer> priceList = new HashMap<>();
        priceList.put("Eggs", 200);
        priceList.put("Milk", 200);
        priceList.put("Fish", 400);
        priceList.put("Apples", 150);
        priceList.put("Bread", 50);
        priceList.put("Chicken", 550);

//Create an application which solves the following problems.
//Which products cost less than 201? (just the name)

        for (Map.Entry<String, Integer> items : priceList.entrySet()) {
            if (items.getValue() < 201) {
                System.out.println(items.getKey());
            }
        }

        //Which products cost more than 150? (name + price)
        for (Map.Entry<String, Integer> items : priceList.entrySet()) {
            if (items.getValue() > 150) {
                System.out.println(items);
            }
        }




    }
}
