package Odevler._18_OdevlerHaziran06_ok;

import java.util.ArrayList;

public class _01 {
    //Aşağıdaki düzende tek line verilen 5 adet eleman , aşağıdaki okuma ile
    //ilki 3 ,ikincisi 2 elemanlı 2 adet diziye atılmaktadır.Bu kod vardır.
    //İkinci dizinin tüm elemanları 1.nin içerisinde var ise true, yok ise false
    //gönderiniz.
    //1 2 3 2 3 → 1.dizi : 1,2,3  / 2.Dizi : 2,3 => true
    //10 20 3 1 2 → 1.dizi : 10 20 3 2.Dizi : 1,2 => false

    public static void main(String[] args) {
        int dizi1[] = {1, 2, 3};
        int dizi2[] = {2, 3};
        System.out.println(sonuc(dizi1,dizi2));

        int dizi3[] = {10, 20, 3};
        int dizi4[] = {1, 2};
        System.out.println(sonuc(dizi3,dizi4));
    }

    public static boolean sonuc(int diz1[], int diz2[]) {
        ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
        for (int i = 0; i < diz1.length; i++) {
            arraylist1.add(diz1[i]);
        }
        ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
        for (int i = 0; i < diz2.length; i++) {
            arraylist2.add(diz2[i]);
        }
        return arraylist1.containsAll(arraylist2);
    }
}
