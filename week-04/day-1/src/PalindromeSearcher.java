import java.util.ArrayList;
import java.util.List;

// Create a function named search palindrome following your current language's style guide. It should take a string, search for palindromes that at least 3 characters long and return a list with the found palindromes.
//
//Examples
//input	output
//"dog goat dad duck doodle never"	["og go", "g g", " dad ", "dad", "d d", "dood", "eve"]
//"apple"	[]
//"racecar"	["racecar", "aceca", "cec"]
//""	[]
public class PalindromeSearcher {
    public static void main(String[] args) {
        String text1 = "dog goat dad duck doodle never";
        String text2 = "apple";
        String text3 = "racecar";
        String text4 = "";

        List<String> foundPalindromes1 = findPalindromes(text1);
        System.out.println(foundPalindromes1.toString());
        List<String> foundPalindromes2 = findPalindromes(text2);
        System.out.println(foundPalindromes2.toString());
        List<String> foundPalindromes3 = findPalindromes(text3);
        System.out.println(foundPalindromes3.toString());
        List<String> foundPalindromes4 = findPalindromes(text4);
        System.out.println(foundPalindromes4.toString());
    }

    public static List<String> findPalindromes(String text) {
        List<String> palindromes = new ArrayList<>();
        for (int i = 1; i < text.length(); i++) {
            for (int j = 1; j < Math.min(i + 1, text.length() - i); j++) {
                if (j > 1 & text.substring(i - j, i).equals(reverse(text.substring(i, i + j)))) {
                    palindromes.add(text.substring(i - j, i + j));
                } else if (text.substring(i - j, i).equals(reverse(text.substring(i + 1, i + j + 1)))) {
                    palindromes.add(text.substring(i - j, i + j + 1));
                }
            }
        }
        return palindromes;
    }

    public static String reverse(String substring) {
        StringBuilder reversedLetters = new StringBuilder();
        for (int i = substring.length() - 1; i >= 0; i--) {
            reversedLetters.append(substring.charAt(i));
        }
        return reversedLetters.toString();
    }
}