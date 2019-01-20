package vars;

import java.util.Objects;

public class ReferencesVariables {

    public static void main(String[] args) {
        StringBuilder a, b, c = new StringBuilder();
        a = b = c;
        b = c = a;
        c = a = b;

        b = new StringBuilder("Clojure");

        c = new StringBuilder("Clojure");

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

        a = b;
        a.append(" more ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        b.append(" less ");
        System.out.println("b: " + b);
        System.out.println("a: " + a);

        System.identityHashCode();
    }
}
