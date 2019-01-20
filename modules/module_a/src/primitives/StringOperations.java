package primitives;

public class StringOperations {

    public static void main(String[] args) {

        String sourceText = "[Its] language is as bare as a monk's cell, and as uninviting";
        String computedText = computeThoughts(sourceText);
        System.out.println(computedText);
    }


    /**
     * Metoda computeThoughts wykonuje przekształcenie przekazanej myśli do nowej, lepszej postaci.
     *
     * UWAGA: Szczegóły implementacyjne:
     *
     * Krok 1:  Znajduje w przekazanym parametrze pierwsze słowo zaczynające się na literę 'i'.
     * Krok 2.  Wycina znalezione słowo z całości tekstu do późniejszego użycia.
     * Krok 3.  Oblicza długość tego słowa, zwiększa ją czterokrotnie i dodaje do niej 1. Wyliczona wartość
     *          zostaje zapamiętana do późniejszych obliczeń.
     * Krok 4.  Znajduje w tekście pierwsze wystąpienie znaku `l` i wycina z tekstu fragment od tego znaku (włącznie)
     *          i kolejne X znaków (niewłącznie), gdzie X jest równe wartoći wyliczonej w Krok 3.
     * Krok 5.  Oblicza długość całego tekstu, dzieli ją przez 1.17 i zwiększa o 1. Wyliczona wartość zostaje
     *          zapamiętana do późniejszych obliczeń.
     * Krok 6.  Wycina z tekstu fragment zaczynający się od indeksu o wartości Y, gdzie Y, to wartość obliczona
     *          w Kroku 5, oraz kolejnych 2^3 znaków.
     * Krok 7. Zwraca połączenie tekstu "Java ", tekstu z Kroku 4., tekstu z Kroku 2.., tekstu " ", tekstu z Kroku 6.
     oraz tekstu " \u003B\u0029".
     */
    public static String computeThoughts(String source) {
        // Tutaj uzupełnij implementację, aby była zgodną z algorytmem w dokumentacji metody.
    }

}