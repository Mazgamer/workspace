package analysis;

import java.util.Random;

public class Ugly {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        int[] numbers2 = new int[10];
        methodA(numbers);
        int abc = -7;
        for (;abc < numbers2.length - 7; abc++) {
        Random megaRandomizer = new Random();
        int ff = megaRandomizer.nextInt(100) + 1;
        numbers[abc + 7] = ff;}
        int x = new Random().nextInt(10);
        int[] numbers3 = count(numbers, numbers2, x);
        for (int y : numbers3)
        System.out.println("Sum: " + y);

    }

private static int[] count(int[] a1, int[] a2, int a3) {
int[] a1a2 = new int[10];
    for (int x = 0; x < a1.length && x < a2.length; x++) {
if (a1[x] % a3 == 0 || a2[x] % a3 == 0 || ((a1[x] + a2[x]) % a3 == 0)) a1a2[x] += a1[x] + a2[x];
    }
return a1a2;
}

    private static void methodA(int[] a) {
        for (int abc=0;abc<a.length;abc++) {
            Random r=new Random();a[abc]=r.nextInt(101);
        }
    }




}
