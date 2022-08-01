package Gun23_mayis26;

import java.util.ArrayList;
import java.util.Scanner;

public class Java2DArrayList {
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

        notlarListesi.get(0); // herbir elemanı bir liste
        notlarListesi.get(0).get(0); // 0. listenin sıfırıncı elmanın verir.


        System.out.println("notlarListesi = " + notlarListesi.get(0));// 0. liste
        System.out.println("notlarListesi = " + notlarListesi.get(1));// 1. liste
        System.out.println("notlarListesi = " + notlarListesi.get(2));// 2. liste

        //yukarıdakilerib yerine döngü

        for (int i = 0; i < notlarListesi.size(); i++) {
            System.out.println("notlarListesi = " + notlarListesi.get(i));
        }


        ArrayList<String> dersler = new ArrayList<>();
        dersler.add("Matematik");
        dersler.add("Fizik");
        dersler.add("Kimya");

        // tüm notlar tek tek nasıl yazılır

        for (int i = 0; i < notlarListesi.size(); i++) { //liste uzunluğu yani yaprak sayısı
            System.out.println(dersler.get(i)); //ders isismlerini yazdık
            for (int j = 0; j < notlarListesi.get(i).size(); j++) { //her bir listedeki notların sayısı

                System.out.print((i + 1) + ".yaprak, " + (j + 1) + ".not=");
                System.out.println(notlarListesi.get(i).get(j)); // satır sütün yapısıs [i] [j]


            }
        }
        //Soru 1: Kullanıcıdan alınan ders nosuna göre ekrana Notların Listesini bir fonksiyonda
        //        yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("DersNo (0-Mat, 1-Tur, 2- Kim :");
        int dersNo = oku.nextInt();

        dersNotlarıYazdir(notlarListesi, dersNo, dersler); //GÖNDERME

        int ortalama = dersOrtalamaBul(dersNo, notlarListesi); //Soru 2 : Yukarıda Girilen Derse ait ortalamayı main de yazdırınız.
        System.out.println("Ort =" + ortalama);

        dersOrtalamaBul1(dersNo, notlarListesi); //Soru 2 : Yukarıda Girilen Derse ait ortalamayı fonksiyonda yazdırınız.

        //Soru 3 : Tüm Derslerin Not yani tum notların ortalamasını(double) bir fonksiyonda buldurup mainde yazdırınız.


        // Soru 4 : En büyük ve en küçük notu bir maın ıcınde bulunuz (fonksiyon yok)


    }

    public static void dersNotlarıYazdir(ArrayList<ArrayList<Integer>> notlarListesi, int dersNo, ArrayList<String> dersler) {
        System.out.println(dersler.get(dersNo)); // dersin adı yazıldı

        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            System.out.println("notlarListesi = " + notlarListesi.get(dersNo).get(i));

        }
    }

    //Soru 2 : Yukarıda Girilen Derse ait ortalamayı main de yazdırınız.

    public static int dersOrtalamaBul(int dersNo, ArrayList<ArrayList<Integer>> notlarListesi) {
        int toplam = 0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++)
            toplam += notlarListesi.get(dersNo).get(i);
        int ort = toplam / notlarListesi.get(dersNo).size();
        return ort;
    }

    //Soru 2 : Yukarıda Girilen Derse ait ortalamayı fonksiyonda yazdırınız.
    public static void dersOrtalamaBul1(int dersNo, ArrayList<ArrayList<Integer>> notlarListesi) {
        int toplam = 0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++)
            toplam += notlarListesi.get(dersNo).get(i);
        int ort = toplam / notlarListesi.get(dersNo).size();
        System.out.println("ortalama fonksiyonda yaz:" + ort);
    }


}