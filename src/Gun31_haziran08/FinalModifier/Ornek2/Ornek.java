package Gun31_haziran08.FinalModifier.Ornek1;

import java.util.Scanner;

public class Ornek {
    // Sabitler isimli bir Class da sabit bir şekilde
    // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
    // bir dakikadaki saniye sayısını tanımlayınız.
    // mainde kullanıcıdan gun, saat, dakika alarak toplam
    // saniyeyi bulunuz.
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        int gun = 0;
        int saat = 0;
        int dak = 0;

        System.out.print("gun  =");
        gun = oku.nextInt();
        System.out.print("saat  =");
        saat = oku.nextInt();
        System.out.print("dakika  =");
        dak = oku.nextInt();

        int toplamSaniye = gun * Sabitler.birgundekisaatsayisi * Sabitler.birsaatdekidakikasayisi * Sabitler.birdakikadakiisaniyesayisi + saat * Sabitler.birsaatdekidakikasayisi * Sabitler.birdakikadakiisaniyesayisi + dak * Sabitler.birdakikadakiisaniyesayisi;

        System.out.println("toplamSaniye = " + toplamSaniye);

        System.out.println("toplamSaniye = " + Sabitler.hesapla(gun,saat,dak));

    }
}
