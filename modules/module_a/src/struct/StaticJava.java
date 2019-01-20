package struct;

public class StaticJava {

    public static void main(String[] args) {
        System.out.println("From static main");
    }

    static {
        System.out.println("From static block");
    }

}
