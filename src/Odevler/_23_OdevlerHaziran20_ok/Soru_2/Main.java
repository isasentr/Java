package Odevler._23_OdevlerHaziran20.Soru_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oku =new Scanner(System.in);
        System.out.print("Büyük sayıyı giriniz=");
        int a= oku.nextInt();

        System.out.print("Küçük sayıyı giriniz=");
        int b= oku.nextInt();

       Sum sum=new Sum();
        System.out.println("sum = " + sum.calculating(a,b));

        Divide devide=new Divide();
        System.out.println("devide = " + devide.calculating(a,b));

        Multiply multiply=new Multiply();
        System.out.println("multiply = " + multiply.calculating(a,b));

        Substract substract=new Substract();
        System.out.println("substract = " + substract.calculating(a,b));
    }
}
