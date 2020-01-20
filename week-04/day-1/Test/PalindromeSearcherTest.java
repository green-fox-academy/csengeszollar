import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PalindromeSearcherTest {

    @Test
    public void findPalindromes_givenCorrectText_shouldReturnListWithPalindromes() {
        String text ="cofeffe";
        assertFalse(PalindromeSearcher.findPalindromes(text).isEmpty());
        assertEquals(2,PalindromeSearcher.findPalindromes(text).size());
        assertEquals("fef", "efe",PalindromeSearcher.findPalindromes(text));
        assertEquals(Arrays.asList("fef", "efe"), PalindromeSearcher.findPalindromes(text));
    }
     @Test
     public void findPalindromes_givenNull_shouldReturnListWithPalindromes()
    String = null;
}