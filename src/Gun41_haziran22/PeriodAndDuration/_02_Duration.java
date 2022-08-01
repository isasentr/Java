package Gun41_haziran22.PeriodAndDuration;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
public class _02_Duration {
    //  local time ve local datetime lar için kullanılır.
    //Bunların arasındaki farkı gösterir.
    public static void main(String[] args) {

        //Local time için
        LocalTime geceYarisi=LocalTime.of(0,0);
        LocalTime ogleVakti=LocalTime.of(13,3,2);

        Duration fark=Duration.between(geceYarisi,ogleVakti);

        System.out.println("fark = " + fark);
        System.out.println("fark.toDays() = " + fark.toDays());//fark.toDays() = 0 farkın Toplam saat hali
        System.out.println("fark.toHours() = " + fark.toHours());//fark.toHours() = 13
        System.out.println("fark.toMinutes() = " + fark.toMinutes());//fark.toMinutes() = 783
        System.out.println("fark.getSeconds() = " + fark.getSeconds());//ark.getSeconds() = 46982
        System.out.println("fark.toMillis() = " + fark.toMillis()); //fark.toMillis() = 46982000

//        System.out.println("fark.toDaysPart() = " + fark.toDaysPart()); // farkın sadece days parçasını verir
//        System.out.println("fark.toHoursPart() = " + fark.toHoursPart()); // farkın sadece saat parçasını verir
//        System.out.println("fark.toMinutesPart() = " + fark.toMinutesPart());
//        System.out.println("fark.toSecondsPart() = " + fark.toSecondsPart());
//        System.out.println("fark.toMillisPart() = " + fark.toMillisPart());

        //LocalDateTime *** 2 zaman farkı için"""
        LocalDateTime from = LocalDateTime.of(2020,10,4,10,20,55);
        LocalDateTime to = LocalDateTime.of(2020,11,15,11,21,56);

        Duration farkzaman =Duration.between(from,to);
        System.out.println("farkzaman = " + farkzaman);

        System.out.println("farkzaman.toDays() = " + farkzaman.toDays()); //farkın toplam gunu
        System.out.println("farkzaman.toHours() = " + farkzaman.toHours());// farkın toplam saati
        System.out.println("farkzaman.toMinutes() = " + farkzaman.toMinutes());// farkın toplam dakikası
        System.out.println("farkzaman.toMillis() = " + farkzaman.toMillis()); //farkın toplam milisaniyesi


    }

}
