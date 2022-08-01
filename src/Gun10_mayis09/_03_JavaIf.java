package Gun10_mayis09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {
        //Girilen ik sayının büyük olanının değerini ekrana yazdırınız.
        //Eşit ise eşit yazdırınız.

        Scanner oku = new Scanner(System.in);
        int sayi1,sayi2;
        System.out.print("1. Sayı giriniz: ");
        sayi1=oku.nextInt();
        System.out.print("2. Sayı giriniz: ");
        sayi2= oku.nextInt();

        if (sayi1>sayi2){
            System.out.println("sayi1 = " + sayi1);
        }
        if (sayi2>sayi1){
            System.out.println("sayi2 = " + sayi2);
        }
        if (sayi1==sayi2){
            System.out.println("Sayılar eşit");

        }


    }
}
