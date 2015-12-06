package edu.pjatk.kolojava.spotkanie7;

/**
 * Created by andrew on 03.12.2015.
 */
public class Rachunek {

    private static int iloscRachunkow = 13541323;

    private String nrRachunku;
    private int stanKonta;

    public Rachunek(int stanKonta) {
        this.stanKonta = stanKonta;
        this.nrRachunku = iloscRachunkow + "";
        iloscRachunkow++;
    }
}
