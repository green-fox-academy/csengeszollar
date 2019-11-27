import sun.font.DelegatingShape;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonCharacters {
    public static void main(String[] args) {
        Path filePath = Paths.get("src/countChar.txt");
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("File does not exist!");
        }

        System.out.println(mostCommonChar(lines));
    }
    public static HashMap mostCommonChar(List<String> lines) {
        for (int i = 0; i < lines.size(); i++) {
            String[] linesLetters = lines.get(i).split("");

        }
        HashMap<String, Integer> letterCounts = new HashMap<>();
        for (int i = 0; i < lines.size(); i++) {
            String[] linesLetters = lines.get(i).split("");

            for (int j = 0; j < linesLetters.length; j++) {
                String letter = linesLetters[j];
                if (!letterCounts.containsKey(letter)) {
                    letterCounts.put(letter, 1);
                } else {
                    letterCounts.replace(letter, letterCounts.get(letter) + 1);
                }
            }
        }
       // System.out.println(letterCounts);
        int biggestCount = 0;
        String mostCommonLetter = "";
        int secondBiggestCount = 0;
        String secondMostCommonLetter = "";
        for (Map.Entry<String, Integer> letterCount : letterCounts.entrySet()) {
            if (biggestCount < letterCount.getValue()) {
                biggestCount = letterCount.getValue();
                mostCommonLetter = letterCount.getKey();
            } else if (secondBiggestCount < biggestCount && secondBiggestCount < letterCount.getValue()) {
                secondBiggestCount = letterCount.getValue();
                secondMostCommonLetter = letterCount.getKey();
            }
        }
        HashMap<String, Integer> mostCommonLetters = new HashMap<>();
        mostCommonLetters.put(mostCommonLetter, biggestCount);
        mostCommonLetters.put(secondMostCommonLetter, secondBiggestCount);

        return mostCommonLetters;
    }

}


