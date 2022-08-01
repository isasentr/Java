package Mentoring._260522;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysWithLoops4 {

    //  TODO Consider an integer array, the number of elements in which is determined by the user.
    //   The elements are also taken as input from the user.
    //   Write a program to find those pair of elements that has the maximum and minimum difference among all element pairs.
    // 30 21 45 89 0 3

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Dizinin eleman sayisini girin= ");
        int elemanSayisi = oku.nextInt();
        int[] dizi = new int[elemanSayisi];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);
        }
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));

        int enbFark = 0;
        int enkFark = 0;

        for (int i = 0; i < dizi.length - 1; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                int fark = Math.abs(dizi[i] - dizi[j]);

                if (fark > enbFark) {
                    enbFark = fark;
                }

                if (j == 1) {
                    enkFark = fark;
                }

                if (fark < enkFark) {
                    enkFark = fark;
                }
            }
        }
        System.out.println("enkFark = " + enkFark);
        System.out.println("enbFark = " + enbFark);
    }
}
