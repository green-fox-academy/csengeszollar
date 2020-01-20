import java.util.Arrays;
import java.util.List;

public class Ex3FindingSquaredValue {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
        numbers.stream()
                .map(num -> (int)Math.pow(num, 2))
                .filter(num -> num > 20)
                .forEach(num -> System.out.println(num));

    }
}
