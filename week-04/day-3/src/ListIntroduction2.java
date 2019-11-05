import java.util.ArrayList;
import java.util.Collections;

public class ListIntroduction2 {
    public static void main(String[] args) {

        ArrayList<String> ListA = new ArrayList<>();
        ListA.add("Apple");
        ListA.add("Avocado");
        ListA.add("Blueberries");
        ListA.add("Durian");
        ListA.add("Lychee");

        ArrayList<String> ListB = new ArrayList<>();
        ListB.addAll(ListA);

        System.out.println("List A contains Durian: " + ListA.contains("Durian"));

        ListB.remove("Durian");
        ListA.add(4, "Kiwifruit");

            if (ListA.size() == ListB.size()) {
            System.out.println("List A size = List B size");
            } else {
            System.out.println("List A size != List B size");
            }
        System.out.println("List A Index of Avocado: " + ListA.indexOf("Avocado"));
        System.out.println("List B Index of Durian: " + ListB.indexOf("Durian"));

        Collections.addAll(ListB, "Passion Fruit", "Pomelo");

        System.out.println("List A 3rd element is: " + ListA.get(2));




    }
}
