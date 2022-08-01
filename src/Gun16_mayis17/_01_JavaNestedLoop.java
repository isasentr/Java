package Gun16_mayis17;

import java.util.Scanner;

public class _01_JavaNestedLoop {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        for (int j = 1; j <=10 ; j++) {
            //1 için çalışacak sonra 2 için çalışacak sonra 3 için
            for (int i = 1; i <=10 ; i++) {
                System.out.println(j+" x "+i+" = "+(i*j)+" ");
            }
            System.out.println();
        }
    }
}