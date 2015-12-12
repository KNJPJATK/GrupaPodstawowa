package edu.knj.spotkanie8;

import java.util.GregorianCalendar;

public class Lampart extends Ssak{

    private boolean czyMaOstrePazury;

    public Lampart(boolean czyMaOstrePazury,
                   int waga, GregorianCalendar dataUrodzenia, Plec plec) {
        super(waga, dataUrodzenia, plec);
        this.czyMaOstrePazury = czyMaOstrePazury;
    }


    @Override
    public void dajGłos() {
        System.out.println("Rrraaau");
    }

    @Override
    public String toString() {
        return "Lampart{" +
                "czyMaOstrePazury=" + czyMaOstrePazury +
                '}';
    }
}
