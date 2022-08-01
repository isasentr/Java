package Odevler._01_16_OdevlerMayis_ok;

import java.util.Scanner;

public class _05_OdevlerMayis05 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
/*
//1-Girilen bir cümlenin ilk ve son harfini bulunuz

        System.out.print("Cümle giriniz:");
        String text = oku.nextLine();
        Character ilkHarf = text.charAt(0);
        Character sonHarf = text.charAt(text.length() - 1);
        System.out.println("İlk harf ve son harf=" + ilkHarf + "," + sonHarf);

//2-Girilen 3 kelimelik bir cumleyi kelimelerine ayırınız

        System.out.print("Cümle giriniz:");
        String text1 = oku.nextLine();
        String ilkKelime = text1.substring(0, text1.indexOf(" ")).trim();
        String ikinciKelime = text1.substring(text1.indexOf(" "), text1.lastIndexOf(" ")).trim();
        String sonKelime = text1.substring(text1.lastIndexOf(" ") + 1).trim();

        System.out.println("ilkKelime:" + ilkKelime);
        System.out.println("ikinciKelime:" + ikinciKelime);
        System.out.println("sonKelime:" + sonKelime);

//3-Girilen 3 kelimelik bir cümlenin kelimelrinin ilk karakterlerini bulunuz

        System.out.print("Cümle giriniz:");
        String text1 = oku.nextLine();
        String ilkKelime = text1.substring(0, text1.indexOf(" ")).trim();
        String ikinciKelime = text1.substring(text1.indexOf(" "), text1.lastIndexOf(" ")).trim();
        String sonKelime = text1.substring(text1.lastIndexOf(" ") + 1).trim();

        System.out.println("ilkKelime_ilkHarf:" + ilkKelime.charAt(0));
        System.out.println("ikinciKelime_ilkHarf:" + ikinciKelime.charAt(0));
        System.out.println("sonKelime_ilkHarf:" + sonKelime.charAt(0));

//4-Girilen bir kelimenin içerisinde B harifnin geçip geçnmediğini bulunuz.

        System.out.print("Kelime giriniz:");
        String text1 = oku.nextLine();
        boolean varMI = text1.toUpperCase().contains("B");
        System.out.println("B harfi varMI = " + varMI);
*/
//5-Girilen bir kredi kartı bilgisini yandaki şekilde gösteriniz.  **** **** **** 4567

        System.out.println("Kredi kartı numaranızı giriniz:");
        String kNumara = oku.nextLine();
        String yildiz = kNumara.substring(0, kNumara.lastIndexOf(" ")).replaceAll("[0-9]", "*");
        String sonDort = kNumara.substring(kNumara.lastIndexOf(" ") + 1);
        System.out.println("\nKredi kartı numarası: \n" + yildiz.concat(" ").concat(sonDort));


       // Alternatif

//        System.out.print("Kredi kartı numaranızı giriniz: ");
//        String kKarti = oku.nextLine().trim();
//
//        String sonDort = kKarti.substring(kKarti.length()-4);
//
//        System.out.println("Kredi kartınız: " + "****-****-****-" + sonDort);

  /*
//6-Girilen bir cümledeki son kelimeyi bulunuz

        System.out.println("Cümle giriniz:");
        String text = oku.nextLine().trim();
        String sonKelime = text.substring(text.lastIndexOf(" ") + 1).trim();
        System.out.println("SonKelime =" + sonKelime);
    */
    }
}
