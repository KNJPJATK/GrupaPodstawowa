package edu.knj.spotkanie8;

import java.util.GregorianCalendar;

public class Kot extends Ssak{

    private String imie;

    public Kot(String imie, int waga, GregorianCalendar dataurodzenia, Plec plec) {
        //  wywolujemy konstruktor nadklasy
        super(waga, dataurodzenia, plec);
        this.imie = imie;
    }

    @Override
    public void dajGłos() {
        System.out.println("Miał");
    }

    @Override
    public String toString() {
        return "Kot{" +
                "imie='" + imie + '\'' +
                '}';
    }
}
