import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex9FrequencyOfCharacters {
    public static void main(String[] args) {

        String test = "Supercalifragilisticexpialidocious";

        Map<String, Long> charCount = Arrays.stream(test.toLowerCase().split(""))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        charCount.forEach((c, w) -> System.out.println(c + ":" + w));
    }
}
