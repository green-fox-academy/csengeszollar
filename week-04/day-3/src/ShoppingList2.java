import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {
    public static void main(String[] args) {
      //Represent the following products with their prices

        HashMap<String, Double> priceList = new HashMap<>();
        priceList.put("Milk", 1.07);
        priceList.put("Rice", 1.59);
        priceList.put("Eggs", 3.14);
        priceList.put("Cheese", 12.60);
        priceList.put("Chicken Breast", 9.40);
        priceList.put("Apples", 2.31);
        priceList.put("Tomato", 2.58);
        priceList.put("Potato", 1.75);
        priceList.put("Onion", 1.10);

        //Represent Bob's shopping list
        HashMap<String, Integer> bobsList = new HashMap<>();
        bobsList.put("Milk", 3);
        bobsList.put("Rice", 2);
        bobsList.put("Eggs", 2);
        bobsList.put("Cheese", 1);
        bobsList.put("Chicken Breast", 4);
        bobsList.put("Apples", 1);
        bobsList.put("Tomato", 2);
        bobsList.put("Potato", 1);

        //Represent Alice's shopping list
        HashMap<String, Integer> alicesList = new HashMap<>();
        alicesList.put("Rice", 1);
        alicesList.put("Eggs", 5);
        alicesList.put("Chicken Breast", 2);
        alicesList.put("Apples", 1);
        alicesList.put("Tomato", 10);

        //How much does Bob pay?
        double sumBob = 0;
        for (Map.Entry<String, Integer> items : bobsList.entrySet()) {
            sumBob += priceList.get(items.getKey()) * items.getValue();
        }
        System.out.println(sumBob + " Bob pays");

        //How much does Alice pay?
        double sumAlice = 0;
        for (Map.Entry<String, Integer> items : alicesList.entrySet()) {
            sumAlice += priceList.get(items.getKey()) * items.getValue();
        }
        System.out.println(sumAlice + " Alice pays");

        //Who buys more Rice?
        if (bobsList.get("Rice") > alicesList.get("Rice")) {
            System.out.println("Bob buys more rice than Alice.");
        } else System.out.println("Alice buys more rice than Bob.");

        //Who buys more Potato?
        if (alicesList.containsKey("Potato")) {
            if (bobsList.containsKey("Potato")) {
                if (bobsList.get("Potato") > alicesList.get("Potato")) {
                    System.out.println("Bob buys more potato than Alice.");
                } else System.out.println("Alice buys more potato than Bob.");
            }
            else System.out.println("Alice buys more potato because Bob doesn't have it on the list.");
        }
        else if (bobsList.containsKey("Potato"))
            System.out.println("Bob buys more potato because Alice doesn't have it on the list.");


        //Who buys more different products

        if (bobsList.size() > alicesList.size()) {
            System.out.println("Bob buys more different products");
       } else if (bobsList.size() == alicesList.size()) {
            System.out.println("Bob and Alice buys the same amount of products");
        } else System.out.println("Alice buys more different products");

        //Who buys more product?
        int sumBobsProduct = 0;
        for (Integer itemsPrice : bobsList.values()) {
           sumBobsProduct += itemsPrice;
        }
     // System.out.println(sumBobsProduct);

        int sumAlicesProduct = 0;
        for (Integer itemsPrice : alicesList.values()) {
            sumAlicesProduct += itemsPrice;
        }
       // System.out.println(sumAlicesProduct);

        if (sumAlicesProduct > sumBobsProduct) {
            System.out.println("Alice buys more product");
        } else if (sumAlicesProduct == sumBobsProduct) {
            System.out.println("Alice and Bob buys the same amount of product");
        } else System.out.println("Bob buys more product");

    }
}
