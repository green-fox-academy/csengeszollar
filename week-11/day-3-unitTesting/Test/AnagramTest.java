import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {
    private String a;
    private String b;

    @Before
    public void init() {

    }

    @Test
    public void isItAnagram() {
         a = "vako lat";
         b = "lovakat";

         assertFalse(Anagram.isItAnagram(a, b));


//        boolean expected = true;
//        boolean result = Anagram(a, b);

    }



}