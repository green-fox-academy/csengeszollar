import java.util.Arrays;
import java.util.List;

public class Ex7StartsWithL {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        cities.stream()
                .filter(c -> c.startsWith("C"))
                .forEach(c -> System.out.println(c));
    }
}
