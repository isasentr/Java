package Z_1_Java_Exercise;

import java.util.Scanner;

public class B03Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ortalama hesaplama yapmak istediğiniz sayıları giriniz:");

        double num =0;
//        double x=1;
        int n = scan.nextInt();

//        while(x<=n){
//            System.out.print("Girilen sayı:" );
//            num +=scan.nextDouble();
//            x+=1;
//        }

        for(int i=1;i<=n;i++) {
            System.out.print("Girilen sayı:");
            num += scan.nextDouble();

        }
        double avg = (num/n);

        System.out.println("avg = " + avg);
    }
}