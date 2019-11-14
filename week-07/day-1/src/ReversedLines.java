import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt

        String file = "src/reversed-lines.txt";
        reversingLines(file);

//        Path filePath = Paths.get("src/reversed-lines.txt");
//        List<String> reversedLines = new ArrayList<>();
//        try {
//            reversedLines = Files.readAllLines(filePath);
//            for (int i = 0; i < reversedLines.size(); i++) {
//                int indexOfLastChar = reversedLines.get(i).length() - 1;
//                for (int j = indexOfLastChar; j >= 0 ; j--) {
//                    System.out.print(reversedLines.get(i).charAt(j));
//                }
//                System.out.println();
//            }
//
//            } catch (IOException ex) {
//            ex.printStackTrace();
//        }

    } public static void reversingLines (String fileName) {
        Path filePath = Paths.get(fileName);
        List<String> reversedLines = new ArrayList<>();

        try {
            reversedLines = Files.readAllLines(filePath);
            for (int i = 0; i < reversedLines.size(); i++) {
                int indexOfLastChar = reversedLines.get(i).length() - 1;
                for (int j = indexOfLastChar; j >= 0 ; j--) {
                    System.out.print(reversedLines.get(i).charAt(j));
                }
                System.out.println();
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }


    }
}
