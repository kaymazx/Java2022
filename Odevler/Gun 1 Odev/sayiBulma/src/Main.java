public class Main {
    public static void main(String[] args) {
        System.out.println("Ders 23 - YouTube");

        int[] sayilar = new int[]{1, 2, 5, 7, 9};
        int aranacak = 3;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;

            }
        }
        if (varMi){
            System.out.println("Sayi Mevcuttur.");
        }else {
            System.out.println("Sayi Mevcut Degildir.");
        }
    }
}