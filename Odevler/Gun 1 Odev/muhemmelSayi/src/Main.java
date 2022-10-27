public class Main {
    public static void main(String[] args) {
        System.out.println("Ders 21 - YouTube");

        //6 -- 1,2,3 = 6
        //28 -- 1,2,4,7,14 = 28
        int number = 58;
        int total = 0;

        for (int i=1;i<number;i++){
            if (number % i ==0){
                total = total +i;
            }
        }
        if (total== number){
            System.out.println("Mukemmel Sayidir");
        }else {
            System.out.println("Muhemmel Sayi Degildir.");
        }
    }
}