package isp.lab2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise3Test {
    int[] primeNumbers = new int[15];
    int[] myPN = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};

    @Before
    public void prepareTests() {
        for (int i = 0; i < myPN.length; i++) {
            primeNumbers[i] = myPN.length;
        }
    }

    @Test
    public void testIsPrimeNumber() {
        assertTrue(Exercise3.isPrimeNumber(17));
        assertFalse(Exercise3.isPrimeNumber(20));
    }

    @Test
    public void testPrimeNumbers() {
        int[] primeNumbers = Exercise3.getPrimeNumbersFromInterval(0, 50);
        assertEquals(15, primeNumbers.length);
        for (int i = 0; i < myPN.length; i++) {
            assertEquals(primeNumbers[i], myPN[i]);
        }
    }

    @Test
    public void testCalculateGeometricMean() {
        assertEquals(15, Math.round(Exercise3.calculateGeometricMean(primeNumbers)));
    }

    @Test
    public void test3rdMethod() {
        assertEquals(7, Exercise3.numberOfPNWithEvenSumOfDigits(primeNumbers));
    }
}
