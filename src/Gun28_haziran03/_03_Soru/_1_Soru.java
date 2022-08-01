package Gun28_haziran03._03_Soru;

import java.util.ArrayList;
import java.util.Scanner;

public class _1_Soru {
    public static void main(String[] args) {

        // Bir Üniversitede öğrencilere ders kaydı yapılacaktır.
        // 1- Ders Class : adı: Lesson , fields : name, credit (1-10 arasında değer alıyor)
        // 2- Öğrenci Class: adı: Student, fields : name, maxCredit, dersleri listesini
        //    tutacak bir liste
        // 3- 3 adet ders oluşturunuz.
        // 4- 1 adet öğrenci tanımlayınız alabileceği maxCredi si 10 olsun.
        // 5- Bu öğrencinin ders listesine açılmış dersleri ekleyiniz.
        //    ders eklerken max alabileceği Crediyi geçmemeli, geçerse
        //    uyarı versi, alabileceğiniz max credi doldu şeklinde.


        Scanner oku=new Scanner(System.in);
        Scanner okInt = new Scanner(System.in);

        Lesson ders1=new Lesson();
        ders1.name="Mat101";
        ders1.credit=4;

        Lesson ders2=new Lesson();
        ders2.name="Java101";
        ders2.credit=3;

        Lesson ders3=new Lesson();
        ders3.name="Alg101";
        ders3.credit=6;

        Student ogr1=new Student();
        ogr1.name="vasif";
        ogr1.maxCredit=10;

        //bu dersleri sırasıyal ekleyeceğiz alabileceği toplam krediyi gecene kadar.

        ogr1.dersEkle(ders1);
        ogr1.dersEkle(ders2);
        ogr1.dersEkle(ders3);

    }
}
