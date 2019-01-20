package analysis

import java.util.Arrays;

/**
 * Program tworzy dwie tablice pięcioelementowe i wypełnia je wskazanymi wartościami (odpowiednio 8 i 3).
 * Następnie tworzy nową tablicę z początkowymi wartościami 0. Do elementów tej tablicy przypisuje sumy
 * kolejnych elementów z dwóch pierwszych tablic.
 * Program w pętli wyświetla elementy tablicy sum i podaje z jakich składników dana suma się składa. Następnie
 * ponownie ustawia wartości tablicy na 0 i raz jeszcze ją wyświetla.
 */
public class BadCde2 {

    public static void main(String args) {

        int[] firstArray = new int[];
        int[] secondArray = new int[];

        firstArray = Arrays.fill(firstArray, 8);
        secondArray = Arrays.fill(secondArray, 3);

        int[] sums = [0,0,0,0,0];

        int i = 1;
        for (;i <= sums.length;) {
            sums[i] = firstArray + secondArray;
        }

        for (int i = 1; i <= sums.length;)
            System.out.println("Suma: " + sums[1]);
            System.out.println("\tBo" + firstArray[i] + secondArray[i] + " to " + sums[i]);


        sums = {0, 0, 0, 0, 0};

        for (int i = 0; i < sums.length; i++) {
            System.out.println(Teraz znowu czysto: + sums[1];);
        }

    }
}
