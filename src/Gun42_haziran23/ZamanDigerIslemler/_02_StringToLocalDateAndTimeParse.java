package Gun42_haziran23.ZamanDigerIslemler;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class _02_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {
        //Kullanıcıdan alınan ve string durumunda olan bir time veya tarih
        //bilgisinin time veya tarih değişkenlerine çevrilmesi

        String strDate = "25 01 2020";

// String değeri tariheçevirmek için format belirledik.
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MM yyy");

        //Stringin formatı bu formata uygun olmalı, parse ile çevirdik.
        LocalDate tarih = LocalDate.parse(strDate, format);

        System.out.println("tarih = " + tarih.format(format));


DateTimeFormatter format1= DateTimeFormatter.ofPattern("dd MM yyyy");

LocalDate tarih1=LocalDate.parse(strDate,format1);

        System.out.println("tarih1 = " + tarih1.format(format1));


    }
}
