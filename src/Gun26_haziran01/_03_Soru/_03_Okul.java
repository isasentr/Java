package Gun26_haziran01._03_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class _03_Okul {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        Scanner okuint = new Scanner(System.in);

        ArrayList<Ogrenci> snf = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {

            Ogrenci ogr = new Ogrenci();

            System.out.println(i + ".öğrencinin bilgileri:");

            System.out.print("Adı =");
            ogr.Adi = oku.nextLine();
            System.out.print("Soyadı =");
            ogr.Soyadi = oku.nextLine();
            System.out.print("Sınıfı=");
            ogr.Sinifi = okuint.nextInt();
            System.out.print("Adresi=");
            ogr.Adres = oku.nextLine();

            snf.add(ogr);

        }

        for (Ogrenci ogr: snf){

            System.out.println("ogr.Adi = " + ogr.Adi);
            System.out.println("ogr.Soyadi = " + ogr.Soyadi);
            System.out.println("ogr.Sinifi = " + ogr.Sinifi);
            System.out.println("ogr.Adres = " + ogr.Adres);
        }
    }
}
