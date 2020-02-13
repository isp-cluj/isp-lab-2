package lab.template;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Exercise1Test {

    @Test
    public void testGetAnIntFromKeyboard() {
        int result = Exercise1.getAnIntFromKeyboard();
        assertTrue(result >= 2 && result <= 10);
    }

    @Test
    public void testGenerateRandomValues() {
        int[] result = Exercise1.generateRandomValues();
        assertTrue(result.length >= 2 && result.length <= 10);
    }

}
