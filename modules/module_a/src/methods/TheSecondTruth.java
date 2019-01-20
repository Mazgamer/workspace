package methods;

public class TheSecondTruth {

    private int firstVal;
    private int secondVal;

    public static void main(String[] args) {
        // Tutaj użyj każdej z metod i wyświetl ich wyniki
    }

    TheSecondTruth(int firstVal, int secondVal) {
        this.firstVal = firstVal;
        this.secondVal = secondVal;
    }

    private int objectCompare(TheSecondTruth other) {
        if (this.firstVal + this.secondVal > other.firstVal + other.secondVal) {
            return 1;
        }
        else if (this.firstVal + this.secondVal < other.firstVal + other.secondVal) {
            return -1;
        }
        else {
            return 0;
        }
    }

    private static int staticCompare(TheSecondTruth first, TheSecondTruth other) {
        if (first.firstVal + first.secondVal > other.firstVal + other.secondVal) {
            return 1;
        }
        else if (first.firstVal + first.secondVal < other.firstVal + other.secondVal) {
            return -1;
        }
        else {
            return 0;
        }
    }

    private static int staticSum(TheSecondTruth first, TheSecondTruth second) {
        return first.firstVal + second.secondVal;
    }

    private int objectMultiply(TheSecondTruth other) {
        return this.secondVal * other.secondVal;
    }
}
