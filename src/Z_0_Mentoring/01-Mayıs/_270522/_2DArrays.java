package Mentoring._270522;

import java.util.Arrays;
import java.util.Scanner;

public class _2DArrays {
    //TODO Write a program to do following operation
//    on two dimensional array A of size m x n.
//
//    The options are:
//
//    To input elements into matrix of size m x n
//    To display elements of matrix of size m x n
//    Sum of all elements of matrix of size m x n
//    To display row-wise sum of matrix of size m x n
//    To display column-wise sum of matrix of size m x n
//    [5,9,4,1]
//    [1,4,3,6]
//    [3,1,5,2]

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin satir sayisini girin= ");
        int satirSayisi = scanner.nextInt();

        System.out.print("Dizinin sutun sayisini girin= ");
        int sutunSayisi = scanner.nextInt();
        int[][] list = new int[satirSayisi][sutunSayisi];

        for (int satir = 0; satir < list.length; satir++) {
            for (int sutun = 0; sutun < list[satir].length; sutun++) {
                int eleman = (int) (Math.random() * 100);
                list[satir][sutun] = eleman;
            }
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(Arrays.toString(list[i]));
        }
        int toplam = 0;
        for (int i = 0; i < list[0].length; i++) {
            for (int j = 0; j < list.length; j++) {
                toplam+=list[j][i];
            }
            System.out.println(i+1+". sutun toplami = " + toplam);
            toplam=0;
        }
    }
}
