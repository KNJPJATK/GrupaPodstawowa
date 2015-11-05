/**
 * ZADANKA PO SPOTKANIU 3!
 *
 * Zadanka robimy po kolei!
 *
 * Zrobimy zadanie 1, odpalamy kod, jak jest dobrze, to dostaniemy komunikat o tym ze jest dobrze.
 * Jak nie, to poprawimy i probujemy jeszcze raz.
 *
 * W razie pytan, uwag, zastrzezen i zali -> tomasz@wojda.net albo andrew.torski@gmail.com
 * Albo na grupie fejsbuniowej Grupy Podstawowej zagadujcie Tomasz Wojda albo mnie(Andrew Torski)
 */
public class Zadania3 {

    /**
     *  Zadanko 1 - na rozgrzewke!
     *
     *  Sprwadźmy czy podana macierz jest kwadratowa, tzn. czy ma tyle samo wieszy i kolumn.
     *
     *  Pozniej to zadanie bedzie potrzebne, wiec je zrob! :))
     */
    public static boolean czyKwadratowa(char[][] macierz){

        boolean czyKwadratowa = false;

        //  jakis wiersz z macierzy moze wyciagnac np tak:
        //  char[] wiersz = macierz[0]; // to jest akurat pierwszy wiersz

        int liczbaWierszy = macierz.length;
        int liczbaKolumn = macierz[0].length;
//                                     operator logiczny
//                                     VV
        czyKwadratowa = (liczbaWierszy == liczbaKolumn);

        //  wstaw true do czyKwadratowa jezeli jest rzeczywiscie kwadratowa

        return czyKwadratowa;
    }

    /**
     *  Zadanko 2 - dalej sie grzejemy!
     *
     *  Sprawdzamy czy podane macierze maja tyle samo wierszy i kolumn
     */
    public static boolean czyMacierzeMajaTyleSamoWierszyIKolumn(int[][] pierwszaMacierz, int[][] drugaMacierz){

        boolean czyMajaTyleSamoWierszyIKolumn = false;

        int liczbaWierszyWMacierzyPierwszej = pierwszaMacierz.length,
            liczbaKolumnWMacierzyPierwszej = pierwszaMacierz[0].length;

        int liczbaWierszyWMacierzyDrugiej = drugaMacierz.length,
            liczbaKolumnWMacierzyDrugiej = drugaMacierz[0].length;

        czyMajaTyleSamoWierszyIKolumn = (liczbaWierszyWMacierzyPierwszej == liczbaWierszyWMacierzyDrugiej)
                && (liczbaKolumnWMacierzyPierwszej == liczbaKolumnWMacierzyDrugiej);


        return czyMajaTyleSamoWierszyIKolumn;

    }

    /**
     *  Zadanko 3 - juz coś róbmy!
     *  Bierzemy macierz na wejsciu i dodajemy wszystkie jej elementy po kolei jak leci i zwracamy to co otrzymamy.
     */
    public static int zwrocDodaneElementyMacierzy(int[][] macierzLiczb){

        int sumaElementow = 0;


        //  jakies for petle pewnie... i cos z ta zmienna sumaElementow musimy robic...
        for (int i = 0; i < macierzLiczb.length; i++) { // wiersze

            for (int j = 0; j < macierzLiczb[i].length; j++) {
                int wartoscZMacierzy = macierzLiczb[i][j];
                sumaElementow += macierzLiczb[i][j];
            }

        }

        return sumaElementow;
    }

