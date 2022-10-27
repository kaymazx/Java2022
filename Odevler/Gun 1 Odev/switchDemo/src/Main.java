public class Main {
    public static void main(String[] args) {
        System.out.println("Ders 10 - YouTube");
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Mukemmel,Gectiniz!");
                break;
            case 'B':
                // System.out.println("Basarili,Gectiniz!"); //B - C Ayni ciktiyi verir.
                // break;
            case 'C':
                System.out.println("Iyi,Gectiniz!");
                break;
            case 'D':
                System.out.println("Fena degil,Gectiniz!");
                break;
            case 'F':
                System.out.println("Kaldiniz!");
                break;
            default:
                System.out.println("Gecersiz not girdiniz.");
        }
    }
}