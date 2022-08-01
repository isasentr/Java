package Gun41_haziran22;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _03_JavaLocalDateTime {
    public static void main(String[] args) throws InterruptedException {
        //LocalDateTime hem tarih hem de saat bilgisini tutar
        LocalDateTime dt=LocalDateTime.now();
        System.out.println("dt = " + dt);
/*

        System.out.println("dt.getYear() = " + dt.getYear());
        System.out.println("dt.getMonth() = " + dt.getMonth());
        System.out.println("dt.getMonthValue() = " + dt.getMonthValue());
        System.out.println("dt.getHour() = " + dt.getHour());
        System.out.println("dt.getMinute() = " + dt.getMinute());
        System.out.println("dt.getSecond() = " + dt.getSecond());

        System.out.println("SHORT = " + dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT)));
        System.out.println("SHORT = " + dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));


        //aşağıdaki date formatına aitir.
        System.out.println("FULL = " + dt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));


*/

        LocalTime saat = LocalTime.now();
        DateTimeFormatter dt1=DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm:ss");

//        while (true) { DENEDİM YAPAMADIM
//            saat = LocalDateTime.now();
//            System.out.print("\rsaat = " + dt1.format(dt1)); // ln kaldırmzsak alt alta yazar
//
//            Thread.sleep(1000);//1 saniye bekleyecek
//        }

    }
}
