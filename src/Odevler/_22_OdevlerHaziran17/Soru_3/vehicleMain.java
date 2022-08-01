package Odevler._22_OdevlerHaziran17.Soru_3;

import java.util.Scanner;

public class vehicleMain {
    public static void main(String[] args) {
        bicycle byc = new bicycle(25, 3);
        car cr = new car(65, 4);

        Scanner oku = new Scanner(System.in);

        System.out.print("Seçim yapınız:\n" +
                "1-Bicycle\n" +
                "2-Car\n" +
                "3-Çıkış\n");
        System.out.print("Seçim=");
        int secim = oku.nextInt();

        while (secim == 1) {
            System.out.println(byc.printAll());
            System.out.print("Ne yapmak istiyorsunuz.");
            System.out.print("Seçim yapınız:\n" +
                    "1-Vites değiştir\n" +
                    "2-Hızlan\n" +
                    "3-Yavaşla\n" +
                    "4-Çıkış\n");
            System.out.print("Seçim=");
            int secim1 = oku.nextInt();
            if (secim1 < 4) {
                switch (secim1) {
                    case 1:
                        System.out.print("Vitesi giriniz=");
                        int gear = oku.nextInt();
                        byc.changegear(gear);
                        break;
                    case 2:
                        System.out.print("Hız giriniz=");
                        int speed = oku.nextInt();
                        byc.speedUp(speed);
                        break;
                    case 3:
                        System.out.print("Hız giriniz=");
                        int speeddown = oku.nextInt();
                        byc.applybreaks(speeddown);
                        break;
                }
            }
            break;
        }
        while (secim == 2) {
            System.out.println(cr.printAll());
            System.out.print("Ne yapmak istiyorsunuz.");
            System.out.print("Seçim yapınız:\n" +
                    "1-Vites değiştir\n" +
                    "2-Hızlan\n" +
                    "3-Yavaşla\n" +
                    "4-Çıkış\n");
            System.out.print("Seçim=");
            int secim1 = oku.nextInt();
            if (secim1 < 4) {
                switch (secim1) {
                    case 1:
                        System.out.print("Vitesi giriniz=");
                        int gear = oku.nextInt();
                        cr.changegear(gear);
                        break;
                    case 2:
                        System.out.print("Hız giriniz=");
                        int speed = oku.nextInt();
                        cr.speedUp(speed);
                        break;
                    case 3:
                        System.out.print("Hız giriniz=");
                        int speeddown = oku.nextInt();
                        cr.applybreaks(speeddown);
                        break;
                }
            }
            break;
        }
    }
}