    /**
     *  Zadanko 4 - działamy!.
     *
     *  Bierzemy dwie macierze i dodajemy ich rownolezace komorki do siebie i wstawiamy je do macierzy wynikowej
     *  tzn.: bierzemy komorke z wiersza 0 i kolumny 0 w pierwszej macierzy i bierzemy komorke z wiersza 0 i kolumny 0
     *  drugiej macierzy i dodajemy ich wartosci do siebie.
     *
     *  np.
     *  1 2 3   9 8 7   10 10 10
     *  4 5 6 + 6 5 4 = 10 10 10
     *  7 8 9   3 2 1   10 10 10
     *
     *  Uwaga! Fajnie by bylo gdyby te macierze mialy po tyle samo wierszy i kolumn...
     *
     */
    public static int[][] dodajDoSiebieMacierze(int [][] pierwszaMacierz, int [][] drugaMacierz){

        //  Tu tylko sprawdzamy czy ich ilosc wierszy i kolumn sie zgadza...
        //  UWAGA uzywamy tu funkcji z zadania 2!!!
        if (!czyMacierzeMajaTyleSamoWierszyIKolumn(pierwszaMacierz, drugaMacierz)){
            System.err.println("EJ! Ale w zadaniu 4 te macierze mialy miec tyle samo wierszy i kolumn :/ >.<");
            return null;
        }

        int iloscWierszyMacierzyWynikowej = pierwszaMacierz.length; //Co tu bedzie? :o
        int iloscKolumnMacierzyWynikowej = drugaMacierz[0].length; //A tu??

        int [][] macierzWynikowa = new int[iloscWierszyMacierzyWynikowej][iloscKolumnMacierzyWynikowej];


        //  pewnie jakaś pętla... a moze dwie nawet... pewnie tez cos z macierzWynikowa trzeba robic... nie?
        for (int i = 0; i < iloscWierszyMacierzyWynikowej; i++) {
            for (int j = 0; j < iloscKolumnMacierzyWynikowej; j++) {

                int wartoscZPierwszej = pierwszaMacierz[i][j],
                    wartoscZDrugiej = drugaMacierz[i][j];

                macierzWynikowa[i][j] = wartoscZPierwszej + wartoscZDrugiej;
            }
        }

        //  jak juz wszystko wyliczylismy to zwracamy nasza macierz wynikowa do swiata zewnetrznego! paaa!
        return macierzWynikowa;
        //  na zawsze pozostaniesz w naszych sercach :'(
    }

