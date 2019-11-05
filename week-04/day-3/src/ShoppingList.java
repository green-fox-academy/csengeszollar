import java.util.ArrayList;

public class ShoppingList {
    public static void main(String[] args) {
//                Create a list with the following items.
//        Eggs, milk, fish, apples, bread and chicken
        ArrayList<String> shoppingList = new ArrayList<>();

        shoppingList.add("Eggs");
        shoppingList.add("milk");
        shoppingList.add("fish");
        shoppingList.add("apples");
        shoppingList.add("bread");
        shoppingList.add("chicken");
        //        Create an application which solves the following problems.
//        Do we have milk on the list?
        System.out.println("Do we have milk on the list?");
        if (shoppingList.contains("milk")) {
            System.out.println("yes");
        } else System.out.println("no");


   //Do we have bananas on the list?

        System.out.println("Do we have bananas on the list?");
        if (shoppingList.contains("bananas")) {
            System.out.println("yes");
        } else System.out.println("no");

    }
}
