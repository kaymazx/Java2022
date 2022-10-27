public class Main {
    public static void main(String[] args) {
        System.out.println("Ders 37 - YouTube");

//        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
//        ogretmenKrediManager.Hesapla();


        KrediUI krediUI = new KrediUI();
        krediUI.KrediHesapla(new AskerKrediManager());

    }
}