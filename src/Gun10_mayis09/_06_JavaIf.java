package Gun10_mayis09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {
        // Girilen 3 sayıdan en büyük olanı giriniz.

        Scanner oku = new Scanner(System.in);

        System.out.print("1.Sayı giriniz:");
        int sayi1 = oku.nextInt();

        System.out.print("2.Sayı giriniz:");
        int sayi2 = oku.nextInt();

        System.out.print("3.Sayı giriniz:");
        int sayi3 = oku.nextInt();

        if (sayi1>sayi2){
            if (sayi1>sayi3){
                System.out.println("sayi1 = " + sayi1);
            }
        }
        if (sayi2>sayi3) {
            if (sayi2 > sayi1) {
                System.out.println("sayi2 = " + sayi2);
            }
        }
        if (sayi3>sayi1) {
            if (sayi3 > sayi2) {
                System.out.println("sayi3 = " + sayi3);
            }
        }
    }
}
