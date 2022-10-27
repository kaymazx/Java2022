public class Main {
    public static void main(String[] args) {
        System.out.println("Ders 19 - YouTube");
        //bug
        int number = 7;
        int remainder = number % 2;
        // System.out.println(remainder);
        boolean isPrime = true;

        if (number==1){
            System.out.println("Sayi Asal Degildir.");
            return;
        }

        if (number<1){
            System.out.println("Gecersiz Sayi.");

        }

        for (int i=2; i<number;i++){
            if(number % i == 0){
                isPrime = false;
            }
        }
        if (isPrime){
            System.out.println("Sayi Asaldir.");
        }else {
            System.out.println("Sayi Asal Degildir.");
        }
    }
}