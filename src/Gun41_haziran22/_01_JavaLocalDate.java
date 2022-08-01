package Gun41_haziran22;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {
        //LocalDate sadece gun,ay,yıl bilgisi tutar.

        LocalDate tarih = LocalDate.now();
        System.out.println("tarih = " + tarih);
        System.out.println("tarih.getYear() = " + tarih.getYear());
        System.out.println("tarih.getMonth() = " + tarih.getMonth());
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());


        System.out.println("ISO_DATE) = " + tarih.format(DateTimeFormatter.ISO_DATE));


        //isimleri locale göre gösteriyor.
        System.out.println("SHORT = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("MEDIUM = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("LONG = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("FULL= " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

//LOCALDEKİ SAATİ ALDIM ALMANYAYA GÖRE GÖSTERDİM.
        System.out.println("FULL locale.GERMANY= " +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));


        Locale[] kullanilabilirLokaller = Locale.getAvailableLocales();

        for (Locale l : kullanilabilirLokaller) {
            if (l.getDisplayCountry().toLowerCase().contains("ice"))
                System.out.println(l.getDisplayCountry() + " " + l + " " + l.getDisplayLanguage());
        }

        // lokaldeki tarih bilgisi alındı ve IZLANDA ca ya göre gösterildi.
        Locale lokalIzlanda = new Locale("is", "IS");
        System.out.println("FULL lokalIzlanda= " +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalIzlanda)));


        //java standart format
        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozelformat = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // kendimize özel format oluşturduk. 22/06/2022
        System.out.println("tarih = " + tarih.format(ozelformat));

        System.out.println("\"-------------------\" ");
        DateTimeFormatter ozelformat2 = DateTimeFormatter.ofPattern("dd.MM.yy"); // kendimize özel format oluşturduk. 22/06/22
        System.out.println("tarih = " + tarih.format(ozelformat2));

        System.out.println("\"-------------------\" ");
        DateTimeFormatter ozelformat3 = DateTimeFormatter.ofPattern("EEEE dd/MM/yyyy"); // kendimize özel format oluşturduk. Çarşamba 22/06/22
        System.out.println("tarih = " + tarih.format(ozelformat3));

        //Kendimiz bir tarihi nasıl set edebiliriz.  int  sayi =5 gibi
        LocalDate tarih1 = LocalDate.of(2020, 6, 1);
        LocalDate tarih2 = LocalDate.of(2021, Month.DECEMBER, 6);

        System.out.println("tarih1 = " + tarih1.format(ozelformat3));


    }
}
