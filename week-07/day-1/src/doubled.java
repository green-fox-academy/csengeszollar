import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class doubled {

    public static void main(String[] args) {

        String filename = "src/Double.txt";

       decryptFunction(filename);

        // Create a method that decrypts the duplicated-chars.txt

//        Path filePath = Paths.get("src/Double.txt");
//        List<String> text = new ArrayList<>();
//        try {
//            text = Files.readAllLines(filePath);
//            for (int i = 0; i < text.size(); i++) {
//                for (int j = 0; j < text.get(i).length(); j+=2) {
//                    System.out.print(text.get(i).charAt(j));
//
////                 List<String>decrypted
////                    text.add()
////                Files.write(filePath, text);
//
//            }
//                //System.out.println(text.get(0));
//
//            }
//
//        } catch(Exception e) {
//            e.printStackTrace();
//                    System.out.println(" ");
//                }
//
            }

            public static void decryptFunction (String fileName) {
                Path filePath = Paths.get(fileName);
                try {
                    List<String> text = new ArrayList<>();
                    text = Files.readAllLines(filePath);
                    for (int i = 0; i < text.size(); i++) {
                        for (int j = 0; j < text.get(i).length(); j += 2) {
                            System.out.print(text.get(i).charAt(j));
                        }
                        System.out.println();
                    }
                } catch(IOException e) {
                    e.printStackTrace();
                    System.out.println(" ");
                }


            }

//






//    }
//    public static void doubleOut (String path, String text ) {
//        Path filePath = Paths.get("src/Double.txt");
//        try {
//            for (int i = 0; i < text.length(); i++) {
//                System.out.println(i+1);
//
//                text.add(text.charAt(i+1));
//                Files.write(filePath, text);
//            }


    }
