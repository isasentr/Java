package Z_1_Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Set;

public class saat {
    public static void main(String[] args) throws InterruptedException {
        LocalDate t1 = LocalDate.now();
        System.out.println("t1 = " + t1);
        System.out.println("DayOfYear() = " + t1.getDayOfYear());
        System.out.println("getDayOfWeek = " + t1.getDayOfWeek());
        System.out.println("t1.getDayOfMonth() = " + t1.getDayOfMonth());
        System.out.println("t1.getMonthValue() = " + t1.getMonthValue());
        System.out.println("t1.getMonth() = " + t1.getMonth());
        System.out.println("t1.getYear() = " + t1.getYear());
        System.out.println("t1.getDayOfWeek().getValue() = " + t1.getDayOfWeek().getValue());

        System.out.println("t1.format= " + t1.format(DateTimeFormatter.ISO_DATE));
        System.out.println("t1.SHORT)) = " + t1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println("t1.SHORT)) = " + t1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
        System.out.println("t1.FULL)) = " + t1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        System.out.println("t1.MEDIUM)) = " + t1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println("Almanya= " + t1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMANY)));
        System.out.println(t1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.JAPAN)));

        Locale[] kullani = Locale.getAvailableLocales();
//        for ( Locale l:kullani ){
//                 System.out.println( l.getDisplayCountry()+" * "+l+" * "+l.getDisplayLanguage());


        Locale lolist = new Locale("ger", "GER");
        System.out.println("t1.f " + t1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lolist)));


        System.out.println("t1 = " + t1);
        DateTimeFormatter ozelfor = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("t1.format(ozelfor) = " + t1.format(ozelfor));

        DateTimeFormatter ozelfor1 = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println("t1.format(ozelfor) = " + t1.format(ozelfor1));

        DateTimeFormatter ozelfor2 = DateTimeFormatter.ofPattern("EEEE dd/MM/yy");
        System.out.println("t1.format(ozelfor) = " + t1.format(ozelfor2));

        LocalDate t2 = LocalDate.of(1989, 10, 06);
        LocalDate t3 = LocalDate.of(1990, Month.DECEMBER, 20);

        System.out.println("t2.format(ozelfor2) = " + t2.format(ozelfor2));


        System.out.println("-------------------------------------------------------");
        System.out.println();


        LocalTime tim2 = LocalTime.now();
        System.out.println("tim2 = " + tim2);
        System.out.println("tim2.getHour() = " + tim2.getHour());
        System.out.println("tim2.getHour() = " + tim2.getMinute());
        System.out.println("tim2.getHour() = " + tim2.getSecond());

        DateTimeFormatter ozelformat2 = DateTimeFormatter.ofPattern("hh:mm:ss a");
        System.out.println("tim2 = " + tim2.format(ozelformat2));
        LocalTime saat = LocalTime.now();
        ZonedDateTime zdt=ZonedDateTime.now();
        System.out.println("zdt = " + zdt);

        Set<String> zonedd=ZoneId.getAvailableZoneIds();
        for (String k :zonedd ){
            if (k.toLowerCase().contains("stan"))
                System.out.println("k = " + k);
        }

        ZoneId zoneist=ZoneId.of("Europe/London");
        ZonedDateTime zd=ZonedDateTime.now(zoneist);
        System.out.println("zd = " + zd);

        DateTimeFormatter goster=DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy HH:mm:ss");
        System.out.println("goster = " + zd.format(goster));




        while (true) {
            saat = LocalTime.now();
            System.out.print("\rSaat= " + saat.format(ozelformat2));
            Thread.sleep(1000);
        }
    }
}
