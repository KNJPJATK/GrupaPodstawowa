package edu.knj.spotkanie8;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Schronisko implements Iterator<Ssak>, Iterable<Ssak> {

    private String nazwa;
    private List<Ssak> zwierzaki = new LinkedList<>();

    private int index = 0;

    public Schronisko(String nazwa) {
        this.nazwa = nazwa;
    }

    public void dodajZwierzaka(Ssak ssak){
        zwierzaki.add(ssak);
    }

    @Override
    public boolean hasNext() {
        return index < zwierzaki.size();
    }

    @Override
    public Ssak next() {
        return zwierzaki.get(index++);
    }

    @Override
    public Iterator<Ssak> iterator() {
        return this;
    }
}
