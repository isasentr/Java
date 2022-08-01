package Gun13_mayis12;

import java.util.Scanner;

public class _02_IfElseIf {
    public static void main(String[] args) {
        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner oku = new Scanner(System.in);
        Scanner oku1 = new Scanner(System.in);

        System.out.print("1.sayıyı giriniz:");
        int sayi1 = oku.nextInt();

        System.out.print("2.sayıyı giriniz:");
        int sayi2 = oku.nextInt();

        System.out.println("İşlem seçiniz \nT-Toplama \nÇ-Çıkarma \nP-Çarpma \nB-Bölme \ngiriniz.");

        String islem = oku1.next().toUpperCase();
/*
        System.out.println("İşlem Sonucu:" + ((islem.equalsIgnoreCase("T") ? (sayi1 + sayi2) : (islem.equalsIgnoreCase("Ç") ? (sayi1 - sayi2) : (islem.equalsIgnoreCase("P") ? (sayi1 * sayi2) : (islem.equalsIgnoreCase("B") ? (sayi1 / sayi2) : ("HATALI VERİ GİRİLDİ")))))));

//        if(islem.equalsIgnoreCase("T"))
//            System.out.println("Toplam=" + ());

*/
if (islem.equalsIgnoreCase("T"))
            System.out.println("toplam= = " + (sayi1+sayi2));
        else
            if (islem.equalsIgnoreCase("Ç"))
                System.out.println("çıkartma= = " + (sayi1-sayi2));
            else
                if (islem.equalsIgnoreCase("P"))
                    System.out.println("çarpma= = " + (sayi1*sayi2));
                else
                    if (islem.equalsIgnoreCase("B"))
                        System.out.println("bölme= = " + (sayi1/sayi2));
                    else
                        System.out.println("Hatalı seçim");





    }
}
