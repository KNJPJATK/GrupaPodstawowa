public class Spotkanie3 {

    /**
     *  Sprawdzamy ile jest wystapien podanego znaku w zdaniu.
     */
    public static int szukajLiczbyZnakuWZdaniu(String zdanie, char znak){

        int ileZnakowWZdaniu = 0; //licznik wystapien danego znaku

        for(int i = 0; i < zdanie.length(); i++){
            //  wyciagamy i-ty znak.
            char ityChar = zdanie.charAt(i);
            //  i sprawdzamy czy jest on rowny podanemu przez nas znakowi.
            if (ityChar == znak){
                //  jezeli tak to zwiekszamy licznik wystapien.
                ileZnakowWZdaniu++;
            }
        }

        //  koncowo zwracamy ile znalezlismy takich znakow.
        return ileZnakowWZdaniu;
    }

    public static void rysujKlepsydre(int szer, char znak){

        // gora klepsydry
        for (int i = 0; i < (szer/2)+1; i++) {

            String spac ="";
            for (int j = 0; j < i; j++) {
                spac+=" ";
            }
            String linikja="";
            for (int j = 0; j < szer-(i*2); j++) {
                linikja+=znak;
            }

            System.out.println(spac+linikja+spac);
        }
        // dol klepsydry
        for (int i = 0; i < (szer/2)+1; i++) {
            String spac ="";
            for (int j = 0; j < (szer/2)-i; j++) {
                spac+=" ";
            }
            String linikja="";
            for (int j = 0; j < (i*2)+1; j++) {
                linikja+=znak;
            }
            if(i!=0){
                System.out.println(spac+linikja+spac);
            }
        }
    }

    public static void main(String[] args) {

		int[][] tablica2d; // defincja

		//	inicjujemy
		
		tablica2d = new int[3][3];

		 /* 	j:0 1 2
		 * 	      _____
		 * i: 0 | 1 2 3 tablica2d[0]		
		 * i: 1 | 4 5 6 tablica2d[1]
		 * i: 2 | 7 8 9 tablica2d[2]
		 */

        //  zaznacz myszą lub klawiaturą duży blok kod w Eclipsie i...
        //  Nacsinij
		//  ctrl + shift + /
        //  Stworzysz komentarz blokowy. O! Taki jak powyżej! :)


        //  Ponizsza pętla wypełnia wartości w macierzy kolejnymi liczbami począwszy od 1.
        //  części pętli for...
		//	inicjalizacja /       warunek     / inkrementacja
		for(int i = 0;    i < tablica2d.length; i++) {
            //  W warunku powyzszego fora pytamy sie ile jest wierszy w macierzy...
			for(int j = 0; j < tablica2d[i].length; j++) {
				//... a w powyzszym ile jest kolumnw wierszu!
				int liczbaDoWstawienia = tablica2d[i].length * i + j + 1;
				tablica2d[i][j] = liczbaDoWstawienia;

				System.out.print(tablica2d[i][j]+ " \t");
			}
			System.out.println();
		}

        //  to samo można też tak zrobić:
        int[][] drugaTablica2d = new int[3][3];

        for (int i = 0; i < drugaTablica2d.length; i++) {

            //  Wyciągamy i-ty wiersz! To samo tak naprawdę robimy w powyższym forze(ale tak po cichu i niejawnie...)
            int[] wiersz = drugaTablica2d[i];

            for (int j = 0; j < wiersz.length; j++) {
                //  no i w koncu w warunku drugiego fora sprawdzamy ile jest w nim kolumn
                int liczbaDoWstawienia = wiersz.length * i + j + 1;
                drugaTablica2d[i][j] = liczbaDoWstawienia;
            }
        }


        //  Szukamy najmniejszego elementu w tablicy!

        int[] tablica = {4, 6, 9, 4, 1, 12, -1};

        //  zaczniemy nasze poszukiwania od pierwszego elementu i na samym początku uznajemy, ze to on jest najmniejszy!
        int indeksNajmniejszegoElementu = 0;

        for(int i = 0; i < tablica.length; i++){
            //  nastepnie wyciagamy obecnie najmniejszy element..
            int obecnieNajmniejszyElement = tablica[indeksNajmniejszegoElementu];
            //  ... i i-ty element ...
            int ityElement = tablica[i];
            //  ... i sprawdzamy czy i-ty element jest mniejszy od tego ktory uwazamy ze jest najmniejszy...
            if (ityElement < obecnieNajmniejszyElement){
                //  jezeli jest, to ustalamy, ze najmniejszym indeksem jest właśnie obecne i !
                indeksNajmniejszegoElementu = i;
            }
        }

        System.out.println("Indeks najmniejszego elementu: " + indeksNajmniejszegoElementu);
        System.out.println("Najmniejszy element: " + tablica[indeksNajmniejszegoElementu]);

    }

}