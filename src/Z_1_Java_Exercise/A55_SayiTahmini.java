package Z_1_Java_Exercise;

import java.util.Random;
import java.util.Scanner;

public class A55_SayiTahmini {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int tahmin,can=5,sayac=0;
        int tutulanSayi= rand.nextInt(100);
        System.out.println("tutulanSayi = " + tutulanSayi);

        boolean oyunDurum = false, hata=false;

        int[] tahminler = new int[5];
        System.out.println("0-99 arası sayı Giriniz:");

        while(0<can){
            System.out.print("Tahmin:");
            tahmin= scan.nextInt();
            if(tahmin<0 && tahmin>100){
                if (hata){
                    System.out.println("Hatalı giriş yaptınız.");
                    System.out.println("Kalan can: " + --can);
                }else {
                    hata=true;
                    System.out.println("Lütfen 0 - 99 arası sayı giriniz.");
                    }continue;
            }
             tahminler[sayac++]=tahmin;
            if (tahmin==tutulanSayi){
                oyunDurum=true;
                break;
            }else {
                System.out.println("Yanlış kalan can: " + --can);
            }
        }
        if (oyunDurum) {
            System.out.println("Tebrikler Doğru Tahmin");
            System.out.println("Tutulan Sayı :" +tutulanSayi);
            System.out.println("Kalan can:" + can);
        }else {
            System.out.println("Başaramadınız");
        }
        System.out.print("Tahminleriniz : ");
        for(int value :tahminler){
            if(value !=0)
                System.out.print(value + " , ");
        }

    }
}
