public class Main {
    public static void main(String[] args) {
        System.out.println("Ders 15 - YouTube");

        double[] myList = {1.2, 7.3, 4.3, 5.6};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println("Sayilar " + number);
        }
        System.out.println("Toplam = " + total);
        System.out.println("En Buyuk " + max);
    }
}