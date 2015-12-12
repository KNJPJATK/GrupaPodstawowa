package edu.knj.spotkanie8;

import java.util.GregorianCalendar;

public abstract class Ssak {

    protected int waga;
    protected GregorianCalendar dataUrodzenia;
    protected Plec plec;

    public Ssak(int waga, GregorianCalendar dataUrodzenia, Plec plec) {
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;
        this.waga = waga;
    }

    public abstract void dajGłos();

    public int getWaga() {
        return waga;
    }
}
