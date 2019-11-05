
import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    public static void main(String[] args) {
    // We are going to represent our products in a map where the keys are strings representing the product's name
        // and the values are numbers representing the product's price.

        HashMap<String, Integer> priceList = new HashMap<>();
        priceList.put("Eggs", 200);
        priceList.put("Milk", 200);
        priceList.put("Fish", 400);
        priceList.put("Apples", 150);
        priceList.put("Bread", 50);
        priceList.put("Chicken", 550);

    // Create an application which solves the following problems.
        // How much is the fish?

       System.out.println("The fish costs: " + priceList.get("Fish"));

        //What is the most expensive product?

       /* int highestPrice = 0;
        String mostExpensiveProduct = "";

        for (Integer price : priceList.values()) {
            if (price > highestPrice) {
                highestPrice = price;
            }
        }
        System.out.println(highestPrice); */
       int highestPrice = 0;
       String mostExpensiveProduct = "";
        for (Map.Entry<String, Integer> items : priceList.entrySet()) {
            if (items.getValue() > highestPrice) {
                highestPrice = items.getValue();
                mostExpensiveProduct = items.getKey();
            }

        }
        System.out.println("The most expensive product is: " + mostExpensiveProduct + " = " + highestPrice);

        //What is the average price?

        int sum = 0;
        for (Integer itemsPrice : priceList.values()) {
            sum += itemsPrice;
        }
        System.out.println("The average price is: " + sum / priceList.size());

        //How many products' price is below 300?

        int below = 0;
        for (Integer productPrices : priceList.values()) {
            if (productPrices < 300) {
                below++; // a below erteket mindig eggyel novelem, amikor talal 300 alatti arat uaz mint below += 1
            }
        }
        System.out.println("There are " + below + " products below 300");

        //Is there anything we can buy for exactly 125?

        if (priceList.containsValue(125)) {
            System.out.println("Yes there is something you can buy for 125");
        } else System.out.println("No there is no such item you could buy for 125");

// What is the cheapest product?

        int lowestPrice = highestPrice;
        String cheapestProduct = "";

        for (Map.Entry<String, Integer> items : priceList.entrySet()) {
            if (items.getValue() < lowestPrice) {
                lowestPrice = items.getValue();
                cheapestProduct = items.getKey();
            }
        }
        System.out.println("The cheapset product is: " + cheapestProduct);



    }


}
