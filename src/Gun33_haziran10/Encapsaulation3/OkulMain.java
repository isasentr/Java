package Gun33_haziran10.Encapsaulation3;

import java.util.Scanner;

public class OkulMain {
    public static void main(String[] args) {

        Okul okul = new Okul("Kabatas", 3);
        Scanner oku = new Scanner(System.in);
        Scanner okuInt = new Scanner(System.in);


        do {
            System.out.print("Öğrenci adı =");
            String ad = oku.nextLine();

            System.out.print("Öğrenci Soyadı =");
            String soyad = oku.nextLine();

            System.out.print("Öğrenci yaşı=");
            int yas = okuInt.nextInt();

            if (yas <= 15) {
                Ogrenci ogr = new Ogrenci(ad,soyad,yas);
                okul.ogrenciler.add(ogr);
            } else {
                System.out.println("yaş sebebiyle kayıt olmadı.");
            }

            System.out.println("okul = " + okul.ogrenciler);
        } while (okul.ogrenciler.size() <= okul.getKontenjan());
    }
}
