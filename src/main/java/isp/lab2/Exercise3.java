package isp.lab2;

public class Exercise3 {

    public static boolean isPrimeNumber(final int number) {
        throw new UnsupportedOperationException();
    }

    public static int[] getPrimeNumbersFromInterval(int a, int b) {
    // TODO: Use isPrimeNumber(final int number)
        throw new UnsupportedOperationException();
    }

    public static double calculateGeometricMean(int[] primeNumbers) {
        throw new UnsupportedOperationException();
    }

    public static int numberOfPNWithEvenSumOfDigits(int[] primeNumbers) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        System.out.println("The geometric mean is: " + calculateGeometricMean(getPrimeNumbersFromInterval(a, b)));
        System.out.println("The number of prime numbers which have the sum of digits an even number is: " + numberOfPNWithEvenSumOfDigits(getPrimeNumbersFromInterval(a, b)));
    }
}
