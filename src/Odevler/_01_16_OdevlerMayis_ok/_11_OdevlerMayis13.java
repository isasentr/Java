package Odevler._01_16_OdevlerMayis_ok;

import java.util.Scanner;

public class _11_OdevlerMayis13 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

//        1- Girilen bir sayıya kadar olan sayıların çarpım sonucunu bulunuz.
/*
        System.out.print("Sayı giriniz:");
        int sayi=oku.nextInt();

        int sayac=1,carpım=1;
        while (sayac<=sayi){
            carpım*=sayac;
            sayac++;
        }
        System.out.println("carpım = " + carpım);
*/

//        2- 0-100 arasındaki sayılardan teklerin ayrı çiftleri ayrı toplamını bulunuz.
/*

        int sayi = 100;
        int sayac = 0, cToplam = 0, tToplam = 0;
        while (sayac <= sayi) {
            if (sayac % 2 == 0) {
                cToplam += sayac;
            }
            if (sayac % 2 == 1) {
                tToplam += sayac;
            }
            sayac++;
        }
        System.out.println("Tek Sayılar toplamı:" + tToplam);
        System.out.println("Çİft Sayılar toplamı:" + cToplam);
*/

//        3- 100 den 0 a kadar olan tüm tek sayıları ekrana yazdırınız.
/*
        int sayi = 0;
        int sayac = 100;
        while (sayac >= sayi) {
            if (sayac % 2 == 1) {
                System.out.println(sayac);
            }
            sayac--;
        }
        */
//        4- 0 ile 100 arasındaki sayılardan hem 4 e hem de 5 tam bölünebilen sayıları ekrana yazdırınız.
/*
        int sayi = 100;
        int sayac = 0;
        while (sayac <= sayi) {
            if (sayac % 4 == 0 && sayac%5==0) {
                System.out.println(sayac);
            }
            sayac++;
        }
*/

//        5- Sayı bulmaca oyununu tam hali ile cözünüz.

        System.out.print("Max tahmin aralığını giriniz:");
        int sayi = oku.nextInt();
        int sayac = 3;

        int randomSayi = (int) (Math.random() * sayi);
        System.out.println("randomSayi = " + randomSayi);
        System.out.println();

        int tahminSayi;
        do {
            System.out.print("Tahmin ettiğiniz sayısı giriniz:");
            tahminSayi = oku.nextInt();

            if (tahminSayi < randomSayi) {
                System.out.println("Tahminini artır");
            } else if (tahminSayi > randomSayi) {
                System.out.println("Tahminini düşür");
            }
            sayac--;
            System.out.println("Kalan tahmin hakkı:" + sayac);
            System.out.println();
        } while ((!(tahminSayi == randomSayi)) && sayac != 0);
        if (tahminSayi == randomSayi) {
            System.out.println("Tebrikler Bildiniz");
        } else {
            System.out.println("Tahmin hakkınız kalmadı.");
        }

    }
}
