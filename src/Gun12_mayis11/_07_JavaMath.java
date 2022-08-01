package Gun12_mayis11;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {

        //  Math.max yöntemi ile girilen 3 sayıdan büyük olanını bulunuz

        Scanner oku =new Scanner(System.in);
        System.out.println("Sayı giriniz:");

        System.out.print("1.sayi=");
        int sayi1= oku.nextInt();

        System.out.print("2.sayi=");
        int sayi2= oku.nextInt();

        System.out.print("3.sayi=");
        int sayi3= oku.nextInt();

        //Alternatif 1
        System.out.println("EN BÜYÜK SAYI = " + Math.max(sayi1,Math.max(sayi2,sayi3)));

        //Alternatif 2

        int enb=Math.max(sayi1,sayi2);
        enb=Math.max(enb,sayi3);
        System.out.println("enb=" + enb);

        //Alternatif 3

        int enb2 = Math.max(sayi1,Math.max(sayi2,sayi3));
        System.out.println("enb2 = " + enb2);


    }
}
