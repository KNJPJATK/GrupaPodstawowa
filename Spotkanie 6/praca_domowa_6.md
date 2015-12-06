#Praca domowa 6
######26.11.2015

###Dodatki do naszych klas
Stworzyc pole typu Osoba w klasie Samochod. Osoba ta bedzie wlascicielem samochodu.
Stworz getter i setter dla wlasiciela.
Stworz metode bezparametrowa - pokazDanePojazduIWlasciciela ktora bedzie wystwietlac dane samochodu i wlasciciela.

###Wypelnij szablony

```java
public class Point{

  private int x, y;

  public Point(int x, int y){
    this.x = ...
  }

  //Gettery settery dla x i y;

  }


public class Line {
   // Linia składa się z dwóch punktów
   private Point begin;    // punkt poczatkowy
   private Point end;      // punkt koncowy

   public Line (Point begin, Point end) {
      this.begin = begin;
      ......
   }
   public Line (int beginX, int beginY, int endX, int endY) {
      begin = new Point(beginX, beginY);   // tu tworzymy i incjalizujemy punkty
      ......
   }

   Metody
   public String toString() { ...... }

   public Point getBegin() { ...... }
   public Point getEnd() { ...... }
   public void setBegin(......) { ...... }
   public void setEnd(......) { ...... }

   public int getBeginX() { ...... }
   public int getBeginY() { ...... }
   public int getEndX() { ...... }
   public int getEndY() { ...... }

   public void setBeginX(......) { ...... }
   public void setBeginY(......) { ...... }
   public void setBeginXY(......) { ...... } //ustalamy na raz X i Y punktu poczatkowego
   public void setEndX(......) { ...... }
   public void setEndY(......) { ...... }
   public void setEndXY(......) { ...... } //ustalamy na raz X i Y punktu koncowego
 
   public int getLength() { ...... } // dlugosc linii
                                     // polecam Pitagorasa :)
}
```

###Liczby wymierne
Stworz klase liczby wymierne.
Posiada ona pola licznik mianownik.

Zdefiniuj konstruktor przyjmujacy inna lizcbe wymierna i kopiujacy jej wartosci do siebie.

Zdefiniuj metody:
* show, ktora pokazuje ta lizcbe w formacie "licznik/mianownik" np. "3/5"
* dodaj, ktora bedzie brala jako jedyny paremetr drugą liczbe wymierna i zwroci nowa liczbe wymierna dodana z tej pierwszej i z tej drugiej
* odejmij, ktora bedzie brala jako jedyny paremetr drugą liczbe wymierna i zwroci nowa liczbe wymierna ktora jest wynikiem odejmowania pierwszej od drugiej
* pomnoz, ktora bedzie brala jako jedyny parametr drugą liczbe wymierna i zwroci nowa liczbe wymierna wymnazajaca pierwsza liczbe i druga
* inkrementuj, ktora zwiekszy licznik o jeden
* statyczna metoda, dodajDwieLiczbyWymierne, ktora przyjmie dwie liczby wymierne jako argumenty i zwroci liczbe wymierna(OBIEKT!!) z odejmowania drugiej od pierwszej


Dzialanie metod przedstaw na przykladach.
