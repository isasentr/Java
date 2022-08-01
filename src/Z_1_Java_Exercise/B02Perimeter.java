package Z_1_Java_Exercise;

import java.util.Scanner;

public class B02Perimeter {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Dairenin çapını giriniz:");
        double cap = scan.nextDouble();

        double area = Math.PI*cap*cap;
        double perimeter =Math.PI*cap*2;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);


    }
}
