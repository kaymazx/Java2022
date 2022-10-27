public class Main {
    public static void main(String[] args) {
        System.out.println("Ders 11/12/13 - YoTube");

        //for
        for (int i = 1; i <=10; i++) { // i<10 - i<=10 olarak degisir ise 10'da kapsanır.
            System.out.println(i);
        }
        System.out.println("For Dongusu bitti.");

        for (int i = 1; i < 10; i += 2) { // i++ - i+=2 olursa tek sayilari yazdirir. +2 ekler.
            System.out.println(i);
        }
        System.out.println("For Dongusu bitti.");

        for (int i = 2; i < 10; i += 2) { // i=1 - i=2 olur ve i+=2 olur ise cift sayilari yazdirir.
            System.out.println(i);
        }
        System.out.println("For Dongusu bitti.");


        //While
        int i = 2;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("While Dongusu bitti.");


        //Do-While
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);
        System.out.println("Do-While Dongusu bitti.");
        //Sart Uymayan Do-While
        int X = 100;
        do {
            System.out.println(X);
            X+=2;
        } while (X < 10);
        System.out.println("Sart Uymayan Do-While Dongusu bitti.");
        //Sart uymasa bile bir kez calisacaktir.
        //ornek: dongunun calistigina dair log atmak.




    }
}