public class Main {
    public static void main(String[] args) {
        System.out.println("Ders 14 - YouTube");

        String ogrenci1 = "Rhaegal";
        String ogrenci2 = "Viserion";
        String ogrenci3 = "Drogon";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        System.out.println("-------------");

        String[] ogrenciler = new String[3];
        ogrenciler[0]="Rhaegal";
        ogrenciler[1]="Viserion";
        ogrenciler[2]="Drogon";
        //ogrenciler[3]="Dracarys!"; ArrayIndexOutOfBoundsException

        for (int i=0; i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
        }
        System.out.println("-------------");
        for (String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }

    }
}