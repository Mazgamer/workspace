package primitives;

public class FormatsConverter {

    public static void main(String[] args) {

        assert convertTo(128, 2).equals("0000000010000000") : "Nieprawidłowa wartość dla 128 przy podstawie 2";
        assert convertTo(128, 3).equals("0000000000011202") : "Nieprawidłowa wartość dla 128 przy podstawie 3";
        assert convertTo(128, 5).equals("0000000000001003") : "Nieprawidłowa wartość dla 128 przy podstawie 5";
        assert convertTo(128, 21).equals("0000000000000062") : "Nieprawidłowa wartość dla 128 przy podstawie 21";

    }

    private static String convertTo(int value, int base) {
        // Dostarcz prawidłową implementację
        return "";
    }
}
