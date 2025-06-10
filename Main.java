import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("KM bilgisini giriniz : ");
        double km = scan.nextDouble();

        double acilis = 10.00;
        double kmbasina = 2.20;

        double toplam = acilis + (km * kmbasina);
        if (toplam < 20 ) {
            toplam = 20;
        }
        System.out.print("Toplam taksimetre ücreti : " + toplam);
     }
}