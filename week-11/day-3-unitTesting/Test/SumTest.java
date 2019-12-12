import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumTest {
    private Sum sum;
    private ArrayList<Integer> numberList;

    @Before
    public void init() {
        sum = new Sum();
        numberList = new ArrayList<>();
    }

    @Test
    public void sum_addingNumbers() throws ListDoesNotExistException {
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);

        int expectedResult = 1 + 2 + 3 + 4;
        int result = sum.sum(numberList);

        assertEquals(expectedResult, result);
    }

    @Test
    public void sum_withEmptyList() throws ListDoesNotExistException {
        int expectedResult = 0;
        int result = sum.sum(numberList);

        assertEquals(expectedResult, result);
    }

    @Test
    public void sum_withNegativeNumbers() throws ListDoesNotExistException {
        numberList.add(-3);
        numberList.add(7);
        numberList.add(-2);

        int expectedResult = 2;
        int result = sum.sum(numberList);

        assertEquals(expectedResult, result);
    }

    @Test
    public void sum_withZero() throws ListDoesNotExistException {
        numberList.add(0);
        numberList.add(3);
        numberList.add(0);

        int expectedResult = 3;
        int result = sum.sum(numberList);

        assertEquals(expectedResult, result);
    }

    @Test
    public void sum_withNull() throws ListDoesNotExistException {
        numberList.add(null);
        numberList.add(1);
        numberList.add(2);

        int expectedResult = 3;
        int result = sum.sum(numberList);

        assertEquals(expectedResult, result);
    }

    @Test(expected = ListDoesNotExistException.class)
    public void sum_NumbersOfNonExistentList() throws ListDoesNotExistException {
        sum.sum(null);
    }


}