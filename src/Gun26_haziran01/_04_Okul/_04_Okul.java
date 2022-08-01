package Gun26_haziran01._04_Okul;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_Okul {
    public static void main(String[] args) {

        // Ogretmen için not defteri programı yapılması isteniyor.
        // Her ogrencının okulNo(int), tamAdi(String) ve notu(int) vardır.
        // Öğretmenden (3)20 öğrenci için bu bilgileri alınız.
        // bütün öğrencileri bir metotda yazdırınız.
        // sınıfın not ortalamasını yine bir metodda yazdırınız.
        //gerekliClass lar için ayrı dosya açınız.

        Scanner oku =new Scanner(System.in);
        Scanner okuInt =new Scanner(System.in);
        ArrayList<Ogrenci> snf= new ArrayList<>();

        for (int i = 1; i <=2; i++) {
            Ogrenci ogr =new Ogrenci();

            System.out.print("Okul no :");
            ogr.okulNo=okuInt.nextInt();

            System.out.print("Tam ad :");
            ogr.tamAd=oku.nextLine();

            System.out.print("Not :");
            ogr.not=okuInt.nextInt();

            snf.add(ogr);
        }

        bilgiYazdir(snf);
        ortalamaYaz(snf);

    }

    static void bilgiYazdir(ArrayList<Ogrenci> snf){
        for ( Ogrenci ogr: snf)
            System.out.println(ogr.okulNo+" "+ogr.tamAd+" "+ogr.not);
    }

    static  void ortalamaYaz(ArrayList<Ogrenci> snf) {
        int toplam =0;
        for ( Ogrenci ogr: snf)
            toplam+=ogr.not;

        System.out.println("ortalama = " + (toplam/snf.size()));

    }
}
