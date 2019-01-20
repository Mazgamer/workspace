# PROGRAMOWANIE 1, Software Development Academy

Repozytorium zabiera Cię w podróż na Jave. Rozpoczynasz ją od samego początku i zbierając kolejne doświadczenia 
odkrywasz język Java. Na końcu tej podróży będziesz potrafił/a mówić w języku wyspy Java.

### Nota prawna

Drogi użytkowniku. Ze względu na ochronę wartości intelektualnej zachęcam Cię, abyś na wstępie zapoznał się z poniższą 
notą prawną dotyczącą repozytorium. Uzyskałeś dostęp do repozytorium i tym samym poniższe zapisy w całości Cię dotyczą. 
Proszę Cię o współpracę w ochronie tej wartości i przestrzeganie niżej opisanych zasad. Dziękuję.

> Repozytorium, jego treść i zawartość podlegają ochronie prawnej. Wykorzystywanie materiałów zawartych w repozytorium 
może odbywać się tylko za zgodą autora.

> Repozytorium jest **prywatne**. Udostępniane jest wybranym osobom i tylko przez te osoby może być wykorzystywane. 
Dalsze rozpowszechnianie i/lub kopiowanie repozytorium bez zgody autora, w całości lub we fragmentach, jest zabronione.

> Autorem i właścicielem repozytorium jest Michał Kupisiński Honest IT Consulting. 

> Repozytorium oraz każda jego kopia (fork) muszą zachować powyższą notę prawną.

### Przygotowanie repozytorium

1. Upewnij się, że został Ci nadany dostęp do repozytorium i masz prawo utworzenia `fork`'a i wykonania `pull-request`'u.
2. Utwórz `fork` repezytorium na swoim koncie github ([*fork*](https://guides.github.com/activities/forking/))
3. Sklonuj swój `fork` na dysk. Najlepiej utwórz wcześniej folder zbiorczy dla tego i innych repozytoriów, np. 
`repositories` albo `workspace`. Do sklonowania wykorzystaj polecenie `git clone`.
   
   > Upewnij się, że repozytorium zostało poprawnie utworzone przy pomocy `git status`
   
   > **Pamiętaj, aby utworzyć klon Twojego `fork-a`, a nie repozytorium głównego**
   
4. Wszystkie polecenia w treści zadań odnoszą się do katalogu `src` w Twojej wersji repozytorium. Jeżeli mowa o pliku 
`Example.java`, to powinien on się znaleźć w ścieżce `src/Example.java`. Jeżeli mowa o pliku `OtherExample.java` 
z pakietem `pl.some.nasty.place`, to powinien on się znaleźć w ścieżce `src/pl/some/nasty/place/OtherExample.java`.
5. Pamiętaj aby po każdym rozwiązanym zadaniu dodać je (`git add`) i zakomitować (`git commit`) do swojego `fork`'a.
6. Jeżeli rozwiązanie wymaga uzupełnienia odpowiedzi/obserwacji, to wstaw je jako komentarz wieloliniowy na początku 
pliku źródłowego, którego dotyczy zadanie.
7. Na koniec pamiętaj, aby wypchnąć wszystkie zmiany do swojego `fork`'a (polecenie: `git push`) oraz utworzyć `pull-request` 
([*pull request*](https://help.github.com/articles/creating-a-pull-request)) do repozytorium głównego. Musisz to zrobić
na koniec zajęć z danego modułu.

   > Pamiętaj, że możesz potem dalej realizować zadania, commitować je oraz wypychać. Nowe zadania i zmiany w istniejących 
   zostaną automatycznie uwzględnione we wcześniejszym `pull-request`.
   
7. Baw się dobrze przy rozwiązywaniu zadań ;)

### Wprowadzenie

Cel, który chce z Tobą osiągnąć jest nauczenie Cię podstaw języka Java, poprzez doświadczenie tego języka.
Zadania zostały tak przygotowane, abyś mógł/mogła powoli odkrywać elementy języka Java, ucząc się jednoczenie
nie łatwej sztuki programowania. Przez to odkrywcze podejście w dalszej przygodzie z programowaniem będziesz odnosić się 
do Twoich doświadczeń, a nie zapamiętanych i wyuczonych informacji. Doświadczenie jest tym, co najlepiej nas przygotowuje,
uczy i pozwala opanować umiejętności.

Repozytorium składa się z trzech modułów. Każdy moduł podzielony jest na sekcje, a sekcje na konkretne zadania.
Pracować będziesz z następującymi modułami:

* Moduł 1. Podstawy: kompilatora, maszyna wirtualna, wartości, zmienne i metody.
* Moduł 2. Przetwarzanie informacji: instrukcje, iteracje, rekurencje i tablice.
* Moduł 3. Algorytmy: wyszukiwanie, sortowanie i struktury danych.

Zapraszam Cię do rozpoczęcia przygody z językiem Java. 

### Moduł 1. Podstawy: kompilatora, maszyna wirtualna, wartości, zmienne i metody

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

[Rozpocznij pracę z tą sekcją](modules/module_a/README.md)

### Moduł 2. Przetwarzanie informacji: instrukcje, iteracje, rekurencje i tablice

`Moduł niedostępny`

### Moduł 3. Algorytmy: wyszukiwanie, sortowanie i struktury danych

`Moduł niedostępny`