import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt


        Path filePath = Paths.get("src/reversed-order.txt");
        List<String> reversedOrder = new ArrayList<>();

        try {
            reversedOrder = Files.readAllLines(filePath);
            int lastLine = reversedOrder.size() - 1;
            for (int i = lastLine; i >= 0; i--) {
                System.out.print(reversedOrder.get(i));
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(" ");
        }


    }
}
