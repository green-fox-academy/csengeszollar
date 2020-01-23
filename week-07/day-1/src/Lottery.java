import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Lottery {
    public static void main(String[] args) {
        // Create a method that find the 5 most common lottery numbers in lottery.csv
        String fileName = "src/lottery.txt";
        Path filePath = Paths.get(fileName);
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("Unable to read file: my-file.txt");
        }


        List<String> lotteryNumbers = new ArrayList<>();
        for (int i = 0; i < lines.size() ; i++) {
            String[] splittedLines = lines.get(i).split(";");
            lotteryNumbers.add(splittedLines[11]);
            lotteryNumbers.add(splittedLines[12]);
            lotteryNumbers.add(splittedLines[13]);
            lotteryNumbers.add(splittedLines[14]);
            lotteryNumbers.add(splittedLines[15]);
        }
        HashMap<String, Integer> numbersMap = new HashMap<>();
        for (int i = 0; i < lotteryNumbers.size() ; i++) {
            String oneNumber = lotteryNumbers.get(i);
            if(numbersMap.containsKey(oneNumber)){
                numbersMap.replace(oneNumber, numbersMap.get(oneNumber) +1);
            } else {
                numbersMap.put(oneNumber, 1);
            }
        }

        String tempKey = "";
        Integer tempValue = 0;
        for (int i = 0; i < 5; i++) {
            for (Map.Entry<String, Integer> entry : numbersMap.entrySet()){
                if(entry.getValue() == Collections.max(numbersMap.values())) {
                    tempKey = entry.getKey();
                    tempValue = entry.getValue();
                    break;
                }
            }
            numbersMap.remove(tempKey, tempValue);
            System.out.printf("Number %s was found %d times. \n", tempKey, tempValue);
        }
        System.out.println(numbersMap);







    }
}