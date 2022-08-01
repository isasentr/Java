package Gun40_haziran21.Ornek_4;

import java.util.ArrayList;
import java.util.Scanner;

public class TechnoKitchen {
    public static void main(String[] args) {
        Scanner oku =new Scanner(System.in);
        int secim=0;
        ArrayList<TechnoCafe> siparis= new ArrayList<>();

        do {TechnoCafe.menu();
            System.out.print("Seçim yapınız=");
            secim=oku.nextInt();
            TechnoCafe.liste(siparis,secim);
        }while (secim!=0);

        TechnoCafe.Yazdir(siparis);
        System.out.println("toplam tutar=" + TechnoCafe.adet(siparis)+"TL" );
    }
}
