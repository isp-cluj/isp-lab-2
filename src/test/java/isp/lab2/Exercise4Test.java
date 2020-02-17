package isp.lab2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise4Test {

    int[] someNumbers = new int[]{15, 18, 13, 22, 21, 11, 57, 141, 563, 16};

    @Test
    public void testFirstOdd() {
        assertEquals(15, Exercise4.firstOdd(someNumbers));
    }

    @Test
    public void testFirstEven() {
        assertEquals(18, Exercise4.firstOdd(someNumbers));
    }

    @Test
    public void testFirstPrime() {
        assertEquals(13, Exercise4.firstOdd(someNumbers));
    }
}
