import java.util.HashMap;
import java.util.Map;

public class CountLetters {

    public static HashMap<String, Integer> countLetters(String word) throws Exception {
        HashMap<String, Integer> countedLetters = new HashMap<>();

        if (word == null || word == "") throw new Exception("String does not exist!");

        String[] wordCharacters = word.split("");
        for (int i = 0; i <wordCharacters.length ; i++) {
            String letter = wordCharacters[i];
            if (!countedLetters.containsKey(letter)) {
                countedLetters.put(letter, 1);
            } else {
                countedLetters.replace(letter, countedLetters.get(letter) + 1);
            }
        }
        return countedLetters;
    }

    public String printOutDictionary(HashMap<String, Integer> countedLetters) {
        String dictionaryOfLetters = "";
      for (Map.Entry<String, Integer> letterCount : countedLetters.entrySet()) {
          dictionaryOfLetters += String.format("Letter %s occurs %d times \n", letterCount.getKey(), letterCount.getValue());
      }
      return dictionaryOfLetters;
    }

}
