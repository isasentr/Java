package Gun13_mayis12;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {
        // 1- den 10 kadar ürettik. 5-10 arası desek nasıl yapabilirdik.
        // 5 -> 01234
        // 6-10 -> 6789 : aradaki fark kadar sayı üretir ve min ekle.

        Scanner oku = new Scanner(System.in);
        System.out.print("Min=");
        int min = oku.nextInt();

        System.out.print("Max=");
        int max=oku.nextInt();
        
        int numberInRange =(int)(Math.random() * ((max-min)+1));

        System.out.println("numberInRange = " + numberInRange);
        
    }
}
