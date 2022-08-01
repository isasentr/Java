package Odevler._23_OdevlerHaziran20.Soru_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);

        System.out.print("Apple");

        System.out.print("Hafızayı giriniz");
        String str1=oku.nextLine();

        System.out.print("Ekran boyutunu giriniz");
        String str2=oku.nextLine();

        Apple apple=new Apple();
        apple.options(str1,str2);

        System.out.println("---------------------------");

        System.out.println("Samsung");

        System.out.print("Hafızayı giriniz");
        String str3=oku.nextLine();

        System.out.print("Ekran boyutunu giriniz");
        String str4=oku.nextLine();

        Samsung samsung=new Samsung();
        samsung.options(str3,str4);

        System.out.println("sum" + Phone.getSum(Phone.cart));

    }
}
