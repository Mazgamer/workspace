package methods;

public class Overloading {

    public static void main(String[] args) {
        info(false);
        info((byte) 13);
        info((short) 430);
        info('A');
        info(89000);
        info(123L);
        info(.3f);
        info(.3);
        info("Tekst");

        //info(new StringBuilder());
        //info(new File("."));
        //info(10,20);

        //info(32000);
        //int a = info('A');
    }

    private static void info(boolean val) {
        System.out.println("Show boolean val: " + val);
    }
}
