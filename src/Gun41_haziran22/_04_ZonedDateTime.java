package Gun41_haziran22;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class _04_ZonedDateTime {
    //Başka zaman bölgelerinin saaat dilimlerini alma
    public static void main(String[] args) {
        ZonedDateTime zdtLokal=ZonedDateTime.now();
        //şu anki bölgenin zamanını veriyor yani local zaman

        System.out.println("zdt = " + zdtLokal);


//        ZonedDateTime zdtIstanbul=ZonedDateTime.now(ZoneID);

        Set<String> zamanbolgeleri = ZoneId.getAvailableZoneIds(); // get ava,lable üzerine gelip formatına bakıldı.

        for (String z : zamanbolgeleri){
            if (z.toLowerCase().contains("stan"))
            System.out.println("z = " + z);
        }


        //Europe/Istanbul       Asia/Istanbul
        //şimdi by stringden bir zoneId oluşturulacak.

        ZoneId zoneIst=ZoneId.of("Europe/Istanbul");

        ZonedDateTime zdtIst=ZonedDateTime.now(zoneIst);

        System.out.println("zdtIst = " + zdtIst);


        System.out.println("--------------------------");


        ZoneId zonelon=ZoneId.of("Europe/London");

        ZonedDateTime zdtIst1=ZonedDateTime.now(zonelon);

        System.out.println("zdtIst1 = " + zdtIst1);
        System.out.println("--------------------------");

        DateTimeFormatter goster= DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy HH:mm:ss");
        System.out.println("london= "+zdtIst1.format(goster));


    }
}
