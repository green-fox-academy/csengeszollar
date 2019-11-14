import com.sun.org.apache.xpath.internal.objects.XString;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"

        String name = "Bela";
        appendLineToFile(name);



    }
    public static void appendLineToFile (String addedLine) {
        Path filePath = Paths.get("src/my-file.txt");
        List<String> lines = new ArrayList<>();

        try {
            lines = Files.readAllLines(filePath);
            lines.add(addedLine);
            Files.write(filePath, lines);
        } catch (IOException e) {
            System.out.println("Unable to write file: my-file.txt");
        }

    }

}
