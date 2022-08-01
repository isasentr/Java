package _35oop2;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ogrenci ogr1=new ogrenci("Tolga","Türkiye","Tec.S",5000, info.uyetip.OGRENCI);
        ogrenci ogr2=new ogrenci("Caglar","Türkiye","Tec.S",6000, info.uyetip.OGRENCI);

        calisan cal1=new calisan("İsmet","İngiltere","Tec.S",20000, info.uyetip.CALISAN);
        calisan cal2=new calisan("Şafak","Amerika","Tec.S",10000, info.uyetip.CALISAN);

        okul okul=new okul();
        Collections.addAll(okul.ogrenciList,ogr1,ogr2);
        Collections.addAll(okul.calisanList,cal1,cal2);
        System.out.println("okul.ogrenciList = " + okul.ogrenciList);
        System.out.println("okul calısanList = " + okul.calisanList);


    }
}
