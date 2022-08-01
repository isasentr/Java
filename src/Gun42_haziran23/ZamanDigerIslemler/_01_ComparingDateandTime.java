package Gun42_haziran23.ZamanDigerIslemler;

import java.time.LocalDate;

public class _01_ComparingDateandTime {
    public static void main(String[] args) {

        LocalDate buGun= LocalDate.now();
        LocalDate dun=buGun.minusDays(1);

        System.out.println("buGun = " + buGun);
        System.out.println("dun = " + dun);

        //bugün dünden sonra mı
        boolean sonraMi=buGun.isAfter(dun);
        System.out.println("sonraMi = " + sonraMi);

        //bugün dünden önce mı
        boolean onceMi=buGun.isBefore(dun);
        System.out.println("onceMi = " + onceMi);

        //bugün düne esit mı
        boolean esitMi=buGun.isEqual(dun);
        System.out.println("esitMi = " + esitMi);

        //bugün artık yil mi
        boolean artikYilmi=buGun.isLeapYear();
        System.out.println("artikYilmi = " + artikYilmi);

        //2 tarih arasındafark var ise farkın en buyuk olduğu sayısı verir.

        int fark=buGun.compareTo(dun.minusYears(3));
        System.out.println("fark = " + fark);

        int fark1=buGun.compareTo(dun.minusDays(3));
        System.out.println("fark1 = " + fark1);


    }
}
