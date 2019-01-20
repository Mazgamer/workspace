package methods;

public class VoidNotVoid {

    public static void main(String[] args) {

        int a = randomVal();
        String s = show();
        System.out.println(show());

        nextVal(10);
        int val = nextVal(10);
        System.out.println(nextVal(100));

        System.out.println(nextVal(randomVal()));

        a = conditionalVal(21);
    }

    private static int conditionalVal(int val) {
        if (val % 2 == 0) {
            return 0;
        }
    }

    private static int nextVal(int i) {
        return i + 1;
    }

    private static void show() {
        String s = "Jakiś tekst";
    }

    private static int randomVal() {
        System.out.println("Generuje wartość domyślną");
    }
}
