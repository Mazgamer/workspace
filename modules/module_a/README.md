# Moduł 1. Podstawy: kompilator, maszyna wirtualna, wartości, zmienne i metody

Naszym wspólnym zadaniem jest przygotowanie Cię do pracy z kodem źródłowym języka Java. Co rozumiem, przez
pojęcie przygotowanie? W całej nauce języka Java spotkasz się z milionami linii kodu napisanego przez innych programistów,
z czego malutki fragment będzie też Twoim kodem. Nie ma znaczenia kto ten kod napisał, jakie jest jego przeznaczenie, 
do czego służy lub miał służyć. Nikt nie musi Ci tego wszystkiego wytłumaczyć, jeżeli potrafisz przeczytać kod. 
Kod jest bewzględnie jednoznaczny - nie ma w nim miejsca na intencje autora, kontekst, grę słów, tło polityczne czy kulturalne. 
Każda linia kodu, każda instrukcja, robi jedną i zawsze tą samą rzecz. Wykonuje to samo działanie. Piękno kodu i piękno 
programowania, w dużej mierze, kryje się w bezwzględności. Jakby było zaplanowane dużo wcześniej i wpisane w całą 
bezwzględną naturę świata.

**Są dwa elementy, które wystąpią w każdym fragmencie kodu: zmienne i metody.**
Zmienne są sposobem na przechowywanie informacji w pamięci komputera. Informację potrzebujemy przechowywać, aby ją
przetwarzać. Przetwarzamy w zgodzie z Twoim kodem, Twoimi instrukcjami. Metody są nazwanym i sparametryzowanym fragmentem 
kodu. Dają możliwość wielokrotnego użycia. 
Zarówno zmienne jak i metody są niezbędne aby pisać kod, aby tworzyć programy.

Celem tej sekcji jest, aby definicje zmiennych i metod były dla Ciebie absolutnie przejrzysta, a praca z nimi
czynnością naturalną.

---

## Sekcja 1 - Środowisko Java
> Nauczysz się podstaw korzystania z najważniejszych narzędzi środowiska JDK: kompilatora i maszyny wirtualnej.

### 1.1. Kompilacja i uruchomienie programu bez pakietu
:star:

1. Skompiluj plik źródłowy `Packageless.java` przy pomocy polecenia `javac` z poziomu katalogu `src`.
1. Czy kompilacja się powiodła? Gdzie powstał wynikowy plik klasy? Opisz swoje obserwacje.
1. Uruchom teraz plik `Packageless.class` z wykorzystaniem narzędzia `java`.
1. Czy uruchomienie powiodło się? Opisz swoje obserwacje.

### 1.2. Kompilacja i uruchomienie programu z pakietem
:star:

1. Skompiluj plik źródłowy `Packageaware.java` przy pomocy polecenia `javac` z poziomu katalogu `src`.
1. Czy kompilacja się powiodła? Na czym polega błąd? Opisz swoje obserwacje.
1. Skompiluj teraz ten sam plik ale z poziomu katalogu `src/env`.
1. Czy teraz kompilacja się powiodła? Na czym polega błąd? Opisz swoje obserwacje.
1. Uruchom kompilator w ten sposób, aby poprawnie skompilował plik źródłowy.
1. Gdzie powstał plik wynikowy `Packageaware.class`? Opisz swoje obserwacje.
1. Uruchom teraz pilk wynikowy `Packageaware.class` z poziomu katalogu `src` w ten sposób: `java env/Packageaware.class` lub `java env\Packageaware.class`.
1. Czy któreś z powyższych poleceń zadziałało? Jak je poprawić?
1. Uruchom poprawnie wspominany plik klasy i opisz różnicę między poleceniem `javac` i `java`. Co musimy podać
każdemu z tych poleceń? 

### 1.3. Kompilacja programu z błędem na poziomie pakietu
:star:

1. Skompiluj plik źródłowy `Packagebug.java` z poziomu katalogu `src`. Pamiętaj, że w pliku została umieszczona deklaracja pakietu.
1. Czy kompilacja powiodła się? Na czym polega błąd? Opisz swoje obserwacje.
1. Popraw kod, tak aby możliwa była kompilacja tego pliku.
1. Opisz swoje obserwacje.

### 1.4. Kompilacja do wskazanego katalogu
:star: :star:

1. Skompiluj plik źródłówy `env/direct/DirectSrc1.java`.
1. Gdzie powstał plik `DirectSrc1.class`?
1. Wykonaj kompilacje tak, aby plik `DirectSrc1.class` znalazł się w katalogu: `out/env/direct`, 
gdzie katalog `out` powinien być na tym samym poziomie co katalog `src` (nie wewnątrz katalogu `src`)
1. Jeżeli nie znasz rozwiązania zajrzyj tutaj: [*javac*](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javac.html)
1. Opisz swoje obserwacje w pliku źródłówym `DirectSrc1.java`
1. Uruchom teraz utworzoną klasę `DirectSrc1.class`. Pamiętaj o pakietach.

### 1.5. Kompilacja wielu źródeł
:star: :star:

