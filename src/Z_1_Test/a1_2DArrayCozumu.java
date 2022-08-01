package Z_1_Test;

import java.util.ArrayList;
import java.util.Scanner;

public class a1_2DArrayCozumu {
    public static void main(String[] args) {
        /******************************/
        int sayi = 5; // tek veri sağlayabilen değişken
        int[] dizi = new int[20]; // 20 adet veri saklayabilen değişken
        int[][] tablo = new int[20][4]; // 20*4 tane veri saklayabilen değişkendir.


        ArrayList<Integer> liste = new ArrayList<>(); // istenildiği kadar rakam eklenebilen değişken.

        /*****************************************/


        //3 öğrencinin mat fiz kimay not tek bir yerde birleştiricez

        ArrayList<ArrayList<Integer>> notlarListesi = new ArrayList<>(); // listelerin listesi 2 boyurlu
        //bunun her bir elemanı Arraylist.

        ArrayList<Integer> matNotlar = new ArrayList<>();
        matNotlar.add(60);
        matNotlar.add(70);
        matNotlar.add(80);

        ArrayList<Integer> fizNotlar = new ArrayList<>();
        fizNotlar.add(10);
        fizNotlar.add(20);
        fizNotlar.add(30);

        ArrayList<Integer> kimNotlar = new ArrayList<>();
        kimNotlar.add(39);
        kimNotlar.add(55);
        kimNotlar.add(65);


        notlarListesi.add(matNotlar);
        notlarListesi.add(fizNotlar);
        notlarListesi.add(kimNotlar);

        //--------------------

        ArrayList<String> dersler = new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("fizik");
        dersler.add("kimya");

        notlarListesi.get(0);
        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.println(dersler.get(i));
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                System.out.println("[" + i + "]" + "[" + j + "]=" + notlarListesi.get(i).get(j));
            }
            System.out.println();
        }
        //-----------------------------

        // TODO: Soru 1: Kullanıcıdan alınan ders nosuna göre ekrana Notların Listesini
        //  bir fonksiyonda yazdırınız.

        Scanner oku1 = new Scanner(System.in);
        System.out.println("Ders Seciniz:(0-Mat , 1-Fiz , 2-Kim");
        int secim = oku1.nextInt();

        dersNotlarıYazdir(secim, notlarListesi, dersler);
        System.out.println();

        int ortlama = dersOrtalamaYazdır(secim, notlarListesi, dersler);
        System.out.println("ortlama = " + ortlama);

        int tumOrtalama = tumDersOrtalamaYazdır(secim, notlarListesi, dersler);
        System.out.println();
        System.out.println("tumOrtalama = " + tumOrtalama);

        System.out.println();

        int enb = notlarListesi.get(0).get(0);
        int enk = notlarListesi.get(0).get(0);
        for (int i = 0; i < notlarListesi.size(); i++) {
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                if (notlarListesi.get(i).get(j) > enb) {
                    enb = notlarListesi.get(i).get(j);
                }

                if (notlarListesi.get(i).get(j) < enk) {
                    enk = notlarListesi.get(i).get(j);
                }

            }
        }
        System.out.println("En büyük sayı :" + enb + " En küçük sayı :" + enk);
    }

    public static void dersNotlarıYazdir(int secim, ArrayList<ArrayList<Integer>> notlarListesi, ArrayList<String> dersler) {

        System.out.println(dersler.get(secim));

        System.out.print(notlarListesi.get(secim) + ",");

        for (int j = 0; j < notlarListesi.get(secim).size(); j++) {
            System.out.print(notlarListesi.get(secim).get(j) + ",");

        }
    }

    // TODO: Soru 2 : Yukarıda Girilen Derse ait ortalamayı main de yazdırınız.

    public static int dersOrtalamaYazdır(int secim, ArrayList<ArrayList<Integer>> notlarListesi, ArrayList<String> dersler) {

        int toplam = 0;
        for (int j = 0; j < notlarListesi.get(secim).size(); j++) {
            toplam += notlarListesi.get(secim).get(j);
        }
        return toplam / notlarListesi.get(secim).size();
    }

    // TODO Soru 3 : Tüm Derslerin Not yani tum notların ortalamasını(double) bir fonksiyonda buldurup mainde yazdırınız.
    public static int tumDersOrtalamaYazdır(int secim, ArrayList<ArrayList<Integer>> notlarListesi, ArrayList<String> dersler) {

        int toplam = 0;
        int sayac = 0;
        for (int i = 0; i < notlarListesi.size(); i++) {
            for (int j = 0; j < notlarListesi.get(i).size(); j++) {
                System.out.print(notlarListesi.get(i).get(j) + ",");
                toplam += notlarListesi.get(i).get(j);
                sayac++;
            }
        }
        return toplam / sayac;

    }

    // TODO Soru 4 : En büyük ve en küçük notu bir maın ıcınde bulunuz (fonksiyon yok)


}


