import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //************************
        //***Małe przypomnienie***
        //************************
        //  <- komentarz liniowy, wszystko to co jest po //, nie będzie kompilowane i brane pod uwagę
        /*
            Komentarz blokowy wszystko między /* i * / nie będzie kompilowane
         */

        //************************
        //*********Tablice********
        //************************


        int [] tab = new int[5]; //new dajemy przed typem tablicy! nie po!
        int tab2 [] = { 1, 2, 3, 4, 5 };// { <- curly bracket, nawias szesciokatny
        //				0, 1, 2, 3, 4 	<- kolejne indeksy
		/*
		 * Pierwszy element jest pod indeksem 0...
		 * Drugi pod 1
		 * Trzeci pod 2
		 * etc
		 * etc
		 */

        /*
            Do elementow tablicy dostajemy się przez poprzez wpisanie nazwy zmiennej tablicowej i umieszczeniu
            w nawiasach kwadratowych jej indeksu.
        */
        //System.out.println(tab[0]);

        /*
         *  Ostatni element w tablicy tab2, ktora ma piec elementow ma indeks...
         *  4!
         *
         *  Jeżeli chcemy dostać się do ostatniego elementu poprzez tab2[5], to dostaniemy wyjątek!
         *
         *  Na dobrą sprawę wszystko co jest większe od indeksu ostatniego elementu, wyrzuci nam wyjatek.
         */
        //int liczba = tab2[5]; //exception...
        //int liczba2 = tab2[6];//exception...


        //************************
        //********Stringi*********
        //************************
        String s1 = "Literalny literal"; //To jest literal. Dos≥ownie můwimy co to jest.
        /*
            Co mozemy z nim robic?

            String to jest jeden ciąg charów, więc możemy się dobrać do indywidualnych charów.
            Tak jak w tablicy!

            Używamy do tego metody charAt(int)

            między nawiasami podajemy indeks znaku, który chcemy pobrać.
        */

        String stringZJava = "JAVA";
        char c1 = stringZJava.charAt(0);	//	<- ?? - J
        char c2 = stringZJava.charAt(1);	//	<- ?? - A
        char c3 = stringZJava.charAt(2);	//	<- ?? - V
        char c4 = stringZJava.charAt(3);	//	<- ?? - A

        /*
            ostatni element w stringu czy w tablicy zawsze ma indeks:
            dlugoscTablicy - 1

            nasz string ma długość 4 - JAVA <- cztery litery :)

            ale ostatni element ma indeks 3! a jest to właśnie długośćNaszegoStringa - 1;
         */
        int dlugoscStringow = stringZJava.length();
        char ostatniChar = stringZJava.charAt(dlugoscStringow - 1);

        /*
            Poniższe instrukcje print() i println() wydrukują nam:
            JAVA

            print po wydrukowaniu znaku nie przejdzie do nastepnej lini, podczas gdy println tak.
            println - print line... linia to jest coś zakonczone znakiem nowej linii.

            gdybysmy uzyli ponizej TYLKO println to bysmy uzyskali
            J
            A
            V
            A

            a tak to jest:
            JAVA

            :)
         */

        //System.out.print(c1);
        //System.out.print(c2);
        //System.out.print(c3);
        //System.out.println(c4);

        //System.out.println("Ostatni char w JAVA: " + ostatni);

        //System.out.println("\\");     //  pojedynczy slash(backslash??)
        ///System.out.println("\\\\");  //  aby poj


        /*
            metodą startsWith(String) możemy sprawdzić czy jakiś dany String zaczyna się innym stringem.
            Jeżeli tak jest, to metoda ta zwróci nam true. A jak nie, to nie - będzie false.
         */

        String alaMaKota = "Ala ma kota";
        String ala = "Ala";
        boolean czyAlaMaKotaZaczynaSieOdAla = alaMaKota.startsWith(ala);

        //System.out.println("Czy 'Ala ma kota' zaczyna sie od 'Ala'? " + czyAlaMaKotaZaczynaSieOdAla);

        /*
            metodą substring(int, int) możemy wyciągnąć jakiś ciąg znaków ze Stringa

            pierwszy parametr to jest indeks pierwszego elementu od ktorego zaczynamy wyciaganie substringa
            drugi parametr to jest indeks ostatniego elementu

            ALE UWAŻAJ!!!

            Drugi parametr jest exclusive, to znaczy że DO NIEGO będzie wyciągany substring.

            W 'Ala ma kota' chcemy wyciągnąć początkowe 'Ala'
               ^^^^
               ||||
       Indeksy:0123
            Fajnie, aby wyciągnąć 'Ala' musimy podać do metody substring indeks początkowy, czyli 0 i 3.
            I substring sobie tak sobie będzie wyciągał tak:
            0 - A
            1 - l
            2 - a
            3 - tu już przestanę, i zwrócę Ci to co już mam...
         */

        String alaWyciagnietaSubstringiem = alaMaKota.substring(0, 3);
        //System.out.println(alaWyciagnietaSubstringiem); //    printnie Ala

        /*
            metoda contains poprostu sprawdza czy dany jakiś string znajduje się w interesujacym nas stringu.
         */
        boolean czyJestMa = alaMaKota.contains("ma");
        //System.out.println("Czy jest ma w Ala ma kota? " + czyJestMa);

        char mDuze = 'M';
        char mMale = 'm';

        //System.out.println("M jako int: " + (int) mDuze + "; m jako int: " + (int) mMale);

        String 	pierwszyStringAlaMaKota = new String("Ala ma kota");
        String  drugiStringAlaMaKota = new String("Ala ma kota");

		/*
		 * Stringi pierwszyStringAlaMaKota i drugiStringAlaMaKota moze i sa takim samym ciagiem znakow...
		 * Ale sa to inne obiekty.
		 */

        //	co zwroci ==
        //	a co .equals( ) ?
        //if(pierwszyStringAlaMaKota == drugiStringAlaMaKota)){
		if(pierwszyStringAlaMaKota.equals(drugiStringAlaMaKota)){
			//System.out.println("Sa rowne");
		} else {
			//System.out.println("Nie sa rowne...");
		}


        int randomowaLiczba = new Random().nextInt(101);


        Scanner scan = new Scanner(System.in);
        int ileRazyFailowales = 0;


		/*
		while(true){
			System.out.println("Daj mi liczbÍ!!! ");
			int wczytanaLiczba = scan.nextInt();

			if ( wczytanaLiczba < randomowaLiczba){

				System.out.println("Da≥aú mi liczbe mniejszĻ! Probuj wyŅej...");

			} else if ( wczytanaLiczba > randomowaLiczba) {

				System.out.println("Da≥aú mi liczbe wieksza! Probuj nizej...");

			} else {

				System.out.println("To jest ta liczba! Do krośset!!!");
				System.out.println("Failowa≥eú " + ileRazyFailowales + " razy...");
				// Jezeli trafimy liczbÍ, to break sprawi ze gra sie skonczy i wyjdziemy z pÍtli while(true)
				break;

			}

			ileRazyFailowales++;
		}
		*/

        int dzemTruskawkowy = 1,
                dzemPomaranczowy = 2,
                dzemGruszkowy = 3;


        System.out.println("Jaki lubisz dzem?");
        System.out.println("dzemTruskawkowy = 1, dzemPomaranczowy = 2, dzemGruszkowy = 3;");

        int lubianyDzem = scan.nextInt();

        switch(lubianyDzem){
            case 1:{
                System.out.println("Lubisz dzem truskawkowy.");
                break;
            }
            case 2:{
                System.out.println("Lubisz dzem pomaracznowy.");
                break;
            }
            case 3:{
                System.out.println("Lubisz dzem gruszkowy.");
                break;
            }
            default:{
                System.out.println("Nie znam tego dŅemu. Sorry...");
                break;
            }
        }



        int i5 = 5;

        /*
            Pętla Do...while wykona się przynajmniej raz zanim zostanie sprawdzony warunek.
            Zobacz ze warunek i5 > 1, albo 5 > 1 jest nieprawdziwy, ale mimo wszystko ta pętla przynajmniej raz się
            wykona!

            Pętla while natomiast na początku sprawdzi warunek i dopiero poźniej będzie printować.
            Z takim warunkiem w ogóle ona się nie wykona.
         */

        do {
            System.out.println("Do while! Przynajmniej raz!!!");
        } while (i5 > 1);

        while(i5 > 1){
            System.out.println("To sie nie wykona.");
        }


        /*
            Pętle 'while' i 'for' można by stosować zamiennie do wykonania tego samego zadania w ten sam sposób.
            Jednak for jest generalnie fajniejszy, bo jest krótszy i wiemy kiedy zachodzi inkrementacja.
         */

        int i = 0;
        int koniecIterowania = 5;
        while(i < 5){
            System.out.println(i);
            i++;
        }

        //	for jest jasniejszy...
        for(int i2 = 0; i2 < koniecIterowania; i2++){ // inkrementacja zachodzi na koncu petli...
            System.out.println(i);
        }

    }
}
