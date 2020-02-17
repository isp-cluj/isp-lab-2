package isp.lab2;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Exercise7Test {

    @Test
    public void testGenerateARandom() {
        int aRandom = Exercise7.generateARandom();
        assertTrue(aRandom >= 0 && aRandom <= 7);
    }
}
