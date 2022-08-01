package Odevler._01_16_OdevlerMayis_ok;

import java.util.Scanner;

public class _10_OdevlerMayis12 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        //1- Girilen bir ay numarasına göre , ayın hem adını hem de kaç gün olduğunu sayı ile yazdırınız
/*
        System.out.print("1-12 arası ay numarası giriniz: = ");
        int ay = oku.nextInt();
        switch (ay){
            case 1:
                System.out.println("Ocak-31 gün");break;
            case 2:
                System.out.println("Şubat-28 gün");break;
            case 3:
                System.out.println("Mart-31 gün");break;
            case 4:
                System.out.println("Nisan-30 gün");break;
            case 5:
                System.out.println("Mayıs-31 gün");break;
            case 6:
                System.out.println("Haziran-30 gün");break;
            case 7:
                System.out.println("Temmuz-31 gün");break;
            case 8:
                System.out.println("Ağustos-31 gün");break;
            case 9:
                System.out.println("Eylül-30 gün");break;
            case 10:
                System.out.println("Ekim-31 gün");break;
            case 11:
                System.out.println("Kasım-30 gün");break;
            case 12:
                System.out.println("Aralık-31 gün");break;
            default:
                System.out.println("Hatalı veri girildi");break;
        }
        */
        //2- Girilen 3 basamaklı bir sayıyı yazı ile yazdırınız.
/*

        System.out.print("Bir sayı giriniz= ");
        int sayi = oku.nextInt();
        int birler = sayi % 10;
        int onlar = (sayi / 10) % 10;
        int yüzler = (sayi / 100) % 10;

        switch (yüzler) {
            case 1:
                System.out.print("yüz");
                break;
            case 2:
                System.out.print("ikiyüz");
                break;
            case 3:
                System.out.print("üçyüz");
                break;
            case 4:
                System.out.print("dörtyüz");
                break;
            case 5:
                System.out.print("beşyüz");
                break;
            case 6:
                System.out.print("altıyüz");
                break;
            case 7:
                System.out.print("yediyüz");
                break;
            case 8:
                System.out.print("sekizyüz");
                break;
            case 9:
                System.out.print("dokuzyüz");
                break;
            default:
                System.out.println("");
                break;
        }

        switch (onlar) {
            case 1:
                System.out.print("on");
                break;
            case 2:
                System.out.print("yirmi");
                break;
            case 3:
                System.out.print("otuz");
                break;
            case 4:
                System.out.print("kırk");
                break;
            case 5:
                System.out.print("elli");
                break;
            case 6:
                System.out.print("altmış");
                break;
            case 7:
                System.out.print("yetmiş");
                break;
            case 8:
                System.out.print("seksen");
                break;
            case 9:
                System.out.print("doksan");
                break;
            default:
                System.out.print("");
                break;
        }

        switch (birler) {
            case 1:
                System.out.print("bir");
                break;
            case 2:
                System.out.print("iki");
                break;
            case 3:
                System.out.print("üç");
                break;
            case 4:
                System.out.print("dört");
                break;
            case 5:
                System.out.print("beş");
                break;
            case 6:
                System.out.print("altı");
                break;
            case 7:
                System.out.print("yedi");
                break;
            case 8:
                System.out.print("sekiz");
                break;
            case 9:
                System.out.print("dokuz");
                break;
            default:
                System.out.print("");
                break;
        }
*/

        //3- 20-80 arasında üretilen bir sayının birler basamağını yazı ile yazdırınız.
        System.out.print("Min: ");
        int min =oku.nextInt();
        System.out.print("Max: ");
        int max = oku.nextInt();
        int randomSayi = (int) (Math.random() * (max - min) + min);
        System.out.println("("+randomSayi+")");

        int birler = randomSayi % 10;
        int onlar = (randomSayi / 10) % 10;

        switch (onlar) {
            case 1:
                System.out.print("on");
                break;
            case 2:
                System.out.print("yirmi");
                break;
            case 3:
                System.out.print("otuz");
                break;
            case 4:
                System.out.print("kırk");
                break;
            case 5:
                System.out.print("elli");
                break;
            case 6:
                System.out.print("altmış");
                break;
            case 7:
                System.out.print("yetmiş");
                break;
            case 8:
                System.out.print("seksen");
                break;
            case 9:
                System.out.print("doksan");
                break;
            default:
                System.out.println();
                break;
        }

        switch (birler) {
            case 1:
                System.out.print("bir");
                break;
            case 2:
                System.out.print("iki");
                break;
            case 3:
                System.out.print("üç");
                break;
            case 4:
                System.out.print("dört");
                break;
            case 5:
                System.out.print("beş");
                break;
            case 6:
                System.out.print("altı");
                break;
            case 7:
                System.out.print("yedi");
                break;
            case 8:
                System.out.print("sekiz");
                break;
            case 9:
                System.out.print("dokuz");
                break;
            default:
                System.out.println();
                break;
        }

    }
}
