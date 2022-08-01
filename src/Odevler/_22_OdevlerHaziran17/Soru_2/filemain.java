package Odevler._22_OdevlerHaziran17.Soru_2;
/*2-  Yanda Ekli tasarıma göre:  (files)

Ekteki Tasarıma göre gerekli modülleri yazınız.
Sonra her birinden nesne üretiniz.

- ürettiğiniz nesneleri bir ArrayListe ekletip, daha sonra bu ArrayList i
bir döngü ile metodlarını ekrana yazdırınız.
 */

import java.util.ArrayList;

public class filemain {
    public static void main(String[] args) {
        ArrayList<files> flm = new ArrayList<>();
        txtFile tx = new txtFile("text", 25);
        powepointFile pow = new powepointFile("power", 15);
        dmgFile dmg = new dmgFile("demege", 27);
        exeFile exe = new exeFile("exem", 12);
        flm.add(tx);
        flm.add(pow);
        flm.add(dmg);
        flm.add(exe);

        for (files klasor : flm) {

            System.out.println(klasor.getClass().getSimpleName()+" adlı dosya açıldı.");

            if (klasor instanceof txtFile){
                System.out.println("filename / filesize = " +( klasor.filename) +"/"+ klasor.filesize) ;
                System.out.println("1. " + ((txtFile) klasor).open());
                System.out.println("2. " + ((txtFile) klasor).read());
                System.out.println("3. " + ((txtFile) klasor).save());
                System.out.println("4. " + ((txtFile) klasor).close());
                System.out.println();
            }
            if (klasor instanceof powepointFile){
                System.out.println("filename / filesize = " +( klasor.filename) +"/"+ klasor.filesize) ;
                System.out.println("1. " + ((powepointFile) klasor).open());
                System.out.println("2. " + ((powepointFile) klasor).read());
                System.out.println("3. " + ((powepointFile) klasor).save());
                System.out.println("4. " + ((powepointFile) klasor).close());
                System.out.println();
            }
            if (klasor instanceof dmgFile){
                System.out.println("filename / filesize = " +( klasor.filename) +"/"+ klasor.filesize) ;
                System.out.println("1. " + ((dmgFile) klasor).open());
                System.out.println("2. " + ((dmgFile) klasor).read());
                System.out.println("3. " + ((dmgFile) klasor).save());
                System.out.println("4. " + ((dmgFile) klasor).close());
                System.out.println();
            }
            if (klasor instanceof exeFile){
                System.out.println("filename / filesize = " +( klasor.filename) +"/"+ klasor.filesize) ;
                System.out.println("1. " + ((exeFile) klasor).open());
                System.out.println("2. " + ((exeFile) klasor).read());
                System.out.println("3. " + ((exeFile) klasor).save());
                System.out.println("4. " + ((exeFile) klasor).close());
                System.out.println();
            }

            System.out.println("İşlemler tamamlandı.");

        }
    }
}
