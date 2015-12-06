package edu.pjatk.kolojava.spotkanie7;

import java.util.HashMap;

/**
 * Created by andrew on 03.12.2015.
 */
public class Bank {

    private String nazwa;
    HashMap<Integer, Klient> idIKlienci = new HashMap<Integer, Klient>();

    public void dodajKlienta(Klient klient){
        //              klucz           wartosc
        idIKlienci.put(klient.getId(), klient);
        /*
        Co sie dzieje w hashmapie
            1 -> Klient A
            2 -> Klient B
            3 -> Klient C
         */

        //Klient dodanyKlient = idIKlienci.get(klient.getId());
    }
}
