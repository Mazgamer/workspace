package methods;

import java.util.Arrays;

public class TheOnlyTruth {

    public static void main(String[] args) {
        withMethod();
        withoutMethod();
        makeWithout();
        makeWith();
    }

    private static void withMethod() {
        int a = 0;
        int b = 5, c = 10;
        a = sum(b, c);
        System.out.println(a);

        b = 15;
        c = 20;
        a = sum(b, c);
        System.out.println(a);

        a = sum(1, 1);
        System.out.println(a);
    }

    private static void  withoutMethod() {
        int a = 0;
        int b = 5, c = 10;
        {
            int val1 = b;
            int val2 = c;

            a = val1 + val2;
        }
        System.out.println(a);

        b = 15;
        c = 20;
        {
            int val1 = b;
            int val2 = c;

            a = val1 + val2;
        }
        System.out.println(a);

        {
            int val1 = 1;
            int val2 = 1;

            a = val1 + val2;
        }
        System.out.println(a);
    }

    private static int sum(int val1, int val2) {
        return val1 + val2;
    }

    private static void makeWithout() {
        String text;
        text = trimAndUp(" Some example text   ");
        System.out.println(text);

        text = trimAndUp("Other TEXT TEXT TEXT ");
        System.out.println(text);

    }

    private static String trimAndUp(String base) {
        String trimmed = base.trim();
        String upped = trimmed.toUpperCase();
        return upped;
    }

    private static void makeWith() {
        int[] table;
        {
            int value = 10;
            int size = 20;

            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = value;
            }

            table = array;
        }
        System.out.println(Arrays.toString(table));


        int tValue = 5;
        int tSize = 50;
        {
            int value = tValue;
            int size = tSize;

            int[] array = new int[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = value;
            }

            table = array;
        }
        System.out.println(Arrays.toString(table));
    }
}
