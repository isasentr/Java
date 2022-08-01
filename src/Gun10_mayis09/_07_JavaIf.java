package Gun10_mayis09;

import java.util.Scanner;

public class _07_JavaIf {
    public static void main(String[] args) {
        //Girilen bir öğrencinin notuna göre 50 den büyük-eşit ise geçtiniz,
        //Küçük ise kaldınız yazdırınız.

        Scanner oku = new Scanner(System.in);

        System.out.print("Sayı giriniz:");

        int not = oku.nextInt();

        if (not>=50){
            System.out.print("Geçtiniz");
        }
        if (not<50){
            System.out.print("Kaldınız");
        }
    }
}
