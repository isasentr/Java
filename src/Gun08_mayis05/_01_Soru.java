package Gun08_mayis05;

import java.util.Scanner;

public class _01_Soru {
    public static void main(String[] args) {
        //Ayrı ayrı girilen ad ve soyadı aralarında bir boşluk koyarak birleştiriniz.
        Scanner oku = new Scanner(System.in);

        System.out.print("Ad giriniz :");
        String ad =oku.nextLine();

        System.out.print("Soyad giriniz:");
        String soyad = oku.nextLine();

        System.out.println("Ad soyad :"+ad.concat(" ").concat(soyad));
        System.out.println("Ad soyad :"+ad.concat(" "+soyad));

//// Ayrı ayrı girilen ad ve soyadı aralarında bir boşluk koyarak birleştiriniz.
//
//        Scanner oku=new Scanner(System.in);
//        System.out.print("Adınızı giriniz=");
//        String ad=oku.next();
//
//        System.out.print("Soyadınızı giriniz=");
//        String soyad=oku.next();
//
//        String adSoyad= ad.concat(" ").concat(soyad);
//        System.out.println("adSoyad = " + adSoyad);


    }
}
