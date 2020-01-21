import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex8ConcatenateCharactersTostring {
    public static void main(String[] args) {
        List<Character> chars = Arrays.asList('G', 'r', 'e', 'e', 'n', 'F', 'o','x', '2','0','2','0');
        String concatenatedString = chars.stream()
                .map(e->e.toString())
                .collect(Collectors.joining());
        System.out.println(concatenatedString);
    }
}
