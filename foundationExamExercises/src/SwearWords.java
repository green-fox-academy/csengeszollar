
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwearWords {
    public static void main(String[] args) {

        Path filePath = Paths.get("src/swearwords.txt");
        List<String> lines = new ArrayList<>();
        String[] swearwords = {"fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt"};
        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("File does not exist!");
        }
//        System.out.println(swearwordsCounter(lines, swearwords));
        System.out.println(removingSwearwords(lines, swearwords));


    }

    public static int swearwordsCounter(List<String> lines, String[] swearwords) {
        int swearwordsCount = 0;
        for (int i = 0; i < lines.size(); i++) {
            String[] linesWords = lines.get(i).replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" ");
            for (int j = 0; j < swearwords.length; j++) {
                if (Arrays.asList(linesWords).contains(swearwords[j])) {
                    swearwordsCount++;
                }
            }
        }
        return swearwordsCount;
    }

    public static int removingSwearwords(List<String> lines, String[] swearwords) {
        int swearwordsCount = 0;
        List<String> linesSplittedToWords = new ArrayList<>();

        for (int i = 0; i < lines.size(); i++) {
            String[] linesWords = lines.get(i).replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" ");
            linesSplittedToWords.addAll(Arrays.asList(linesWords));
            for (int j = 0; j < swearwords.length; j++) {
                if (linesSplittedToWords.contains(swearwords[j])) {
                    swearwordsCount++;
                    linesSplittedToWords.remove(swearwords[j]);
                }
            }
        }
        return swearwordsCount;

    }


}


