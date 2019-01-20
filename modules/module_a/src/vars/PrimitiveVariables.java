package vars;

public class PrimitiveVariables {

    public static void main(String[] args) {
        int a, b, c = 10;
        b = c;
        a = 2 * b;

        c = 20;
        a = c + b;
        b = a;

        a = 50;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        a = a++;

        System.out.println("a: " + a);

        // a = b.add(c);
    }
}
