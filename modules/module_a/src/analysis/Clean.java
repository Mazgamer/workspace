package analysis;

import java.util.Random;

public class Clean {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] numbers2 = new int[10];

        fillWithRandomNumbersFromOneToHundred(numbers);
        fillWithRandomNumbersFromOneToHundred(numbers2);

        int dividableBy = getRandomNumberFromOneToTen();
        int[] sums = getSumsOfArraysValuesDividableBy(numbers, numbers2, dividableBy);

        showNonZeroSums(sums);

    }

    private static void fillWithRandomNumbersFromOneToHundred(int[] array) {
        for (int i = 0; i < array.length; i++) {
            Random r = new Random();
            array[i] = 1 + r.nextInt(100);
        }
    }

    private static int getRandomNumberFromOneToTen() {
        return 1 + new Random().nextInt(10);
    }

    private static int[] getSumsOfArraysValuesDividableBy(int[] firstArray, int[] secondArray, int dividableBy) {
        int[] sumsOfDividableValues = new int[10];
        for (int i = 0; i < firstArray.length && i < secondArray.length; i++) {
            if (areValuesDividableBy(firstArray[i], secondArray[i], dividableBy)) {
                sumsOfDividableValues[i] += firstArray[i] + secondArray[i];
            }
        }
        return sumsOfDividableValues;
    }

    private static boolean areValuesDividableBy(int firstValue, int secondValue, int dividableBy) {
        return firstValue % dividableBy == 0 ||
                secondValue % dividableBy == 0 ||
                (firstValue + secondValue) % dividableBy == 0;
    }

    private static void showNonZeroSums(int[] sums) {
        for (int sum : sums) {
            if (sum != 0) {
                System.out.println("Sum: " + sum);
            }
        }
    }
}
