import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex6StringUppercase {
    public static void main(String[] args) {
//        String testString = "jgJGJHgjaHGSJGDJBKKJjhdakjshdk";
//        Arrays.asList(testString)
//                .stream()
//                .map()

        String testString = "jgJGJHgjaHGSJGDJBKKJjhdakjshdk".chars()
                .filter(Character::isUpperCase)
                .mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.joining());
        System.out.println(testString);


    }
}
