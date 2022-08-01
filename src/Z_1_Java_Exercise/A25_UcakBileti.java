package Z_1_Java_Exercise;

import java.util.Scanner;

public class A25_UcakBileti {
    public static void main(String[] args) {

    // Km birim fiyatı =0,10$
    // 12 yaşından küçük ise toplam fiyata %50 indirim
    // 12 ve 24 yaş arası %10 indirim
    // 65 yaşından büyük ise %30 indirim
    // Gidiş-dönüş alırsa %20 indirimli

    Scanner scan =new Scanner(System.in);
    int km,yas,tarife;
    double tutar,indirim;

        System.out.print("Km Giriniz: ");
        km= scan.nextInt();
        tutar=km * (0.10);

        System.out.print("Yaşınızı Giriniz: ");
        yas= scan.nextInt();

        System.out.print("Tarife Seçiniz (1-Tek Yön 2-Gidiş Dönüş): ");
        tarife= scan.nextInt();
        if((yas>0) && (km>0)){
            if ((yas < 12) && (yas > 0)) {
                tutar -= tutar * 0.5;
            } else if ((yas >= 12) && (yas < 24)) {
                tutar -= tutar * 0.1;
            } else if ((yas >= 24) && (yas < 65)) {
                tutar -= tutar * 0.2;
            } else {
                tutar -= tutar * 0.3;
            }
            if (tarife == 2) {
                indirim = tutar * 0.2;
                tutar -= indirim;

            } else {
                indirim = tutar * 0;
                tutar -= indirim;
            }
            System.out.println("Bilet Ücreti:" + tutar + " Usd");
        }else{
            System.out.println("Hatalı veri girildi");
        }
    }
}

