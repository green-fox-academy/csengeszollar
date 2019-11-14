import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class logs {
    public static void main(String[] args) {

// Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

        Path filePath = Paths.get("src/log.txt");
        List<String> log = new ArrayList<>();

        try {
            log = Files.readAllLines(filePath);
            List<String> IPAddressesWithDuplicates = new ArrayList<>();
            for (int i = 0; i < log.size(); i++) {
                String[] splittedLogLines = log.get(i).split(" ");
                // minden 8. lesz egy IP cim
                    System.out.println(splittedLogLines[8]);
                    IPAddressesWithDuplicates.add(splittedLogLines[8]);
                Set<String> uniqueIPAddresses = new HashSet<String>(IPAddressesWithDuplicates);




            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }




    }
}
