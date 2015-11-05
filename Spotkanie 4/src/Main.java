public class Main {

    static int silnia(int n){
        if (n > 1){
            return n * silnia(n-1);
        }
        return 1;
    }

    static void helloWorldRekurencja(){
        int wartoscSilni = silnia(4);
        System.out.println(wartoscSilni);
    }


    public static void main(String[] args) {
        helloWorldRekurencja();
    }
}
