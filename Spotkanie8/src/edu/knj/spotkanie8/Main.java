package edu.knj.spotkanie8;

import java.util.GregorianCalendar;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("1", "One");
        map.put("2", "Two");
        map.put("3", "Three");
        map.put("4", "Four");

        for(String value : map.values()){
            System.out.println(value);
        }

        GregorianCalendar data = new GregorianCalendar(2015, 11, 12);

        System.out.println(data);

        //------------------------

        Schronisko schronisko = new Schronisko("Paluch");

        Kot mruczek = new Kot("Mruczek", 5,
                new GregorianCalendar(2015, 11, 11), Plec.Dziewczynka);

        Kot koszka = new Kot("Koszka", 3,
                new GregorianCalendar(2015, 11, 11), Plec.Chlopczyk);

        Lampart ostryLampart = new Lampart(true, 3,
                new GregorianCalendar(2015, 11, 11), Plec.Chlopczyk);

        Lampart tepyLampart = new Lampart(false, 3,
                new GregorianCalendar(2015, 11, 11), Plec.Chlopczyk);

        mruczek.dajGłos();

        schronisko.dodajZwierzaka(mruczek);
        schronisko.dodajZwierzaka(koszka);
        schronisko.dodajZwierzaka(ostryLampart);
        schronisko.dodajZwierzaka(tepyLampart);

        int waga = 0;

        for(Ssak ssak : schronisko){
            waga += ssak.getWaga();
            ssak.dajGłos();
        }

        System.out.println("Waga ssakow: " + waga);
    }
}
