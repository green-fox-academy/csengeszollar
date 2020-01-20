import com.sun.xml.internal.xsom.XSUnionSimpleType;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2SquareOfPositiveNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);

        List<Integer> newNumbers = numbers.stream()
                .filter(number -> number >= 0)
                .map(number -> (int) Math.pow(number, 2))
                .collect(Collectors.toList());
        System.out.println(newNumbers);
    }
}
