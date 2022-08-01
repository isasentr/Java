package Gun12_mayis11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {

        // yan yana aralarında bir boslukla girilen 2 int sayının
        // birbirine eşit olup olmadığını bulunuz
/*
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi1= oku.nextInt(),sayi2 = oku.nextInt();
        if(sayi1==sayi2){
            System.out.println("Eşit");
        }else {
            System.out.println("farklı");
        }
        */
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        String sayi=oku.nextLine();

        int bosluk=sayi.indexOf(" ");

        String sayi1=sayi.substring(0,bosluk);
        String sayi2 =sayi.substring(bosluk+1);

        if (sayi1==sayi2){
            System.out.println("Eşit");
        }else {
            System.out.println("Değil");
        }

    }
}
