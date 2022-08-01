package Z_1_Test;

import java.util.ArrayList;
import java.util.Scanner;

public class a3 {
    public static void main(String[] args) {

        // Bir kampus programı için aşağıdaki bilgilerin
        // kaydedileceği classları yazınız.
        //Okul : adi,mudurAdi,ucreti(double)
        //Ogrenci : okulNo, tamAd, okulu

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz atayıp
        // yazdırınız.
        Scanner oku = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);

        ArrayList<a3_okul> list = new ArrayList<>();
        a3_okul okl = new a3_okul();
        okl.adi = oku.nextLine();
        okl.mudurAdi = oku.nextLine();
        okl.ucret = okuInt.nextDouble();
        list.add(okl);

        ArrayList<a3_ogrenci> list1 = new ArrayList<>();
        a3_ogrenci ogr = new a3_ogrenci();
        ogr.okulNo = okuInt.nextInt();
        ogr.tamAd = oku.nextLine();
        ogr.okulu = oku.nextLine();
        list1.add(ogr);

        okulyazdir(list);

        ogrenciyazdir(list1);

    }

    public static void okulyazdir(ArrayList<a3_okul> list) {
        for (a3_okul ok : list) {
            System.out.println(ok.adi + "-" + ok.mudurAdi + " - " + ok.ucret);
        }
    }

    public static void ogrenciyazdir(ArrayList<a3_ogrenci> list1) {
        for (a3_ogrenci ogr : list1) {
            System.out.println(ogr.okulNo + "-" + ogr.tamAd + " - " + ogr.okulu);
        }
    }
}