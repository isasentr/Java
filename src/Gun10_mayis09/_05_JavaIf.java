package Gun10_mayis09;

import java.util.Scanner;

public class _05_JavaIf {
    public static void main(String[] args) {
        //Girilen bir sayının birler basamağını yazı ile yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int sayi = oku.nextInt();
        int b = sayi%10;

        if(b==0){
            System.out.println("Sıfır");
        }
        if(b==1) {
            System.out.println("Bir");
        }
        if(b==2) {
            System.out.println("İki");
        }
        if(b==3) {
            System.out.println("Üç");
        }
        if(b==4) {
            System.out.println("Dört");
        }
        if(b==5) {
            System.out.println("Beş");
        }
        if(b==6) {
            System.out.println("Altı");
        }
        if(b==7) {
            System.out.println("Yedi");
        }
        if(b==8) {
            System.out.println("Sekiz");
        }
        if(b==9) {
            System.out.println("Dokuz");
        }
    }
}
