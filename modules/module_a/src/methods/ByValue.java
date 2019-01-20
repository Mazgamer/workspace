package methods;

public class ByValue {

    public static void main(String[] args) {
        int a = 10;
        increase(a);
        System.out.println(a);                                  // Wyświetli:

        int b = 10;
        b = increaseAndGet(b);
        System.out.println(b);                                  // Wyświetli:

        String str1 = "Java";
        replaceWith(str1, "Other");
        System.out.println(str1);                               // Wyświetli:

        String str2 = "Java";
        str2 = replaceWithAndGet(str2, "Other");
        System.out.println(str2);                               // Wyświetli:

        StringBuilder sb1 = new StringBuilder("Start text");
        updateWith(sb1, " more text");
        System.out.println(sb1);                                // Wyświetli:

        StringBuilder sb2 = new StringBuilder("Start text");
        sb2 = updateWithAndGet(sb2, " more text");
        System.out.println(sb2);                                // Wyświetli:
    }

    private static StringBuilder updateWithAndGet(StringBuilder sb, String textToAppend) {
        sb.append(textToAppend);
        return sb;
    }

    private static void updateWith(StringBuilder sb, String textToAppend) {
        sb.append(textToAppend);
    }

    private static String replaceWithAndGet(String toReplace, String replacement) {
        toReplace = replacement;
        return toReplace;
    }

    private static void replaceWith(String toReplace, String replacement) {
        toReplace = replacement;
    }

    private static int increaseAndGet(int val) {
        val++;
        return val;
    }

    private static void increase(int a) {
        a++;
    }
}
