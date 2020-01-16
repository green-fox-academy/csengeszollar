
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {

    @Test
    public void countLetters_IsWorking() throws Exception {
        String word = "raccoon";

        HashMap<String, Integer> expectedResult = new HashMap<>();

        expectedResult.put("r", 1);
        expectedResult.put("a", 1);
        expectedResult.put("c", 2);
        expectedResult.put("o", 2);
        expectedResult.put("n", 1);

        assertEquals(expectedResult, CountLetters.countLetters(word));
    }

    @Test(expected = Exception.class)
    public void countLetters_shouldThrowExceptionWhenStringdoesntExist() throws Exception {
        CountLetters.countLetters(null);
    }

    @Test
    public void countLetters_ShouldWorkWithMoreWordsInAString() throws Exception {
        String sentence = "The exam isn't hard!";
        HashMap<String, Integer> expectedResult = new HashMap<>();
        expectedResult.put("T", 1);
        expectedResult.put("t", 1);
        expectedResult.put("h", 2);
        expectedResult.put("e", 2);
        expectedResult.put(" ", 3);
        expectedResult.put("x", 1);
        expectedResult.put("a", 2);
        expectedResult.put("m", 1);
        expectedResult.put("i", 1);
        expectedResult.put("s", 1);
        expectedResult.put("n", 1);
        expectedResult.put("'", 1);
        expectedResult.put("r", 1);
        expectedResult.put("d", 1);
        expectedResult.put("!", 1);

        assertEquals(expectedResult, CountLetters.countLetters(sentence));
    }

    @Test (expected = Exception.class)
    public void letterCounter_shouldReturnEmptyMap_when_StringIsEmpty() throws Exception{
        String text = "";

        HashMap<String, Integer> expectedResult = new HashMap<String, Integer>(){{}};

        assertEquals(expectedResult, CountLetters.countLetters(text));
    }
}