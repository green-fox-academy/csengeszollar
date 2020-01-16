import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class WeeklyFeedbackEvaluator {
    public static void main(String[] args) {
        Path filePath = Paths.get("src/weeklyFeedbackEv.txt");
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(filePath);
        } catch (
                IOException e) {
            System.out.println("File does not exist!");
        }

        evaluator(lines);
    }

    public static HashMap evaluator(List<String> lines) {
        int matReview = 0;
        int presSkills = 0;
        int helpfulness = 0;
        int explanation = 0;

        for (int i = 0; i < lines.size(); i++) {
            String[] splittedLines = lines.get(i).split(" ");
//            System.out.println(Arrays.toString(splittedLines));
            matReview += Integer.parseInt(splittedLines[0]);
            presSkills += Integer.parseInt(splittedLines[1]);
            helpfulness += Integer.parseInt(splittedLines[2]);
            explanation += Integer.parseInt(splittedLines[3]);
        }
        float averageOfMatReview = (float) matReview / lines.size();
        float averageOfPresSkills = (float) presSkills / lines.size();
        float averageOfHelpfulness = (float) helpfulness / lines.size();
        float averageOfExplanation = (float) explanation / lines.size();

        HashMap<String, Float> evaluationMap = new HashMap<String, Float>();
        evaluationMap.put("matReview", averageOfMatReview);
        evaluationMap.put("presSkills", averageOfPresSkills);
        evaluationMap.put("helpfulness", averageOfHelpfulness);
        evaluationMap.put("explanation", averageOfExplanation);

        for (Map.Entry<String, Float> average : evaluationMap.entrySet()) {
            System.out.printf("%s: %.2f\n", average.getKey(), average.getValue());
        } return evaluationMap;
    }

}




