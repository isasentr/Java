package Gun10_mayis09;

import java.util.Scanner;

public class _02_JavaIf {

    public static void main(String[] args) {
        //Girilen bir sayının negatif mi,pozitif mi olduğunu yazdırınız.
        //Sıfır ise sıfır yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = oku.nextInt();

        if (sayi > 0) {
            System.out.print("Sayı pozitif");
        }
        if (sayi < 0) {
            System.out.println("Sayı negatif ");
        }
        if (sayi == 0) {
            System.out.println("Sayı sıfıra eşit");
        }
    }

}

