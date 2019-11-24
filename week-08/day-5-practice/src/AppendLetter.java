import java.util.*;

public class AppendLetter{
    public static void main(String... args){
        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");
        // Create a method called "appendA()" that adds "a" to every string in the "far" list.
        // The parameter should be a list.
//        for (int i = 0; i < far.size(); i++) {
//            System.out.println(far.get(i) + "a");
//        }

        System.out.println(appendA(far));
    }
    private static List<String> appendA(List<String> List) {
        ArrayList<String> newList = new ArrayList<>(List.size());
        for (String word: List){
            String appendedWord = word.concat("a");
            newList.add(appendedWord);
        }
        return newList;
    }
}

// The output should be: "boa", "anaconda", "koala", "panda", "zebra"