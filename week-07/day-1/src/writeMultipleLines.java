import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class writeMultipleLines {
    public static void main(String[] args) {
        // Create a function that takes 3 parameters: a path, a word and a number
// and is able to write into a file.
// The path parameter should be a string that describes the location of the file you wish to modify
// The word parameter should also be a string that will be written to the file as individual lines
// The number parameter should describe how many lines the file should have.
// If the word is 'apple' and the number is 5, it should write 5 lines
// into the file and each line should read 'apple'
// The function should not raise any errors if it could not write the file.

        String word = "szilva";
        int numberLinesInFile = 15;
       String filePath = "src/my-file.txt";
        writeInFile(filePath, word, numberLinesInFile);

   //     List<String> lines = new ArrayList<>();

//        System.out.println(lines.get(0));
//        try {
//            lines = Files.readAllLines(filePath);
//            for (int i = 0; i < numberLinesInFile; i++) {
//                lines.add(word);
//            }
//            Files.write(filePath, lines);
//        } catch (IOException e) {
//            System.out.println("Unable to write file: my-file.txt");
//        }

    }

    public static void writeInFile(String path, String word, int number) {

        Path filePath = Paths.get("src/my-file.txt");
        List<String> lines = new ArrayList<>();

        try {
            //lines = Files.readAllLines(filePath);
            for (int i = 0; i < number; i++) {
                lines.add(word);
            }
            Files.write(filePath, lines);

        } catch (IOException e) {
            System.out.println(" ");
        }


    }
}