    /**
     *  Zadanko 5! - dalej dalej!
     *
     *  Mamy macierz kwadratową(ma tyle samo wiersz co i kolumn) znaków na przykłąd taką:
     *
     *  a b c
     *  e f g
     *  h i j
     *
     *  i teraz chcemy aby jej przekątne wypelnic jakimś znakiem. Na przykład: 'o'
     *
     *  Ma wyglądać tak:
     *
     *  o b o
     *  e o g
     *  o i o
     *
     * macierzZnakow[i][macierzZnakow.length-1-i] = znakDoWypelnienia;
     *
     * j = macierzZnakow.length-1-i
     *
     * i 0..1..2
     * j 2..1..0
     *
     *  00  01  02
     *  10  11  12
     *  20  21  22
     *
     *
     *  Mały hint:
     *
     *  Legenda
     *      xy - wspolrzedne komorki, x - nr wiersza, y - nr kolumny
     *
     *  Jak masz problemy, to sprobuj sobie rozpisać na kartce albo tu w komentarzach jakie sa kolejne
     *  wspolrzedne kazdej komorki w macierzy i przestudiuj to! Moze zauwazysz cos ciekawego :)
     */
    public static void wypelnijPrzekatneMacierzyZnakami(char[][] macierzZnakow, char znakDoWypelnienia){

        //  Tylko uwazaj! Uzywamy tu funkcji z zadania 1!
        boolean czyKwadratowa = czyKwadratowa(macierzZnakow);
        //  NIE-czyKwadratowa
        if (!czyKwadratowa){
            System.err.println("EJ! Ale ta macierz znakow w zadaniu 5 miala byc kwadratowa... Nie bawimy sie tak...");
            //  jezeli nie jest kwadratowa, to instrukcja return; zaprzestaniemy wykonywac cokolwiek w niej...
            return;
        }

        System.out.println("Macierz przed wypelnieniem");
        printujMacierz(macierzZnakow);

        //  Najprosciej:
        //  Dla przekątnej z lewego gornego rogu do dolnego prawego - dwie zagniezdzone petle for i sprawdzamy czy akurat
        //  jestesmy na komorkach przekatnej.

        //  DWIE PETLE!!!

        /*//przekatna z lewego gornego rogu do prawego dolnego
        for (int i = 0; i < macierzZnakow.length; i++) {
            for (int j = 0; j < macierzZnakow[i].length; j++) {
                if (i == j){
                    macierzZnakow[i][j] = znakDoWypelnienia;
                }
            }
        }

        for (int i = 0; i < macierzZnakow.length; i++) {
            for (int j = macierzZnakow[i].length - 1; j >= 0; j--) {
                if ((i + j) == macierzZnakow.length - 1){
                    macierzZnakow[i][j] = znakDoWypelnienia;
                }

            }
        }*/

        //  dwie petle - bez zagniedzen
        /*for (int i = 0; i < macierzZnakow.length; i++) {
            macierzZnakow[i][i] = znakDoWypelnienia;
        }

        for (int i = 0; i < macierzZnakow.length; i++) {
            macierzZnakow[i][macierzZnakow.length-1-i] = znakDoWypelnienia;
        }*/


        for (int i = 0; i < macierzZnakow.length; i++) {
            macierzZnakow[i][i] = znakDoWypelnienia;
            macierzZnakow[i][macierzZnakow.length-1-i] = znakDoWypelnienia;
        }

        //  Ambitniej(i lepiej tak naprawde) tylko jedną petla na przekątną! Jest to bardzo proste i o wiele wydajniejsze.

        //  Dla drugiej przekatnej z prawego gornego do lewego dolnego tak samo.

        //  Super ambitniej bedzie uzyc tylko jednej pętli for dla dwoch przekatnych. To juz jest Mt. Everest wydajnosci
        //  :)

        System.out.println("Macierz po wypelnieniu przekatnych");
        printujMacierz(macierzZnakow);
    }

    /**
     *  Zadanie 6! Uff! Ale to było dobre!
     *
     *  Ogólnie sprawa ma się tak:
     *      mamy takie macierze znakow
     *
     *      macierz pierwsza:
     *      J A V
     *      J E S
     *      O K T
     *
     *      macierz druga:
     *      A
     *      T
     *      J
     *
     *      I chcemy złączyć te macierze do jednej wspolnej tak aby wygladała ona o tak:
     *
     *      J A V A
     *      J E S T
     *      O K E J
     */
    public static char [][] zlaczMacierzeZnakow(char[][] pierwszaMacierzZnakow, char[][] drugaMacierzZnakow){
        //  jezeli maja inna liczbe wierszy to nic z tego, nie zdzialamy nic wiecej...
        if (pierwszaMacierzZnakow.length != drugaMacierzZnakow.length){
            return new char[0][0]; //   zwracamy smutna macierz zero na zero :(
        }

        int iloscKolumnWMacierzWynikowej = pierwszaMacierzZnakow[0].length + drugaMacierzZnakow[0].length; // O TO! O to trzeba wyliczyc jakos, nie?
        int iloscWierszyWMacierzyWynikowej  = pierwszaMacierzZnakow.length;   // To tez chyba.

        char[][] macierzWynikowa = new char[iloscWierszyWMacierzyWynikowej][iloscKolumnWMacierzWynikowej];

        //  Wg mnie beda dwie podwojne petle for!
        //  Jedna aby przekopiowac znaki z pierwszej

        for (int i = 0; i < pierwszaMacierzZnakow.length; i++) {
            for (int j = 0; j < pierwszaMacierzZnakow[i].length; j++) {
                macierzWynikowa[i][j] = pierwszaMacierzZnakow[i][j];
            }
        }

        /*

            wynikowa
                  v
            J A V
            J E S
            O K E

         */

        for (int i = 0; i < drugaMacierzZnakow.length; i++) {
            for (int j = 0; j < drugaMacierzZnakow[i].length; j++) {
                macierzWynikowa[i][pierwszaMacierzZnakow[i].length+j] = drugaMacierzZnakow[i][j];
            }
        }


        return macierzWynikowa;
    }

