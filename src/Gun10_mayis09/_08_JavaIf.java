package Gun10_mayis09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {
        //Girilen bir sayının birler ve onlar basamağının eşit olup olmadığını yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi =oku.nextInt();

        int on=(sayi/10)%10;
        int bir =sayi%10;

        if(on==bir) {
            System.out.print("birler ve onlar basamağının eşit");
        }
        if(on!=bir) {
            System.out.print("birler ve onlar basamağının eşit değil");
        }
    }
}
