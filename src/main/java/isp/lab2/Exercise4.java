package isp.lab2;

public class Exercise4 {

    public static boolean isPrimeNumber(final int number) {
        throw new UnsupportedOperationException();
    }

    public static int firstOdd(int[] someNumbers) {
        throw new UnsupportedOperationException();
    }

    public static int firstEven(int[] someNumbers) {
        throw new UnsupportedOperationException();
    }

    public static int firstPrime(int[] someNumbers) {
        // TODO: Use isPrimeNumber(final int number)
        throw new UnsupportedOperationException();
    }

    /**
     * Don't forget to also display the position of ech number
     */
    public static void main(String[] args) {
        int[] someNumbers = new int[]{15, 18, 13, 22, 21, 11, 57, 141, 563, 16};

        System.out.println("First odd number: " + firstOdd(someNumbers));
        System.out.println("First even number: " + firstEven(someNumbers));
        System.out.println("First prime number: " + firstPrime(someNumbers));
    }
}
