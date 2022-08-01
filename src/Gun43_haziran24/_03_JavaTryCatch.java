package Gun43_haziran24;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {

        try { // dene hatanın başladığı yerin üstüne konur.
            System.out.println("program başladı");

            LocalDate tarih = LocalDate.of(2018, Month.JUNE, 40);

            System.out.println("tarih = " + tarih);

            // hata olduğu zaman programı kırma
            System.out.println("işlem tamam");

        } catch (Exception hata) // hata isimli değişkene  hataların bilgisi atanıyor.
        {
            System.out.println("şu hata oldu= = " + hata.getMessage());

            //kendine mail attı: gelen datayı ve hatayı
            //veritabanını kalıcı yere yaz.

            System.out.println("program çakulmaya devam etti.");
            System.out.println("program bitti");
        }

            try {
                //java çalışmaya devam
            }//anlamadığın yermi oldu kırılmaya devam

            catch (Exception hata) {

                //hatanın sebebini anla
                //gereken videoları tekrar izle
                //arkadaşlarına sonra mentöre sonra hocaya mutlaka sor
                //öğren ve kırılmadan devam et
            }
            //Sonunda seni güzel bir meslek bekliyor.


        }

    }
