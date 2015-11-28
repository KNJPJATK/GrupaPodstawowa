package edu.pjatk.kolojava.podstawowa;

public class Osoba {

    //region Pola

    private String imieNazwisko;
    private int wiek;
    //  kobieta - true, mezczyzna - false
    private boolean czyKobieta;

    //endregion Pola

    //region Konstruktor

    //  eclipse generowanie k-tor: prawy na klase -> generate
    public Osoba(String imieNazwisko, boolean czyKobieta, int wiek) {
        this.imieNazwisko = imieNazwisko;
        this.czyKobieta = czyKobieta;
        this.wiek = wiek;
    }

    //endregion Konstruktor

    //region Metody

    public void show(){

        String plec = czyKobieta ? "Kobieta" : "Mezczyzna";
        System.out.println(imieNazwisko + " " + wiek + "-letni/a " +  plec);
    }

    //endregion Metody
}
