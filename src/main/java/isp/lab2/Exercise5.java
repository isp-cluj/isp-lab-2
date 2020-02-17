package isp.lab2;

public class Exercise5 {

    public static int[] generateRandomNumbers() {
        throw new UnsupportedOperationException();
    }

    public static int[] getSortedNumbers(int[] randomNumbers) {
        throw new UnsupportedOperationException();
    }

    public static void main(String[] args) {
        int[] sortedNumbers = getSortedNumbers(generateRandomNumbers());
        for (int i = 0; i < sortedNumbers.length; i++) {
            System.out.print(sortedNumbers[i] + " ");
        }
    }
}
