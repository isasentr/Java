package Z_1_Java_Exercise;
import java.util.Scanner;
public class A22_HesapMakinesi {
    public static void main(String[] args) {
    Scanner scan =new Scanner(System.in);

    int sayi1,sayi2,secim;

        System.out.print("1. sayıyı giriniz:");
        sayi1= scan.nextInt();

        System.out.print("2. sayıyı giriniz:");
        sayi2= scan.nextInt();

        System.out.print("İşlem seçiniz: \n 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");

        System.out.print("\nSeçiminiz: ");
        secim= scan.nextInt();

        System.out.println(" ");

        switch (secim){
            case 1:
                System.out.println("Toplama : " +(sayi1+sayi2));
                break;
            case 2:
                System.out.println("Çıkarma :" + (sayi1-sayi2));
                break;
            case 3:
                System.out.println("Çarpma :" + (sayi1*sayi2));
                break;
            case 4:
                if(sayi2==0){
                    System.out.println("Hatalı değer girdiniz");
                }else {
                    System.out.println("Bölme :" + (sayi1/sayi2));
                    break;
                }
            default:
                System.out.println("Yanlış sayı girdiniz");
        }
}
}
