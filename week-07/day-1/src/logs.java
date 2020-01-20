import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

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
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        findUniqueIP(log);
        calculateRatio(log);
    }

    public static void findUniqueIP(List<String> log) {
        List<String> IPAddressesWithDuplicates = new ArrayList<>();
        for (int i = 0; i < log.size(); i++) {
            String[] splittedLogLines = log.get(i).split(" ");
            // minden 8. lesz egy IP cim
//            System.out.println(splittedLogLines[8]);
            IPAddressesWithDuplicates.add(splittedLogLines[8]);
        }
        Set<String> uniqueIPAddresses = new HashSet<String>(IPAddressesWithDuplicates);
        String[] uniqueIPAddressList = new String[uniqueIPAddresses.size()];
        uniqueIPAddressList = uniqueIPAddresses.toArray(uniqueIPAddressList);
        System.out.println(Arrays.toString(uniqueIPAddressList));
    }


    public static void calculateRatio(List<String> log) {

        int numberOfGET = 0;
        int numberOfPOST = 0;

        for (int i = 0; i < log.size(); i++) {

            if (log.get(i).contains("GET")) {
                numberOfGET += 1;
            } else if (log.get(i).contains("POST")) {
                numberOfPOST += 1;
            }
        }
        System.out.println(numberOfGET + " / " + numberOfPOST);
    }
}
