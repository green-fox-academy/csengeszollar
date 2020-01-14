import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WordReverser {
    public static void main(String[] args) {

        Path filePath = Paths.get("src/wordReverserText.txt");
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(filePath);
        } catch (
                IOException e) {
            System.out.println("File does not exist!");
        }
        String[] words = new String[lines.size()];
        for (int i = 0; i < lines.size(); i++) {
            words = lines.get(i).split(" ");
        }

        StringBuilder reverseString = new StringBuilder();
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            reverseString.append(reversedWord + " ");
        }
        System.out.println(reverseString.toString());
    }

}




