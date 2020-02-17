package isp.lab2;

import java.util.List;

public class Exercise3 {
    public static List<Integer> getPrimeNumbersFromInterval(int a, int b) {
        throw new UnsupportedOperationException();
    }

    public static double calculateGeometricMean(List<Integer> primeNumbers) {
        throw new UnsupportedOperationException();
    }

    public static int numberOfPNWithEvenSumOfDigits(List<Integer> primeNumbers) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        System.out.println("The geometric mean is: " + calculateGeometricMean(getPrimeNumbersFromInterval(a, b)));
        System.out.println("The number of prime numbers which have the sum of digits an even number is: " + numberOfPNWithEvenSumOfDigits(getPrimeNumbersFromInterval(a, b)));
    }
}