1. W katalogu/pakiecie z poprzedniego zadania znajduje się więcej klas.
1. Skompiluj każdą klasę z osobna, tak aby tworzyły się w katalogu `out` (w sposób analogiczny jak w poprzednim zadaniu)
1. Skompiluj teraz wszystkie klasy z podanego katalogu/pakietu przy pomocy pojedynczego wywołania `javac`
1. Jeżeli nie znasz rozwiązania zajrzyj tutaj: [*javac*](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javac.html).
Możesz skorzystać z symbolu wieloznaczności lub opcji `-sourcepath`.
1. Opisz swoje obserwacje w pliku źródłówym `DirectSrc1.java` (obok tych z poprzedniego zadania)

### 1.6. Kompilacja i uruchomienie z wykorzystaniem zewnętrznej biblioteki
:star: :star:

1. Skompiluj plik `env/ext/Externals.java`.
1. Czy kompilacja przeszła bez przeszkód?
1. Zakomentuj w pliku linię **3**. Skompiluj plik - czy kompilacja przeszła bez przeszkód?
1. Zakomentuj teraz linię **4**. Skompiluj plik - czy kompilacja przeszła bez przeszkód?
1. Dlaczego klasa `StringBuilder` nie musi być importowana, a klasa `ArrayList` musi? Zapisz swoje obserwacje.
1. Odkomentuj teraz w pliku `env/ext/Externals.java` linie **5** i **13**.
1. Jak teraz wygląda kompilacja?
1. W katalogu `lib` (na poziomie katalogu `src`) znajduje się plik `commons-lang3-3.8.1.jar`. 
Skompiluj plik `Externals.java` z wykorzystaniem tej zewnętrznej biblioteki. Skorzystaj z opcji `-cp` lub `-classpath` polecenia `javac`
1. Jeżeli nie znasz rozwiązania, to ponownie zajrzyj tutaj: [*javac*](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javac.html) lub tutaj: [*external jars*](https://stackoverflow.com/questions/4421730/importing-external-jar-files)
1. Opisz swoje obserwacje w pliku źródłowym.
1. Uruchom teraz plik `Externals.java` poleceniem: `java env.ext.Externals` - czy maszyna wirtualna poprawnie uruchomiła klasę?
1. Na przykładzie sterowania kompilatorem (`javac`) skonfiguruj odpowiednio polecenia `java`, aby uruchomienie klasy powiodło się.
1. Jeżeli nie znasz rozwiązania zajrzyj tutaj: [*java*](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/java.html).
1. Opisz swoje obserwacje w pliku źródłowym.

### Gratulację! Zakończyłeś/aś pierwszą sekcję.
Jeżeli chcesz jeszcze lepiej utrwalić ten materiał, to przygotuj samodzielne przykłady, które zasumulują każde z pojawiających się zagadnień


## Sekcja 2 - Struktura programu
> Zrozumiesz strukturę programu, jego elementy oraz proces uruchamiania klasy przez JVM.

### 2.1. Kompilacja pustego pliku źródłowego
:star:

1. Skompiluj plik `Empty.java`
1. Czy kompilacja powiodła się? Czy powstał jakiś plik? Opisz swoje obserwacje.

### 2.2. Program z niepoprawną kolejnością elementów
:star:

1. Przyjrzyj się instrukcją w pliku `struct/Elements.java`.
1. Spróbuj skompilować plik. Czy kompilacja powiodła się? Opisz swoje obserwacje
1. Na różne sposoby zamień kolejność linia. Po każdej zamianie spróbuj skompilować kod. **Nie modyfikuj zawartości żadnej linii**.
Opisz swoje obserwacje związane z powodzeniem lub niepowodzeniem kompilacji.
1. Czy kolejność głównych elementów programu Java ma znaczenie? Jaka jest prawidłowa kolejność? 
Czy umiesz ją uzasadnić? Opisz swoje obserwacje.

### 2.3. Klasa dostępna do poziomu pakietu
:star:

1. Przyjrzyj się plikowi `struct/PackagePrivate.java` - czy kod tej klasy wygląda poprawnie? Zapisz swoje obserwacje.
1. Skompiluj powyższy plik. Czy kompilacja powiodła się? Jeżeli Twoje obserwacje nie były poprawne, to zapisz nowe obserwacje.

### 2.4. Klasa dostępna publicznie
:star:

1. Przyjrzyj się plikowi `struct/Public.java` - czy kod tej klasy wygląda poprawnie? Zapisz swoje obserwacje.
1. Skompiluj powyższy plik. Czy kompilacja powiodła się? Jeżeli Twoje obserwacje nie były poprawne, to zapisz nowe obserwacje.

### 2.5. Wiele klas
:star: :star:

1. Przyjrzyj się plikowi `struct/Many.java` - czy kod tej klasy wygląda poprawnie? Zapisz swoje obserwacje.
1. Skompiluj powyższy plik. Czy kompilacja powiodła się? Jeżeli Twoje obserwacje nie były poprawne, to zapisz nowe obserwacje.
1. Nie usuwając z pliku żadnej z klas popraw ich deklaracje tak, aby plik poprawnie się kompilował.
1. Ile i jakie klasy powstały w wyniku kompilacji? Zapisz swoje obserwacje.

### 2.6. Uruchomienie programu bez metody głównej
:star: :star:

1. Skompiluj program `struct/Mainless.java` i uruchom go.
1. Czy program udało się poprawnie uruchomić? Zapisz swoje obserwacje.

### 2.7. Właściwy format metody głównej
:star: :star:

1. Skompiluj program `struct/ValidMain.java` i uruchom go.
1. Czy program udało się skompilować? Czy program udało się uruchomić? Zapisz swoje obserwacje.
1. Sprawdź, które z deklaracji metody `main` są poprawnymi deklaracjami z punktu widzenia maszyny wirtualnej (polecenia `java`). 
W tym celu komentuj/odkomentuj odpowiednie deklaracje, kompiluj i uruchamiaj. Zapisz swoje obserwacje.
1. Czy możliwe jest odkomentowanie wszystkich deklaracji metody `main`? Czy program dalej się kompiluje? Zapisz swoje obserwacje.
1. Wskaż deklaracje metody `main`, które wzajemnie się wykluczają oraz te które pozwalają wzajemnie współistnieć
w klasie `ValidMain`. Jakie elementy/mechanizmy języka Java są odpowiedzialne za takie działanie? Zapisz swoje obserwacje

### 2.8. Bloki statyczne
:star: :star: :star:

1. Przyjrzyj się programowi w pliku `struct/StaticJavaMainless.java` - czy użyte w kodzie konstrukcje są Ci znane?
1. Skompiluj kod i uruchom go. Czy obie operacje powiodły się? Zapisz swoje obserwacje.
1. Skompiluj i uruchom teraz plik `struct/StaticJava.java`. Czy obie operacje powiodły się? Zapisz swoje obserwacje.
1. Jeżeli interesuje Cię pewna stara sztuczka programistyczna, to zapoznaj się z informacjami jak skompilować i uruchomić plik `.java` 
w starszej wersji języka Java, np. 1.7. Możesz zacząć szukać tutaj: [*run old java*](https://stackoverflow.com/questions/11364761/how-do-i-compile-a-java-with-support-for-older-versions-of-java).
1. Skompiluj i uruchom plik `struct/StaticJavaMainless.java` w oparciu o wersję Java 1.7. Zapisz swoje obserwacje.

### Gratulację! Zakończyłeś/aś drugą sekcję.
Jeżeli chcesz jeszcze lepiej utrwalić ten materiał, to przygotuj samodzielne przykłady, które zasumulują każde z pojawiających się zagadnień

---

## Sekcja 3 - Typy proste
> Poznasz podstawowe typy danych wykorzystywane przez język Java.

### 3.1. Wartości typów prostych
:star:

1. W metodzie `main` w klasie `primitivies/Values.java` wypisz na konsoli po dwie wartości każdego z typów prostych.
Nie używaj w tym celu zmiennych. Posłuż się przykładem dla typu `boolean`.
1. W jaki sposób wypiszesz wartości typu `byte`, `short`, `long` i `float`? Czy da się wypisać wartość każdego
z tych typów?
1. Zapoznaj się z pojęciem literału ([*literals*](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)).
1. Na podstawie materiału oraz zadania zapisz obserwacje na temat dostępnych typów literałów w języku Java oraz
zdefiniuj jak rozumiesz literał.
1. Czy znasz jeszcze jakiś typ literału poza wymienionymi w zadaniu?

### 3.2. Wartości graniczne typów prostych
:star: :star:

1. W metodzie `main` w klasie `primitives/MinMaxValues.java` wypisz na konsoli wartość maksymalną i minimalną każdego typu prostego.
1. Nie szukaj tych wartości w Internecie. Skorzystaj z metody `pow` w klasie `Math`. Metoda ta oblicza potęgę danej liczby, np:

   ```java
   double val = Math.pow(2, 3) // val = 2^3
   ```
   
1. Jeżeli potrzebujesz dalszych podpowiedzi, to wylicz wartości graniczne na podstawie następujących informacji:
   - `byte` - zajmuje 1 bajt, 8 bitów, jest typem ze znakiem
   - `short` - zajmuje 2 bajty, 16 bitów, jest typem ze znakiem
   - `char` - zajmuje 2 bajty, 16 bitów, jest typem bez znaku
   - `int` - zajmuje 4 bajty, 32 bitów, jest typem ze znakiem
   - `long` - zajmuje 8 bajtów, 64 bity, jes ttypem ze znakiem
   - `float` - zajmuje 4 bajty, 32 bity, bazuje na reprezentacji `IEEE 754` (_tutaj możesz troszkę oszukiwać_)
   - `double` - zajmuje 8 bajtów, 64 bity, bazuje na reprezentacji `IEEE 754` (_tutaj możesz troszkę oszukiwać_)
1. Zapisz obserwacje na temat minimalnych i maksymalnych wartości różnych typów prymitywnych.
1. Jakie są różnice między typem `float` i `double`? Jak rozumiesz zdanie _typ `double` jest typem podwójnej precyzji,
a typ `float` pojedynczej precyzji_?


### 3.3. Systemy reprezentacji liczb
:star: :star:

1. Zapoznaj się z zapisem liczb w metodzie `main` w klasie `primitives/NumberFormats.java`.
1. Wypisz na konsoli wszystkie wartości z zakomentowanych linii kodu, analogicznie jak dla wartości `127`.
1. Czy możliwość stosowania takiego zapisu i uzyskane wyniki zaskoczyły Cię?
1. Zapisz swoje obserwacje dotyczące użytych formatów i możliwości ich stosowania.

### 3.4. System binarny reprezentacji liczb
:star: :star:

1. W metodzie `main` w klasie `primitives/Binnary.java` zostało podane 7 wartości liczbowych.
1. Przedstaw każdą z podanych wartości w postaci liczby zapisanej w systemie binarnym. Użyj tylu bitów
ile jest potrzebne do zapisu liczby, ale nie mniej niż 8.

### 3.5. System binarny - konwersja liczb
:star: :star: :star:

1. W klasie `primitives/BinnaryConverter` napisz implementację metody `convertToBinary`.
1. Twoja implementacja powinna zwracać postać binarną jako obiekt klasy `String`.
1. Wartość powinna być zapisana na 16 pozycjach (bitach).
1. Metoda powinna obsługiwać liczby bez znaku (tylko dodatnie) od `0` do `65535`.
1. Implementacja ma zapewnić, aby program przechodził zestaw assercji (o asercjach języka Java przeczytasz tutaj: [*asercje*](https://www.baeldung.com/java-assert))
1. Nie korzystaj z żadnych gotowych implementacji.
1. Jeżeli nie znasz algorytmu konwersji liczb, to możesz przeczytać przykładowy artykuł [*tutaj*](https://ryanstutorials.net/binary-tutorial/binary-conversions.php)

### 3.6. Pozostałe systemy liczbowe - reprezentacja
:star: :star:

1. W metodzie `main` w klasie `primitives/OctalAndHexal.java` zostało podane 7 wartości liczbowych.
1. Przedstaw każdą z podanych wartości w postaci liczby zapisanej w systemie ósemkowym oraz szesnastkowym.
Użyj tylu bitów ile jest potrzebne.
1. Wybierz dwie dowolne liczby i zapisz je również w formacie binarnym.
1. Porównaj ze sobą postać tej samej liczby w formacie binarnym, ósemkowym i szesnastkowym. Czy dostrzegasz
jakieś prawidłowości? Zapisz swoje obserwacje.
1. Zamień teraz wszystkie pozostałe liczby na format binarny.


### 3.7. Pozostałe systemy liczbowe - konwersja liczb
:star: :star: :star:

1. W klasie `primities/FormatsConverter` napisz implementację metody `convertTo`.
1. Metoda przyjmuje dwa parametry - liczbę do konwersji oraz system, w którym liczba ma być zapisana.
1. Metoda powinna obsługiwać systemy liczbowe o podstawie od 2 (dwójkowego, binarnego) do 26.
1. Twoja implementacja powinna zwracać wartośc przekonwertowaną jako obiekt klasy `String`.
1. Wartość powinna być zapisana na 16 pozycjach (16 bitów).
1. Metoda powinna obsługiwać liczby bez znaku (tylko dodanie) od `0` do `65535`
1. Zastanów się nad reprezentacją wartości w systemach o podstawie powyżej `10` (maksymalna wartość pojedynczej pozycji,
to `podstawa_systemu - 1`). Pamiętaj, że każda wartość powinna być tylko jednym znakiem.

### 3.8. Typ znakowy
:star:

1. Zapoznaj się z przykładowym kodem w metodzie `main` w klasie `primitives/MagicChar.java`.
1. Zanim uruchomisz program zapisz, jakie dane zostaną wyświetlone na ekranie?
1. Napisz analogiczny fragment kodu, który korzystając ze zmiennej `A` wypiszę co drugą wielką literę alfabetu.
1. Zapisz swoje obserwacje na temat typu `char`.
1. Odkomentuj zakomentowaną sekcję kodu i uruchom program.
1. Czy wynik działania programu zaskoczył Cię? Zapisz swoje obserwacje.
1. Zapisz teraz swoje imię i nazwisko przy pomocy tych dwóch zmiennych, z których pierwsa będzie przechowywała
pierszą literę Twojego imienia, a druga pierwszą literę Twojego nazwiska.

### 3.9. Znaki specjalne
:star:

1. W metodzie `main` w klasie `primitives/SpecialChars.java` znajdują się trzy zmienne typu `char`.
1. Przy pomocy metody `print` z `System.out` (**nie `println`**) wypisz te wartości tak, aby zajęły 2 linie.
1. Kolejne wartości oddzielaj od siebie znakiem `,`.
1. W języku Java dostępne są jeszcze inne sekwencje specjalne (tzw. sekwencje ucieczki):

   `\f` - wysuw strony,
   `\r` - powrót karetki,
   `\t` - tabulacja pozioma,
   `\b` - backspace,
   `\\` - ukośnik w lewo,
   `\'` - apostrof,
   `\"` - cudzysłów.
 
1. Wypisz na konsoli każdy ze znaków specjalnych w nowej linii (skorzystaj z wielu metod `println`). Znaki wypisuj
w formacie jak niżej:

   ```java
   System.out.println("Symbol '\\n': [START]" + \n + "[STOP]");
   ```
   
1. Czy któreś znaki specjalne Cię zaskoczyły? Zapisz swoje obserwacje.

### 3.10. Sekwencje unicode
:star: :star: :star:

1. Skompiluj program `primitives/Unicodes.java`.
1. Czy program poprawnie się kompiluje? Na czym polega błąd? Zapisz swoje obserwacje.
1. Po sekwencji znaków `\u000d` wstaw znaki `//`. Skompiluj teraz program.
1. Czy program poprawnie się kompiluje? Zapisz swoje obserwacje
1. Uruchom teraz program. Co jest wyświetlane w oknie konsoli?
1. Przy pomocy znaków Unicode wyświetl na konsoli planszę do gry w szachy. Pamiętaj o wyświetleniu
numerów wierwszy oraz kolumn. Na planszy wyświetl również poprawnie rozstawione figury, gotowe do rozpoczęcia
gry. Odpowiednich znaków możesz poszukać w [tablicy znaków Unicode](https://unicode-table.com/pl/).

### 3.11. Literały tekstowe
:star:

1. Przeanalizuj kod klasy `primitives.StringLiterals`. Zanim skompilujesz kod zastanów się nad wynikiem instrukcji w 
pierwszym fragmencie kodu.
1. Skompiluj i uruchom kod. Popraw te instrukcje, które wyświetliły niepoprawny wynik opisanych operacji.
1. Skompiluj i uruchom kod, aby upewnić się, że instrukcje zostały zapisane poprawnie.
1. Zapisz poniższy fragment tekstu w pojedynczej zmiennej przy pomocy wielu literałów. Rozdziel każdy wyraz i biały znak 
na pojedynczy literał tekstowy i wykorzystaj operator konkatenacji (`+`) do połączenia wszystkich literałów w jedną wartość.
Pamiętaj również o znaku końca linii, który jest niezbędny aby tekst był wieloliniowy.

   ```text
   We are the champions, my friends
   And we'll keep on fighting 'til the end
   We are the champions
   We are the champions
   No time for losers
   'Cause we are the champions of the world
   ```
   
1. Użyj utworzonej zmiennej do wyświetlenia tekstu. Skompiluj program, uruchom i upewnij się, że udało Ci się uzyskać 
tekst zgodny z zaprezentowanym.
1. Policz ile literałów tekstowych użyłeś/aś w tym celu oraz ile tak naprawdę obiektów typu `String` było potrzebnych
do uzyskania pełnego tekstu w jednej zmiennej.
1. Z wyodrębnionych literałów powstałych przez rozdział tekstu w poprzednim zadaniu wyodrębnij te unikalne i zapisz
je do osobnych zmiennych typu `String`. Zastanów się jakie przyjąć nazwy dla tych zmiennych?
1. Wykorzystaj teraz zmienne, aby ponownie zbudować cały fragment tekstu w jednym wyrażaniu (tak jak to robiłeś/aś)
przy literałach. Skompiluj, uruchom i upewnij się, że udało się wyświetlić ponownie ten sam tekst.
1. Policz teraz ile literałów tekstowych użyłeś/aś posługując się zmiennymi oraz ile tak naprawdę obiektów typu `String`
było potrzebnyh do uzyskania pełnego tekstu w jednej zmiennej.
1. Zapisz teraz w kolejnej zmiennej cały tekst przy pomocy tylko jednego literału, bez operatora `+` (konkatenacji) i
wyświetl tą zmienną na konsoli.
1. Skompiluj i uruchom program, aby upewnić się, że po raz kolejny udało Ci się uzyskać ten sam tekst, co w przykładzie.

### 3.12. Operacje na łańcuchach tekstowych
:star: :star:

1. Zapoznaj się z kodem w klasie `primitives/StringOperations.java`.
1. Dostarcz implementację metody `computeThoughts` zgodnie z jej dokumentacją.
1. Metoda dostarczy prawidłowy wynik **tylko** dla tekstu użytego w przykładzie. Dla innych tekstów metoda nie będzie
działać.

### Gratulacje! Zakończyłeś/aś czwartą sekcję
Jeżeli chcesz jeszcze lepiej utrwalić ten materiał, to przygotuj samodzielne przykłady, które zasumulują każde 
z pojawiających się zagadnień.

---

## Sekcja 4 - Reprezentowanie wartości: zmienne
> Zrozumiesz idee zmiennej jako adresu w pamięci oraz poznasz podstawowe operacje na zmiennych

### 4.1. Modelowanie
:star:

1. W metodzie `main` w klasie `vars/Modeling.java` zadeklaruj zestawy zmiennych jak poniżej opisano:
   - 5 zmiennych opisujących Ciebie,
   - 8 zmiennych opisujących Twoją rodzinę i przyjaciół,
   - 6 zmiennych opisujących otoczenie, w którym właśnie przebywasz,
   - 5 zmiennych opisujących dowolny przedmiot, który masz na wyciągnięcie ręki,
   - 5 zmiennych opisujących dowolny inny przedmiot, który masz na wyciągnięcie ręki.
1. Postaraj się dobrze dobrać nazwy zmiennych, aby oddawały znaczenie użytych wartości.
1. Czy zdarzyło Ci się wykorzystać kilka takich samych wartości w różnych zmiennych?
1. Zmień teraz nazwy wszystkich zmiennych na kolejno `i1`, `i2`, `i3` itd.
1. Zamknij klasę `vars.Modeling` i wróć do jej kodu po zakończeniu wszystkich zadań z tej sekcji. Czy wiesz, co reprezentuje
każda ze zmiennych `i1`, `i2`, `i3` itd?
1. Zastanów się nad znaczeniem nazwy zmiennej. Spróbuj ułożyć sobie zasadę, której będziesz zawsze przestrzegać.

### 4.2. Zmienne lokalne
:star:

1. W metodzie `main` w klasie `vars/LocalVariables.java` zadeklaruj zmienne następującyc typów: `boolean`, `byte`, `int`, 
`double`, `String`, `int[]` oraz `StringBuilder`.
1. Bez przypisywania im wartości spróbuj wyświetlić na konsoli wartość tych zmiennych.
1. Czy kod poprawnie się kompiluje i uruchamia?
1. Popraw kod, aby dało się go skompilować i uruchomić. Zapisz swoje obserwacje.
1. Dostarcz teraz kod metody `modify`, który zmodyfikuje wartości wcześniej zadeklarowanych zmiennych.
1. Czy kod poprawnie się kompiluje i uruchamia?
1. Czy możliwe jest zmodyfikowanie sygnatury i implementacji metody `modify` w taki sposób, aby
zmienić w niej wartości zmiennych zadeklarowanych w metodzie `main`? Zapisz swoje obserwacje.

### 4.3. Zmienne statyczne
:star: :star:

1. W klasie `vars/StaticVariables.java` zadeklaruj **pola statyczne** następujących typów: `boolean`, `byte`, `int`, `double`, 
`String`, `int[]` oraz `StringBuilder`.
1. Nie przypisuj do zmiennych wartości.
1. W metodzie `main` wypisz wartości tych zmiennych na konsoli.
1. Czy kod poprawnie się kompiluje i uruchamia?
1. Jakie wartości ma każda z tych zmiennych? Czy dostrzegasz jakąś regułę? Zapisz swoje obserwacje.
1. Uzupełnij teraz kod metody `modify`, tak aby zmienić w nim wartość każdej ze zmiennych. Następnie
ponownie wypisz ich wartości w metodzie `main`.
1. Czy kod poprawnie się kompiluje i uruchamia? Porównaj działanie zmiennych statycznych i zmiennych lokalnych
z poprzedniego zadania. Zapisz swoje obserwacje.

### 4.4. Zmienne obiektowe
:star: :star:

1. W klasie `vars/ObjectVariables` zadeklaruj **pola niestatyczne** następujących typów: `boolean`, `byte`, `int`, `double`,
`String`, `int[]` oraz `StringBuilder`.
1. Nie przypisuj do zmiennych wartości.
1. W metodzie `main` utwórz nowy obiekt klasy `ObjectVariables` i wyświetl wartości jego pól.
1. Czy kod poprawnie się kompiluje i uruchamia?
1. Jakie wartości ma każda z tych zmiennych? Czy dostrzegasz jakąś regułę? Zapisz swoje obserwacje.
1. Uzupełnij teraz kod metody `modify`, tak aby zmienić w nim wartość każdej ze zmiennych. Następnie
ponownie wypisz ich wartości w metodzie `main`.
1. Czy kod poprawnie się kompiluje i uruchamia?
1. Dodaj do deklaracji metody`modify` słowo kluczowe `static`. Skompiluj i uruchom kod. Czy kod kompiluje się poprawnie?
1. Zmodyfikuj sygnaturę i implementację metody `modify`, aby możliwe było w niej zmodyfikowanie utworzonych
zmiennych (nie usuwaj modyfikatora `static`).
1. Porównaj działanie zmiennych obiektowych, statycznych i lokalnych.

### 4.5. Zależności między zmiennymi typów prymitywnych
:star: :star:

1. Przeanalizuj kod w klasie `vars/PrimitiveVariables.java`.
1. Bez uruchamiania programu zastanów się jakie wartości będą miały odpowiednie zmienne `a`, `b` i `c` w momencie ich wyświetlenia?
Zapisz swoje propozycje w postaci komentarza po prawej stronie odpowiednich linii kodu.
1. Uruchom program i porównaj wynik jego działania z Twoimi oczekiwaniami.
1. Jakie są zależności między zmiennymi typów prymitywnych? Jaki mają na siebie wpływ? Zapisz swoje obserwacje.
1. Odkomentuj zakomentowaną linię. Czemu teraz program się nie kompiluje? Zapisz swoje obserwacje.

### 4.6. Zależności między zmiennymi typów referencyjnych
:star: :star:

1. Przeanalizuj kod w klasie `vars/ReferencesVariables.java`
1. Bez uruchamiania programu zastanów się jakie wartości będą miały odpowiednie zmienne `a`, `b` i `c` w momencie ich wyświetlenia?
Zapisz swoje propozycje w postaci komentarza po prawej stronie odpowiednich linii kodu.
1. Uruchom program i porównaj wynik jego działanie z Twoimi oczekiwaniami.
1. Jakie są zależności między zmiennymi typów referencyjnych? Jaki mają na siebie wpływ? Zapisz swoje obserwacje.
1. Zastąp teraz klasę `StringBuilder` inną dowolną klasą. Pamiętaj, że również metodę `append` będziesz musiał zastąpić jakąś inną metodą.
1. Czy program zmienił swoje działanie? Czy zachowanie zmiennych typów referencyjnych jest zależne od ich klasy (typu)? 
Zapisz swoje obserwacje.
1. Skorzystaj z metody `identityHashCode` w klasie `System` do wyświetlenia adresów obiektów wskazywanych przez każdą 
ze zmiennych `a`, `b` i `c`. Zapisz swoje obserwacje.
1. Porównaj zmienne typów prymitywnych ze zmiennymi typów referencyjnych. Zastanów się nad podobieństwami i różnicami w ich
działaniu. Co zmienne każdego z tych typów reprezentują w pamięci komputera?

### Gratulacje! Zakończyłeś/aś piątą sekcję.
Jeżeli chcesz jeszcze lepiej utrwalić ten materiał, to przygotuj samodzielne przykłady, które zasumulują każde 
z pojawiających się zagadnień

---

## Sekcja 5 - Przetwarzanie informacji: metody
> Nauczysz się korzystać z najważniejszych struktur (jednostek) programistycznych: metod.

### 5.1. Deklaracje metod
:star:

1. W klasie `methods/Declaration.java` zadeklaruj pojedynczą metodę obiektową (nie statyczną), np. sumującą dwie wartości 
typu `int`.
1. Zadeklaruj teraz pojedynczą metodę statyczną, np. mnożącą dwie wartości typu `int`.
1. Opisz znane Ci różnice między metodami statycznymi i nie statycznymi.

### 5.2. Zależności między metodami statycznymi i obiektowymi
:star: :star:

1. Zapoznaj się z kodem w klasie `methods/StaticNotStatic.java`.
1. Spróbuj skompilować kod tej klasy. Czy kompilacja powiodła się? Jakie są błędy i z czego wynikają? Zapisz swoje obserwacje.
1. Popraw/uzupełnij kod programu tak, aby przechodził kompilacje. Nie zmieniaj sensu programu, każda z użytych metod ma 
dalej być używana, a deklaracje zmiennych mają pozostać jak są.
1. Zapisz swoje obserwacje na temat zależności między kontekstem statycznym i nie statycznym.

### 5.3. Metody zwracające i nie zwracające wyniku
:star:

1. Zapoznaj się z kodem w klasie `methods/VoidNotVoid.java`.
1. Spróbuj skompilować kod tej klasy. Czy kompilacja powiodła się? Jakie są błędy i z czego wynikają? Zapisz swoje obserwacje.
1. Popraw/uzupełnij kod programu tak, aby przechodził kompilacje. Nie zmieniaj deklaracji metod.
1. Zapisz swoje obserwacje.

### 5.4. Przeciążanie metod
:star: :star:

1. W metodzie `main` w klasie `methods/Overloading.java` znajduje się fragment kodu, zapoznaj się z nim.
1. Spróbuj skompilować kod tej klasy. Czy program się kompiluje? Na czym polegają błędy kompilacji?
1. Nie zmieniając kodu w metodzie `main` uzupełnij program tak, aby się kompilował. Dopisz w tym celu kolejne
deklaracje metody `info`. Pamiętaj, aby posługiwać się cały czas tą samą nazwą metody.
1. Odkomentuj teraz linie **16**, **17** i **18**. Dopisz nie więcej niż 2 nowe deklaracje metod `info`, tak
aby odkomentowane trzy linie poprawnie się kompilowały. Skompiluj i uruchom program, aby upewnić się co do poprawności
rozwiązania.
1. Odkomentuj teraz linie **20** i **21**. Nie zwracaj uwagi na istniejące już deklaracje metody `info` i napisz nowe deklaracje
metody `info` dla wskazanych linii. Skompiluj i uruchom program. Czy kompilacja jest możliwa?
1. Zapisz swoje obserwacje - w szczególności co musi zmieniać się w deklaracji metody jeżeli chcemy wielokrotnie korzystać z tej samej nazwy.

### 5.5. Przekazywanie przez wartość
:star: :star:

1. Zapoznaj się z kodem w klasie `methods/ByValue.java`.
1. Nie uruchamiając programu zapisz jakie wartości zostaną wyświetlone na konsoli (we wskazanych przez komentarze miejscach).
1. Skompiluj i uruchom program. Czy Twoje obserwacje pokrywają się z wynikami?
1. Zastanów się nad różnicami działania zmiennych typów prymitywnych i zmiennych typów referencyjnych. Czy dostrzegasz jakieś?
Zapisz swoje obserwacje.
1. W jaki sposób przekazywane są wartości przy wywołaniu metody? Zapisz swoje obserwacje.

### 5.6. Pierwsza prawda o metodach: metoda jako sparametryzowany blok kodu
:star: :star: :star:

1. Zapoznaj się z kodem w klasie `methods/TheOnlyTruth.java`
1. Porównaj kod z metody `withMethod` z kodem metody `withoutMethod`. Czy ten kod działa w ten sam sposób? Zapisz obserwacje.
1. Przekształć kod metody `makeWithout` tak, aby nie korzystała z metody wewnętrznej (analogicznie jak zostało zrobione
to w metodzie `withoutMethod`). Działanie metody ma pozostać bez zmian.
1. Przekształć kod metody `makeWithin` tak, aby korzystała z metody wewnętrznej (analogicznie jak zostało zrobione
 to w mteodzie `withMethod`). Działanie metody ma pozostać bez zmian (trzeba będzie dopisać też nową metodę wewnętrzną).
1. Na czym polega użycie metody posiadającej parametry? Zapisz swoje obserwacje.
1. Które linie kodu z wersji bez metody są ukrywane przed programistą w kodzie z metodą? Zapisz swoje obserwacje.
1. Które linie kodu z wersji bez metody są zastępowane innym wyrażeniem w kodzie z metodą? Zapisz swoje obserwacje.
1. Jak byś formalnie opisał czym jest metoda?

### 5.7. Druga prawda o metodach: świat statyczny i niestatyczny
:star: :star: :star:

1. Zapoznaj się z kodem w klasie `methods/TheSecondTruth.java`
1. Porównaj kod z metody `objectCompare` z kodem metody `staticCompare`. Czy ten kod działa w ten sam sposób? 
Zapisz swoje obserwacje.
1. Uzupełnij kod metody `main`, tak abyś wywołał w nim obie metody.
1. Zastanów się jak wyglądałby kod metody `staticCompare` gdyby słowo `this` nie było zastrzeżonym słowem kluczowym 
i można by tak nazwać pierwszy parametr metody `staticCompare`?
1. Zmień nazwę pierwszego parametru metody `staticCompare` (oraz jego użycie w kodzie) z `first` na `_this`. 
Jak to teraz wygląda?
1. Napisz metodę obiektową `objectSum`, która będzie działała w ten sam sposób co metoda `staticSum`, 
ale będzie przyjmować tylko drugi parametr. Użyj obu metod w metodzie `main`.
1. Zapisz metodę statyczną `staticMultiply`, która będzie działała w ten sam sposób co metoda `objectMultiply`, 
ale będzie przyjmowała dodatkowy parametr. Użyj obu metod w metodzie `main`.
1. Jaka jest różnica między metodami statycznymi, a nie statycznymi? Zapisz swoje obserwacje.
1. Czym jest słowo kluczowe (zmienna) `this` w kodzie metod obiektowych? Zapisz swoje obserwacje.

### Gratulacje! Zakończyłeś/aś szóstą sekcję.
Jeżeli chcesz jeszcze lepiej utrwalić ten materiał, to przygotuj samodzielne przykłady, które zasumulują każde 
z pojawiających się zagadnień.

---

## Sekcja 6 - Analiza programu
> Nauczysz się samodzielnie oceniać jakość kodu, odnajdywać oraz naprawiać błędy.

### 6.1. Nieczytelny kod
:star: :star:

1. Zapoznaj się z programem w pliku `analysis/Ugly.java`.
1. Bez kompilowania i uruchamiania programu zapisz co ten program robi.
1. Popraw kod programu, w taki sposób aby stał się dla Ciebie bardziej czytelny. Opisz swoje zmiany w kodzie.

### 6.2. Czytelny kod
:star: :star:

1. Zapoznaj się z programem w pliku `analysis/Clean.java`.
1. Bez kompilowania i uruchamiania programu zapisz, co ten program robi.
1. Opisz swoje obserwacje i wrażenie po porównaniu obu wersji tego _samego_ kodu (pod względem efektu działania).

### 6.3. Popsuty kod
:star: :star:

1. W pliku `analysis/BadCode1.java` znajduje się kod z błędami.
1. Spróbuj samodzielnie zidentyfikować i poprawić wszystkie błędy w tym programie - **nie korzystaj z kompilatora**. Opisuj błędy, które zidentyfikowałeś.
1. Skompiluj teraz kod. Czy program poprawnie się kompiluje? O jakich błędach zapomniałeś? Napraw kod do końca i opisz błędy, które Ci umknęły.
1. Ten sam proces wykonaj dla programu w pliku `analysic/BadCode2.java`.

### 6.4. Psucie kodu
:star: :star:

> Zadanie powinno być wykonywane w parach (może również być wykonane online).

1. W pliku `analysic/HaveFun.java` znajduje się kod źródłowy program.
1. Zapoznaj się z zamieszczonym kodem i opisz co program robi.
1. Teraz popsuj ten kod i przekaż go innej osobie do naprawy. Pamiętaj tylko, aby psuć kod w taki sposób, aby dało się go naprawić. Sekwencja `ctrl + a` i `del` jest nie jest tutaj dobrym rozwiązaniem. Bądź fairplay :)
1. Ty sam napraw kod, który dostaniesz od tej osoby.
1. Jeżeli to możliwe, to pracujcie w parach _face-to-face_/_keybord-to-keyboard_. Jeżeli nie jest to możliwe lub nie masz pary prześlij popsuty kod komuś np. na slacku i poproś o popsuty kod od niego.
1. Obaj opiszcie błędy jakie pojawiły się w kodzie i na czym polegało ich usunięcie.
1. Powtórz to ćwiczenie dla dowolnego kodu, który napisałeś. Przekaż swój kod drugiej osobie z pary, aby go popsuł, a następnie zidentyfikuj i naprawd błędy.
1. Na koniec zastanów się, które błędy pomaga Ci wykryć kompilator, a których nie? Jak byś te dwa rodzaje błędów nazwał? Które łatwiej było znaleźć/usunąć?

### Gratulacje! Zakończyłeś/aś szóstą sekcję
Jeżeli chcesz jeszcze lepiej utrwalić ten materiał, to przygotuj samodzielne przykłady, które zasumulują każde 
z pojawiających się zagadnień.

---

## Podsumowanie
Wykonałeś/aś mnóstwo wartościowych zadań, które na pewno pomogły Ci lepiej zrozumieć podstawy języka Java.
Jeżeli, pomimo samodzielnego wykonania wymienionych zadań, dalej któreś z zagadnień jest dla Ciebie trudne lub niezrozumiałe,
to spróbuj samodzielnie wymyślić podobne zadanie i je rozwiązać. Często próba wymyślenia problemu do rozwiązania,
powiązanego z danym zagadnieniem, jest dużo trudniejsza i pozwala więcej się nauczyć niż dostarczenie rozwiązania 
dla problemu już opisanego.

Mam nadzieję, że jesteś i czujesz się solidnie przygotowany/a do kolejnego modułu!