    /*
        *************************** METODA MAIN *********************
     */

    public static void main(String[] arguments){

        /*
         ********************ZADANIE 1********************
         */
        System.out.println("----ZADANIE 1----");

        char [][] macierzDoZadania1Kwadratowa = new char[2][2];
        char [][] macierzDoZadania1Dzwina = new char[1][100];

        boolean czyKwadratowaJestKwadratowa = czyKwadratowa(macierzDoZadania1Kwadratowa);
        boolean czyDziwnaJestKwadratowa = czyKwadratowa(macierzDoZadania1Dzwina);

        if (czyKwadratowaJestKwadratowa == false){
            System.err.println("Kwadratowa wg Ciebie nie jest kwadratowa...");
            return;
        }

        if (czyDziwnaJestKwadratowa == true){
            System.err.println("Dziwna wg Ciebie jest kwadratowa...");
            return;
        }

        System.out.println("Zadanie 1 jest dobrze zrobione!");

        /*
         ********************ZADANIE 2********************
         */

        //  pierwsza i druga macierz maja tyle samo wierszy i kolumn
        int[][] pierwszaMacierzDoZadania2 = new int[20][40];
        int[][] drugaMacierzDoZadania2 = new int[20][40];
        //  natomiast trzecia macierz ma odwrotna liczbe wierwszy i kolumn jak dwie pierwsze
        int[][] trzeciaMacierzDoZadania2 = new int[40][20];

        boolean czyPierwszaIDrugaMajaTyleSamoWierszyIKolumn
                = czyMacierzeMajaTyleSamoWierszyIKolumn(pierwszaMacierzDoZadania2, drugaMacierzDoZadania2);
        boolean czyPierwszaITrzeciaMajaTyleSamoWierszyIKolumn
                = czyMacierzeMajaTyleSamoWierszyIKolumn(pierwszaMacierzDoZadania2, trzeciaMacierzDoZadania2);

        if (czyPierwszaIDrugaMajaTyleSamoWierszyIKolumn == false){
            System.err.println("Oops, najwyrazniej pierwsza i druga nie maja tyle samo wierszy i kolumn...");
            return;
        }

        if (czyPierwszaITrzeciaMajaTyleSamoWierszyIKolumn == true){
            System.err.println("Oops, najwyrazniej pierwsza i trzecia maja tyle samo wierszy i kolumn...");
            return;
        }

        System.out.println("Zadanie 2 jest dobrze zrobione!");

        /*
         ********************ZADANIE 3********************
         */

        int[][] macierzDoZadania3 = {   {1, 1, 1},
                                        {2, 2, 2},
                                        {3, 3, 3}};

        int sumaElementow = 18;

        int ileMetodaWyliczyla = zwrocDodaneElementyMacierzy(macierzDoZadania3);

        if (ileMetodaWyliczyla != sumaElementow){
            System.err.println("OJ! Coś w zadaniu 3 źle posumowało :S");
            return;
        }

        System.out.println("Zadanie 3 jest dobrze zrobione!");

        /*
         ********************ZADANIE 4********************
         */

        int [][] pierwszaMacierzDoZadania4 = {{1, 2, 3}, {4,5,6}, {7,8,9}};
        int [][] drugaMacierzDoZadania4 = {{9,8,7}, {6, 5, 4}, {3, 2, 1}};

        int [][] jakaMacierzWinnaByc = {{10, 10, 10}, {10, 10, 10}, {10, 10, 10}};

        int [][] coNamWyszloZZadania4 = dodajDoSiebieMacierze(pierwszaMacierzDoZadania4, drugaMacierzDoZadania4);

        boolean czySaRowneMacierze = CzyRowne(jakaMacierzWinnaByc, coNamWyszloZZadania4);

        if (czySaRowneMacierze == false){
            System.out.println("Te macierze w zadaniu 4 miały być równe...");
            return;
        }


        System.out.println("Zadanie 4 jest mega extra dobrze zrobione!");

        /*
         ********************ZADANIE 5********************
         */

        char [][] macierzDoZadania5 = { {'a','b','c'},
                                        {'e', 'f', 'g'},
                                        {'h', 'i', 'j'}};
        char znakDoPrzekątnych = 'o';

        System.out.println("Już musisz sam sobie porównać czy dobrze wypelnia!");

        wypelnijPrzekatneMacierzyZnakami(macierzDoZadania5, znakDoPrzekątnych);

        System.out.println("Zadanie 5 mam nadzieje, ze dobrze jest zrobione!");


        /*
         ********************ZADANIE 6********************
         */

        char [][] macierzJA_JE_OK = {{'J', 'A'}, {'J', 'E'}, {'O', 'K'}};
        char [][] macierzVA_ST_EJ = {{'V', 'A'}, {'S', 'T'}, {'E', 'J'}};

        char[][] jakaMacierzMaByc = {   {'J', 'A', 'V', 'A'},
                                        {'J', 'E', 'S', 'T'},
                                        {'O', 'K', 'E', 'J'}};

        char [][] otrzymanaZMetody = zlaczMacierzeZnakow(macierzJA_JE_OK, macierzVA_ST_EJ);

        boolean czy_macierzJakaMaByc_otrzymanaZMetody_saRowne = CzyRowne(jakaMacierzMaByc, otrzymanaZMetody);

        if (czy_macierzJakaMaByc_otrzymanaZMetody_saRowne == false){
            System.err.println("Oj! Coś źle jest w zadaniu 6! chyba!");
            return;
        }

        System.out.println("Zadanie 6 jest elegancko zrobione.!");


        System.out.println("Brawo! :))");
    }

