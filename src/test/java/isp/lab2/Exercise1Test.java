package isp.lab2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Exercise1Test {

    @Test
    public void computeTheNumbersAndTheArithmeticalMean() {
        int[] inputVector = new int[]{3,4,5};
        assertEquals(4, Exercise1.computeTheNumbersAndTheArithmeticalMean(inputVector));
    }

}
