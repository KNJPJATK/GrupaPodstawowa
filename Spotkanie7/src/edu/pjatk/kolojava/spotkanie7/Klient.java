package edu.pjatk.kolojava.spotkanie7;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by andrew on 03.12.2015.
 */
public class Klient {

    private int id;
    private String imieNazwisko;
    private Date dataUrodzenia;
    private ArrayList<Rachunek> rachunki = new ArrayList<>();

    public int getId() {
        return id;
    }

    private void utworzNowyRachunek(int stanNowegoRachunku){
        Rachunek nowyRachunek = new Rachunek(stanNowegoRachunku);
        rachunki.add(nowyRachunek);
    }

}
