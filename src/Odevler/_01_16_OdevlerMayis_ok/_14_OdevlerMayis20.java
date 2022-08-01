package Odevler._01_16_OdevlerMayis_ok;

import java.util.Arrays;
import java.util.Scanner;

public class _14_OdevlerMayis20 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
//        1- 4 elemanlı bir dizi tanımlayınız değerlei kullanıcan alınız. Dizideki en küçük ve enbüyük elemanlar arasındaki farkı bulunuz.
       /*
        int[] dizi = new int[4];

        for (int i = 0; i < dizi.length; i++) {
            System.out.print("Sayı giriniz:");
            dizi[i] = oku.nextInt();
        }
        int enb = dizi[0];
        int enk = dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] > enb) {
                enb = dizi[i];
            }
            if (dizi[i] < enk) {
                enk = dizi[i];
            }
        }
        System.out.println("Dizi"+Arrays.toString(dizi));
        System.out.println("Fark="+ (enb - enk));
*/
//        2- 2x3 lük String bir tablo tanımlayınız, kullanıcıdan $22 veya $65  şeklinde para simgesi ve rakam olan değerlerle doldurunuz.
//           sonrasında bütün RAKAMLARI toplayıp toplam para değerini bulunuz.

        String[][] para = new String[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Değer giriniz:");
                para[i][j] = oku.nextLine();
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(Arrays.toString((para[j])));
            }
            System.out.println(Arrays.toString(para[i]));
        }
        int toplam=0;
        //int paraIn[][]=Integer.parseInt(para[][])

    }
}
//TODO ÖDEV EKSİK