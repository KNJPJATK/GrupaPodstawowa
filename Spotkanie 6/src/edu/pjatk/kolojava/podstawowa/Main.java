package edu.pjatk.kolojava.podstawowa;

public class Main {



    public static void main(String[] args) {

        //  Nowo stworzonej klasy mozemy uzywac jako... typ!
        //  To jest definicja samochod.
        Samochod samochod;

        //  inicjalizacja - 'new' jest slowkiem kluczowym i zarezerwowanym.
        //  'this', 'super', 'int' tez...
        samochod = new Samochod();

        //  inicjalizujemy pola obiektu
        samochod.setMarka("Opel");
        samochod.setPojemnoscSilnika(2400);

//        samochod.

        System.out.println(samochod.getMarka());

        samochod = new Samochod("Renault", 2500); //nie mamy dostepu juz obiektu Opel...

        System.out.println(samochod.getMarka());

        //  inicjuje wartoscia, ktora zwroci moja metoda
        double spalanieRenault = samochod.obliczSpalanie();

        //  i ja wypisuje...
        System.out.println(spalanieRenault);

        double spalanieRenaultZPrzeciazonejMetody = samochod.obliczSpalanie(100, true);

        System.out.println(spalanieRenaultZPrzeciazonejMetody);



        Osoba marek = new Osoba("Marek Marecki", false, 25);

        marek.show();

        final double pi = 3.1415;

        //pi = 2; //<- to nie przejdzie

        //  nie potrzebujemy obiektu klasy do pobrania statycznego pola

        int ileKol = samochod.liczbaKol;

        Samochod wolny = new Samochod();
        Samochod szybki  = new Samochod();

        //  liczbaKol jest dzielona przez wszystkie obiekty
        szybki.liczbaKol = 5;
        ileKol = wolny.liczbaKol;

        System.out.println("Ile kol ma samochod? " + ileKol);

        ile

        Samochod    a = new Samochod("A", 1),
                    b = new Samochod("B", 2),
                    c = new Samochod("C", 3);
        /*
            a -> A
            b -> B
            c -> C
         */

        a = b;

        /*
            Teraz bedzie
            a -> B
            b -> B
            c -> C
         */
        b.setPojemnoscSilnika(5);
        //  do pamieci wskazywanej przez b, mowimy aby zmienic pojemnosc silnika!
        System.out.println("Pojemnosc a: " + a.getPojemnoscSilnika());


    }


    //  ZADANIE
    //  klasa Osoba
    //  ma  imie, nazwisko, wiek i plec
    //  napisac konstruktor, ktory bedzie inicjowal osobe
    //          i metode show() ktora wyswietli podstawowe parametry o tej osobie


}