    /*
        *************************** METODA MAIN *********************
     */


    private static boolean CzyRowne(char [][] pierwsza, char[][] druga){

        if (pierwsza.length != druga.length && pierwsza[0].length != druga[0].length){
            return false;
        }

        for (int i = 0; i < pierwsza.length; i++) {
            for (int j = 0; j < pierwsza[i].length; j++) {
                if (pierwsza[i][j] != druga[i][j]){
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean CzyRowne(int [][] pierwsza, int[][] druga){

        if (!czyMacierzeMajaTyleSamoWierszyIKolumn(pierwsza, druga)){
            return false;
        }

        for (int i = 0; i < pierwsza.length; i++) {
            for (int j = 0; j < pierwsza[i].length; j++) {
                if (pierwsza[i][j] != druga[i][j]){
                    return false;
                }
            }
        }

        return true;
    }


    /**
     *  Takie cos do drukowania macierzy znakow...
     */
    private static void printujMacierz(char[][] macierzZnakow){
        for (int i = 0; i < macierzZnakow.length; i++) {
            char [] wierszZeZnakami = macierzZnakow[i];
            for (int j = 0; j < wierszZeZnakami.length; j++) {
                System.out.print(" " + wierszZeZnakami[j]);
            }
            System.out.println();
        }
    }

    /**
     *  Takie cos do drukowania macierzy liczb...
     */
    private static void printujMacierz(int [][] macierzLiczb){
        for (int i = 0; i < macierzLiczb.length; i++) {
            int [] wierszZLiczbami = macierzLiczb[i];
            for (int j = 0; j < wierszZLiczbami.length; j++) {
                System.out.print(" " + wierszZLiczbami[j]);
            }
            System.out.println();
        }
    }
}
