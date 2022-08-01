package Z_1_Test;

import java.util.ArrayList;
import java.util.Scanner;

public class a4_array_yazdirma_metod {
    public static void main(String[] args) {
        // Bir okulda kayıt programı için Ogrenci bilgilerini alan modül
        // yazılacaktır. Ogrenci ye ait bilgiler (adi, soyadi, sinifi ve adres) vardır.

        // Kullanıcıdan 3 adet öğrenci bilgileri alarak doldurunuz.
        // Daha sonra bunların bilgilerini yazdırınız.
        ArrayList<ogrenci1> list = new ArrayList<>();

        bilgiYazdir(bilgigir(list));
    }

    static ArrayList bilgigir(ArrayList<ogrenci1> list1) {
        Scanner oku = new Scanner(System.in);
        ArrayList<ogrenci1> list = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            ogrenci1 ogr = new ogrenci1();
            System.out.println("Öğrenci adını giriniz=");
            ogr.adi = oku.nextLine();
            System.out.println("Öğrenci soyadi giriniz=");
            ogr.soyadi = oku.nextLine();
            System.out.println("Öğrenci sinifi giriniz=");
            ogr.sinifi = oku.nextLine();
            System.out.println("Öğrenci adres giriniz=");
            ogr.adres = oku.nextLine();
            list.add(ogr);
        }
        return list;
    }

    static void bilgiYazdir(ArrayList<ogrenci1> list) {

        for (ogrenci1 k : list) {
            System.out.println("k.adi = " + k.adi);
            System.out.println("k.soyadi = " + k.soyadi);
            System.out.println("k.sinifi = " + k.sinifi);
            System.out.println("k.adres = " + k.adres);
        }
    }
}

class ogrenci1 {
    String adi;
    String soyadi;
    String sinifi;
    String adres;
}
