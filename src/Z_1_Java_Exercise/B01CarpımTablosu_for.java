package Z_1_Java_Exercise;

import java.util.Scanner;

public class B01CarpımTablosu_for {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.print("1.sayıyı giriniz: ");
        int sayi1= scan.nextInt();
//        System.out.print("2.sayıyı giriniz: ");
//        int sayi2= scan.nextInt();
//        System.out.println();

        for (int i=1;i<= sayi1;i++){
            System.out.println(sayi1+"*"+i+"="+(sayi1*i));
        }
    }
}
