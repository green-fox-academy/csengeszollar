import java.nio.file.Files;
        import java.nio.file.Path;
        import java.nio.file.Paths;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

public class CountLines {
    public static void main(String[] args) {
//        Path filePath = Paths.get("src/my-file.txt");
//        List<String> lines = new ArrayList<>();
//        try {
//            lines = Files.readAllLines(filePath);
//            System.out.println(lines.size());
//        } catch (Exception e) {
//
//        }
//
        String file = "my-file.txt";
        System.out.println(lineCounterFunction(file));
    }
    public static int lineCounterFunction (String fileName){
        Path filePath = Paths.get("src/my-file.txt");
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(filePath);
        } catch (Exception e) {
            System.out.println(0);
        }
        return lines.size();


    }
}

