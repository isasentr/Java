package Odevler._20_OdevlerHaziran14_ok;

import java.util.ArrayList;
import java.util.Collections;

public class mainOkul {
    public static void main(String[] args) {


        calisan cali1 = new calisan("isa", "new york", "ilkokul", bilgi.uyetipi.calisan, 3000);
        calisan cali2 = new calisan("ali", "los angeles", "ilkokul", bilgi.uyetipi.calisan, 3000);

        ogrenci1 ogr1 = new ogrenci1("kemal", "istanbul", "lise", bilgi.uyetipi.ogrenci, 250);
        ogrenci1 ogr2 = new ogrenci1("mesut", "ankara", "üniversite", bilgi.uyetipi.ogrenci, 650);


        okul1 okul=new okul1();
        Collections.addAll(okul.ogrencilist,ogr1,ogr2 );
        Collections.addAll(okul.calisanlist,cali1,cali2);

        System.out.println("oku = " + okul.calisanlist);
        System.out.println("oku = " + okul.ogrencilist);


    }
}
