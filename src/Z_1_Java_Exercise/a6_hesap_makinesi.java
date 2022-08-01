package Z_1_Java_Exercise;

import java.util.Scanner;

public class a6_hesap_makinesi {
    // Kullanıcıya aşağıdaki gibi bir menü çıkartarak sürekli değişkenleri alınız ve
    // her bir menü elemanını değer alan fonksiyon olarak yazınız.
        /*  1-toplama
            2-çıkarma
            3-çarpma
            4-bolme
            5-Faktöryel
            6-Çıkış
        Bir işlem seçiniz */

    public static void main(String[] args) {
        int secim;
        do {
            Scanner oku = new Scanner(System.in);
            System.out.println("Bir işlem seçiniz \n1-toplama \n2-çıkarma \n3-çarpma \n4-bolme \n5-Faktöryel \n6-Çıkış ");
            System.out.print("işlem:");
            secim = oku.nextInt();

            switch (secim) {
                case 1:
                    veritoplama();break;

                case 2:
                    vericikarma();break;

                case 3:
                    vericarpma();break;

                case 4:
                    veribolme();break;

                case 5:
                    verifaktoriyel();break;

                case 6:break;

                default:
                    System.out.println("Hatalı veri girdiniz!!!");
                    System.out.println();
            }
        } while (secim != 6);
    }

    public static void veritoplama() {
        Scanner oku = new Scanner(System.in);
        System.out.println("Sayıları giriniz:");
        System.out.print("1.sayı:");
        int a = oku.nextInt();
        System.out.print("2.sayı:");
        int b = oku.nextInt();
        System.out.println("Toplama:" + (a + b));
        System.out.println();
    }

    public static void vericikarma() {
        Scanner oku = new Scanner(System.in);
        System.out.println("Sayıları giriniz:");
        System.out.print("1.sayı:");
        int a = oku.nextInt();
        System.out.print("2.sayı:");
        int b = oku.nextInt();
        System.out.println("Çıkarma:" + (a - b));
        System.out.println();
    }

    public static void vericarpma() {
        Scanner oku = new Scanner(System.in);
        System.out.println("Sayıları giriniz:");
        System.out.print("1.sayı:");
        int a = oku.nextInt();
        System.out.print("2.sayı:");
        int b = oku.nextInt();
        System.out.println("Çarpma:" + (a * b));
        System.out.println();
    }

    public static void veribolme() {
        Scanner oku = new Scanner(System.in);
        System.out.println("Sayıları giriniz:");
        System.out.print("1.sayı:");
        int a = oku.nextInt();
        System.out.print("2.sayı:");
        int b = oku.nextInt();

        System.out.println("Bölme:" + (a / b));
        System.out.println();
    }

    public static void verifaktoriyel() {
        Scanner oku = new Scanner(System.in);
        System.out.println("Sayıları giriniz:");
        System.out.print("1.sayı:");
        int a = oku.nextInt();

        int faktoriyel = 1;
        for (int i = 1; i < a; i++) {
            faktoriyel *= i;
        }
        System.out.println("Faktöriyel:" + faktoriyel);
        System.out.println();

    }
}
