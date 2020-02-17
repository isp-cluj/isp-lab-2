package isp.lab2;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Exercise3Test {
    List<Integer> primeNumbers = new ArrayList<>(15);
    int[] myPN = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};

    @Before
    public void prepareTests() {
        for (int value : myPN) {
            primeNumbers.add(value);
        }
    }

    @Test
    public void testPrimeNumbers() {
        List<Integer> primeNumbers = Exercise3.getPrimeNumbersFromInterval(0, 50);
        assertEquals(15, primeNumbers.size());
        for (int i = 0; i < myPN.length; i++) {
            assertTrue(primeNumbers.contains(myPN[i]));
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
