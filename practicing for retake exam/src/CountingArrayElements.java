import java.util.HashMap;
import java.util.Map;

public class CountingArrayElements {
    public static void main(String[] args) {
        int [] numbers = {3, 5, 6, 3, 1, 1, 5};
        elementCounter(numbers);
    }
    public static void elementCounter(int[] numbers) {
        HashMap<Integer, Integer> numberCounts = new HashMap<>();

        for (int i = 0; i < numbers.length ; i++) {
            int number = numbers[i];
            if (!numberCounts.containsKey(number)) {
                numberCounts.put(number, 1);
            } else {
                numberCounts.replace(number, numberCounts.get(number) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> numbercount : numberCounts.entrySet()) {
            System.out.println(numbercount.getKey() + " : " + numbercount.getValue());
        }
    }
}
