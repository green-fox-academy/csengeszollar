import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.List;


public class EndsWithS {
    public static void main(String[] args) {
        Path filePath = Paths.get("src/base.txt");
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("File does not exist!");
        }

        System.out.println(endingSCounter(lines));

    }


    public static int endingSCounter(List<String> lines) {
        int sumWordsEndingS = 0;
        for (int i = 0; i < lines.size(); i++) {
            String[] linesWords = lines.get(i).split(" ");
            for (int j = 0; j < linesWords.length; j++) {
                if ((linesWords[j].endsWith("s")) || (linesWords[j].endsWith("s,")) || (linesWords[j].endsWith("s.")) ) {
                    sumWordsEndingS++;
                }
            }
        }
        return sumWordsEndingS;

    }


}
