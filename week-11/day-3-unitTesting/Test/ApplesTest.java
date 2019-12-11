import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTest {
//    private static Apples apple;
//
//    @Before
//    public void init() {
//        apple = new Apples();
//    }

    @Test
    public void getApple_shouldReturn_theString_apple() {
        Apples apples = new Apples();
        String result = apples.getApple();
        String expected = "apple";
        assertEquals(expected, result);
    }
}