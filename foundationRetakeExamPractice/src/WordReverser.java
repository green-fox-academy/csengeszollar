import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WordReverser {
    public static void main(String[] args) {
//
//        Path filePath = Paths.get("src/wordReverserText.txt");
//        List<String> lines = new ArrayList<>();
//        try {
//            lines = Files.readAllLines(filePath);
//        } catch (
//                IOException e) {
//            System.out.println("File does not exist!");
//        }
//        System.out.println(reverser(lines));

        String sentence = "lleW ,enod taht saw ton taht drah";

        System.out.println(reverser(sentence));

    }

    public static String reverser(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reverseString = new StringBuilder();
        String reversedSentence ="";
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reverseString.append(reversedWord + " ");
           reversedSentence = reverseString.substring(0, reverseString.length() - 1);
        }

        return reversedSentence;
    }

}




