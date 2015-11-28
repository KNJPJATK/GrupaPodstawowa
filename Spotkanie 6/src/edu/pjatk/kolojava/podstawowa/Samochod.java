package edu.pjatk.kolojava.podstawowa;

/**
 * Defininujemy klasę.
 * Tez definiujemy nowy typ.
 */
public class Samochod {

    //region Pola
    private String marka;
    private int pojemnoscSilnika; //    stosujemy camelCase do zapisywania nazw zmiennych/pol :)

    public static int liczbaKol = 4;

    //endregion Pola

    //region Konstruktor
    //  Konstruktory sa po to aby tworzyc obiekty w konkretny sposob.
    //  Jezeli nie ma zadnego konstruktora, to mamy tzw konstruktor domyslny...
    //  Albo mozemy go przeciazyc.
    public Samochod() {
    }
    //widocznosc nazwaKlasa(argumenty...)
    public Samochod(String marka, int pojemnoscSilnika){
        //  this jest zmienna, pod którą znajduje sie aktualnie tworzony obiekt!
        this.marka = marka;
        this.pojemnoscSilnika = pojemnoscSilnika;
    }
    //endregion Konstruktor

    //region Metody

    // Gettery & Setter
    //  Do prywatnych pol uzyskujemy dostep przez publiczne metody.

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(int pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    //  obliczamy spalanie - 2.5 * pojemnoscSilnika = spalanie na 100km
    //  definicja metod
    //  widocznosc(private, public) - zwracany typ(void, int, String, ...) - nazwaMetody
    //  pamietac o sensownych nazwach metod, niech opisuje to co robi! mniewiecej...
    public double obliczSpalanie(){
        nieWidacMnie(); // mozemy tu uzyc prywatnej metody!
        //  w tym bloku jest tylko jedna pojemnoscSilnika(ta z pola klasy...)
        //  wiec mozemy ominac słowko this przed pojemnoscSilnika
        return 2.5 * pojemnoscSilnika / 1000;

        //kod ponizej return sie nie wykona
        //int a = 2;
    }

    //przeciazona metoda.
    public double obliczSpalanie(int predkoscSamchodu, boolean czyZimowe){
        return (2.5 * predkoscSamchodu / 10 * this.pojemnoscSilnika
                + (czyZimowe ? 200 : 50)) / 1000;
    }

    //  metody prywatnych tylko mozemy uzywac wewnatrz klasy
    private void nieWidacMnie(){
        System.out.println("Nie widac mnie!");
    }

    //endregion Metody

    //region Statyczne Metody

    //  statycznosc:
    //  1)  jezeli cos jest statyczne, to mozna dostawac sie do tego
    //      _BEZ_ instancji danej klasy
    //  2)  taki zasob jest wspoldzielony przez _WSZYSTKIE_ instancje
    //
    //  przyklade, jest System.out.println(...)
    //                      System to klasa
    //                      out to pole statyczne
    //                      println(...) to metoda obiektu out.

    //endregion Statyczne Metody

}
