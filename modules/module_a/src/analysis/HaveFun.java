package analysis;

import java.util.Scanner;

public class HaveFun {
    
    private static final int LOWER_BOUND = 1;
    private static final int UPPER_BOUND = 1000;
    private static final int MOVES_NEEDED = (int) (Math.log(UPPER_BOUND - LOWER_BOUND) / Math.log(2));

	public static void main(String[] args) {
		
        System.out.println("Witaj w grze!");
        System.out.printf("Pomyśl o jakiejś liczbie od %d do %d\n", LOWER_BOUND, UPPER_BOUND);
        
        System.out.printf("Odgadnę Twoją liczbę w niewięcej jak %d ruchach!\n", MOVES_NEEDED);
        System.out.println("Startujemy!");
        
        int min = LOWER_BOUND;
        int max = UPPER_BOUND;
        int movesDo = 1;
        boolean play = true;
        Scanner scanner = new Scanner(System.in);
        do {
            int selected = (min + max) / 2;
            System.out.printf("Czy tą liczbą jest... %d ??\n", selected);
            System.out.print("Powiedz 'TAK', 'Mniej' lub 'Wiecej'");
            String decision = scanner.next();
            
            switch (decision.toUpperCase()) {
                case "TAK":
                    System.out.println("Zgadłem!");
                    System.out.printf("W %d ruchach, a więc nie więcej niż %d! Mówiłem! \n", movesDo, MOVES_NEEDED);
                    play = false;
                    break;
                case "MNIEJ":
                    max = selected - 1;
                    movesDo++;
                    break;
                case "WIECEJ":
                    min = selected + 1;
                    movesDo++;
                    break;
                default:
                    System.out.println("Nie rozumiem! Nie liczę tego ruchu!");
                    break;
            }
        } while (play);
        
        System.out.println("Dzięki za grę!");
    }
}