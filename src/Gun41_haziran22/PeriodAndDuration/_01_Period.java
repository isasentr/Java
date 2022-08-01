package Gun41_haziran22.PeriodAndDuration;

import java.time.LocalDate;
import java.time.Period;

public class _01_Period {

    //2 tarih arasındaki  saat farkını gösterir.
    //local Dateler için kullanılır.
    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(1990, 1, 20);
        LocalDate buGun = LocalDate.now();

        Period fark = Period.between(dogumTarihi, buGun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println("fark = " + fark.getYears()+" yıl "+fark.getMonths()+" ay");


        System.out.println("---------------------------");
        //"***************************************************"

        Period period3gun=Period.ofDays(3);
        Period period3ay=Period.ofMonths(3);

        LocalDate ucgunsonra =buGun.plus(period3gun);
        LocalDate ucaysonra =buGun.plus(period3ay);

        System.out.println("ucaysonra = " + ucaysonra);
        System.out.println("ucgunsonra = " + ucgunsonra);

        //ornek kursun süresi

        LocalDate kursunbaslangici=LocalDate.of(2022,4,18);
        Period kursSure=Period.ofMonths(6);
        LocalDate kursBitis=kursunbaslangici.plus(kursSure);

        System.out.println("kursBitis = " + kursBitis);
        System.out.println("kursBitisgetDayOfWeek = " + kursBitis.getDayOfWeek());

        Period kacGunkaldi=Period.between(buGun,kursBitis);
        System.out.println("kacGunkaldi = " + kacGunkaldi);
        System.out.println("kacGunkaldi = " + kacGunkaldi.getDays());
        System.out.println("kacGunkaldi = " + kacGunkaldi.getMonths());





    }

}
