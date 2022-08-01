package Gun26_haziran01._05_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class Kampus {
    public static void main(String[] args) {
        // Bir kampus programı için aşağıdaki bilgilerin
        // kaydedileceği classları yazınız.
        //Okul : adi,mudurAdi,ucreti(double)
        //Ogrenci : okulNo, tamAd, okulu

        // bu şekilde 1 öğrenci tanımlayıp bütün bilgileri kendiniz atayıp
        // yazdırınız.
        Scanner scan = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);

        ArrayList<okul> okulArray = new ArrayList<>();
        ArrayList<ogrenci> ogrenciArray = new ArrayList<>();

        okul okuOkul = new okul();
        System.out.println("Okul bilgileri:");

        System.out.print("Okul adını giriniz :");
        okuOkul.adi=scan.nextLine();

        System.out.print("Müdürün adını giriniz :");
        okuOkul.mudurAdi=scan.nextLine();

        System.out.print("Okul ücretini giriniz :");
        okuOkul.ucreti=scanInt.nextInt();

        // "----------------------------"

        ogrenci okuOgrenci = new ogrenci();
        System.out.println("Öğrenci bilgileri:");

        System.out.print("Okulno giriniz :");
        okuOgrenci.okulNo=scanInt.nextInt();

        System.out.print("Öğrenci adını giriniz :");
        okuOgrenci.tamAd=scan.nextLine();

        System.out.print("Okul adını giriniz :");
        okuOgrenci.okulu=scan.nextLine();

        okulArray.add(okuOkul);
        ogrenciArray.add(okuOgrenci);

        okulyazdir(okulArray);
        ogrenciyazdir(ogrenciArray);
    }
    static void okulyazdir(ArrayList<okul> kamps1){
        for ( okul o:kamps1 )
            System.out.println(o.adi+" "+o.mudurAdi+" "+o.ucreti);
    }
    static void ogrenciyazdir(ArrayList<ogrenci> kamps2){
        for ( ogrenci k:kamps2 )
            System.out.println(k.okulNo+" "+k.tamAd+" "+k.okulu);
    }




}
