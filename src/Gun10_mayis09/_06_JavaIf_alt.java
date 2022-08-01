package Gun10_mayis09;

import java.util.Scanner;

public class _06_JavaIf_alt {

        public static void main(String[] args) {
            // Girilen 3 sayıdan en büyük olanı giriniz.

            Scanner oku = new Scanner(System.in);

            System.out.print("1.Sayı giriniz:");
            int sayi1 = oku.nextInt();

            System.out.print("2.Sayı giriniz:");
            int sayi2 = oku.nextInt();

            System.out.print("3.Sayı giriniz:");
            int sayi3 = oku.nextInt();

            int enb=sayi1;

            if(sayi2>enb){
                enb=sayi2;
            }
            if(sayi3>enb){
                enb=sayi3;
            }
            System.out.println("enb = " + enb);


        }
}