package edu.pjatk.kolojava.spotkanie7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    class Klient{}



    public static void main(String[] args) {
        //  przechowuje kolekcję Integer'ow
        List<Integer> lista = new ArrayList<Integer>();

        lista.add(1);
        lista.add(2);
        lista.add(3);

        System.out.println(lista.contains(1));
        System.out.println(lista.contains(87));

        int pierwszyElementWLiscie = lista.get(0);

        System.out.println(pierwszyElementWLiscie);



        Date date = new Date();
    }
}
