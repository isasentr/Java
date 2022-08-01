package Gun26_haziran01._02_Soru;
import java.util.ArrayList;
import java.util.Scanner;

public class _02_Okul {
    public static void main(String[] args) {
        // Bir okulda kayıt programı için Ogrenci bilgilerini alan modül
        // yazılacaktır. Ogrenci ye ait bilgiler (adi, soyadi, sinifi ve adres) vardır.

        // Kullanıcıdan 3 adet öğrenci bilgileri alarak doldurunuz.
        // Daha sonra bunların bilgilerini yazdırınız.

        Scanner oku = new Scanner(System.in);
        Scanner okuint = new Scanner(System.in);

        ArrayList<Ogrenci> snf = new ArrayList<>();
        for (int i = 1; i <= 2; i++) {

            Ogrenci ogr = new Ogrenci();

            System.out.println(i + ".öğrencinin bilgileri:");

            System.out.print("Adı =");
            ogr.adi = oku.nextLine();
            System.out.print("Soyadı =");
            ogr.soyadi = oku.nextLine();
            System.out.print("Sınıfı=");
            ogr.sinifi = okuint.nextInt();
            System.out.print("Adresi=");
            ogr.adres = oku.nextLine();

            snf.add(ogr);

        }

        for (Ogrenci ogr : snf) {

            System.out.println("ogr.Adi = " + ogr.adi);
            System.out.println("ogr.Soyadi = " + ogr.soyadi);
            System.out.println("ogr.Sinifi = " + ogr.sinifi);
            System.out.println("ogr.Adres = " + ogr.adres);
        }
    }
}
class Ogrenci{
    String adi;
    String soyadi;
    int sinifi;
    String adres;
}