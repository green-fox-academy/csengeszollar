import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordReverserTest {

    @Test
    public void reverserShouldReverseTheWordsInTheGivenSentence() {
        String sentence = "lleW ,enod taht saw ton taht drah";
        String expectedResult = "Well done, that was not that hard";

        String result = WordReverser.reverser(sentence);

        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void reversShouldReverseTheWordIfSentenceContainsOnlyOneWord(){
        String sentence = "lleW";
        String expectedResult = "Well";

        String result = WordReverser.reverser(sentence);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void reversShouldReverseTheWordIfStringIsEmpty(){
        String sentence = "";
        String expectedResult = "";

        String result = WordReverser.reverser(sentence);
        Assert.assertEquals(expectedResult, result);
    }




}