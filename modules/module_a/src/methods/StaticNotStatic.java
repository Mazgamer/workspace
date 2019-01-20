package methods;

public class StaticNotStatic {

    private static int staticField;
    private int nonStaticFieldOne;
    private String nonStaticFieldTwo = "Non-static";
    private static boolean print = true;

    public static void main(String[] args) {
        staticPrint();
        nonStaticPrint();
    }

    private void nonStaticPrint() {
        System.out.println(nonStaticFieldOne);
        System.out.println(nonStaticFieldTwo);
        if (print) {
            print = false;
            staticPrint();
        }
    }

    private static void staticPrint() {
        System.out.println(staticField);
        System.out.println(nonStaticFieldOne);
        System.out.println(nonStaticFieldTwo);
    }
}
