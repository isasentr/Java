package Gun41_haziran22;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_JavaLocalTime {
    public static void main(String[] args) throws InterruptedException {

        //Tarih içermez saat , dak, san , nano san içerir.
        LocalTime saat = LocalTime.now();
        System.out.println("saat = " + saat);

        System.out.println("saat.getHour() = " + saat.getHour());
        System.out.println("saat.getMinute() = " + saat.getMinute());
        System.out.println("saat.getSecond() = " + saat.getSecond());
        System.out.println("saat.getNano() = " + saat.getNano());

        //kendimize öze format

        DateTimeFormatter ozelformat1 = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("ozelformat1 = " + saat.format(ozelformat1));


        DateTimeFormatter ozelformat3 = DateTimeFormatter.ofPattern("kk:mm");
        System.out.println("ozelformat3 = " + saat.format(ozelformat3));


        //canlı saat
        DateTimeFormatter ozelformat2 = DateTimeFormatter.ofPattern("hh:mm:ss");
        while (true) {
            saat = LocalTime.now();
            System.out.print("\rsaat = " + saat.format(ozelformat2)); // ln kaldırmzsak alt alta yazar

            Thread.sleep(1000);//1 saniye bekleyecek
        }



        //*********************************//
    }
}
