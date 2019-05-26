package perfectnumber;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        int sayi;
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Tamsayi gir : ");
        sayi = inputScanner.nextInt();

        int toplam = toplama(sayi);
        System.out.println(toplam);

    }

    public static int toplama(int sayi) {
        int kalan = 0;
        if (sayi <= 0) {
            return 0;
        }
        if (sayi != 0) {
            kalan = sayi % 10;
            int toplam = kalan;
        }

        return kalan + toplama((sayi - kalan) / 10);

    }

}
