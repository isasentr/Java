package Gun13_mayis12;
import java.util.Scanner;

public class _06_Switch {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayı giriniz= ");

        int sayi = oku.nextInt();
        int onlar = (sayi / 10) % 10;

        switch (onlar) {
            case 1:
                System.out.print("bir");
                break;
            case 2:
                System.out.print("iki");
                break;
            case 3:
                System.out.print("üç");
                break;
            case 4:
                System.out.print("dört");
                break;
            case 5:
                System.out.print("beş");
                break;
            case 6:
                System.out.print("altı");
                break;
            case 7:
                System.out.print("yedi");
                break;
            case 8:
                System.out.print("sekiz");
                break;
            case 9:
                System.out.print("dokuz");
                break;
            default:
                System.out.println();
                break;
        }
    }
}
