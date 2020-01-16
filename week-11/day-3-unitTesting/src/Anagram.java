import sun.plugin.javascript.navig.Array;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.HashMap;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(isItAnagram("vakollat", "lovakat"));
    }

    public static boolean isItAnagram(String a, String b) {
        String[] aSplitted = a.split(" ");
        String[] bSplitted = b.split(" ");

        String aWithoutSpaces = "";
        for (String element : aSplitted) {
            aWithoutSpaces += element;
        }

        String bWithoutSpaces = "";
        for (String element : bSplitted) {
            bWithoutSpaces += element;
        }


        if (aWithoutSpaces.length() != bWithoutSpaces.length()) {
            return false;
        } else {
            char arrA[] = aWithoutSpaces.toCharArray();
            char arrB[] = bWithoutSpaces.toCharArray();

            Arrays.sort(arrA);
            Arrays.sort(arrB);


            if (Arrays.equals(arrA, arrB)) {
                return true;
            } else
                return false;
        }

    }
}
//        String[] aCharacters = a.split("");
//        HashMap<String, Integer> letterCountsA = new HashMap<>();
//
//        for (int i = 0; i < aCharacters.length ; i++) {
//            String letter = aCharacters[i];
//            if (!letterCountsA.containsKey(letter)) {
//                letterCountsA.put(letter, 1);
//            } else {
//                letterCountsA.replace(letter, letterCountsA.get(letter) + 1);
//            }
//