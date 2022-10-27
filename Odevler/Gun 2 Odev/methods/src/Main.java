public class Main {
    public static void main(String[] args) {
        System.out.println("Ders 24 - YouTube");
        sayiBulmaca();
    }

    public static void sayiBulmaca() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9};
        int aranacak = 3;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;

            }
        }
        String mesaj = "";
        if (varMi) {
            mesaj = "Sayi Mevcuttur: " + aranacak;
            mesajVer(mesaj);
        } else {
            mesajVer("Sayi Mevcut Degildir : " + aranacak);
        }
    }

    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);


    }

}