package Z_1_Test;

import java.util.ArrayList;
import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {

        // Ogretmen için not defteri programı yapılması isteniyor.
        // Her ogrencının okulNo(int), tamAdi(String) ve notu(int) vardır.
        // Öğretmenden (3)20 öğrenci için bu bilgileri alınız.
        // bütün öğrencileri bir metotda yazdırınız.
        // sınıfın not ortalamasını yine bir metodda yazdırınız.
        //gerekliClass lar için ayrı dosya açınız.

        Scanner oku = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);

        ArrayList<ogrenci> snfi = new ArrayList<>();

        for (int i = 1; i < 4; i++) {

            ogrenci ogr = new ogrenci();
            System.out.print("Öğrenci numarasını giriniz =");
            ogr.okulNo = okuInt.nextInt();
            System.out.print("Öğrenci adını giriniz =");
            ogr.tamAdi = oku.nextLine();
            System.out.print("Öğrenci notunu giriniz =");
            ogr.notu = okuInt.nextInt();

            snfi.add(ogr);
        }

        butunogrenciler(snfi);

       int notort= notOrtalamasi(snfi);
        System.out.println("notort = " + notort);

    }

    public static void butunogrenciler(ArrayList<ogrenci> snf) {

        for (ogrenci ogr : snf)
            System.out.println("okulNo= " + ogr.okulNo + ",tamAdi= " + ogr.tamAdi + ",notu= " + ogr.notu);
    }

    static int notOrtalamasi(ArrayList<ogrenci> snf) {

        int toplam = 0;
        for (ogrenci ogr : snf) {
            toplam += ogr.notu;

        }
        return toplam / snf.size();
    }
}

