package Gun16_mayis17;

import java.util.Scanner;

public class _05_JavaNestedLoop {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
// Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *
        // **
        // ***
        // ****
        // *****
        // *****
        // ****
        // ***
        // **
        // *

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }

        for (int i = 5; i>0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}