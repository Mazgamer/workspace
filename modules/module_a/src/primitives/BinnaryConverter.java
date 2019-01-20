package primitives;

public class BinnaryConverter {

    public static void main(String[] args) {

        assert convertToBinnary(0).equals("0000000000000000") : "Nieprawidłowa wartość dla 0";
        assert convertToBinnary(8).equals("0000000000001000") : "Nieprawidłowa wartość dla 8";
        assert convertToBinnary(256).equals("0000000100000000") : "Nieprawidłowa wartość dla 256";
        assert convertToBinnary(32768).equals("1000000000000000") : "Nieprawidłowa wartość dla 32768";
        assert convertToBinnary(65535).equals("1111111111111111") : "Nieprawidłowa wartość dla 65535";

    }

    private static String convertToBinnary(int value) {
        // Dostarcz właściwą implementację
        return "";
    }
}
