package SharpieSet;


import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    public List<Sharpie> listOfSharpies;

    public SharpieSet() {
        listOfSharpies = new ArrayList<>();
    }

    public void add(Sharpie sharpie) {
        listOfSharpies.add(sharpie);
    }

    public int countUsable() {
        int amountOfUsableSharpies = 0;
        for (int i = 0; i < listOfSharpies.size(); i++) {
            if (listOfSharpies.get(i).inkAmount > 0) {
                amountOfUsableSharpies ++;
            }

        } return amountOfUsableSharpies;

    }

    public void removesToTrash() {
        String removed = "";
        for (int i = 0; i < listOfSharpies.size(); i++) {
            if (listOfSharpies.get(i).inkAmount == 0) {
                removed += listOfSharpies.get(i);
                listOfSharpies.remove(i);

            }

        }
        System.out.println("My sharpie set contains: " + listOfSharpies + " and removed: " + removed);

    }
}


