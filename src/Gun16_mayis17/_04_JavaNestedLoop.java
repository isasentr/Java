package Gun16_mayis17;

import java.util.Scanner;

public class _04_JavaNestedLoop {
    public static void main(String[] args) {
        // Aşağıdaki görüntüyü veren programı yazınız(yanlızca 1 yıldız ile yapınız)
        // *****    1.Satırda 5
        // ****     2.Satırda 4
        // ***      3.Satırda 3
        // **       4.Satırda 2
        // *        5.Satırda 1


        Scanner oku = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >=i ;j--) {
                System.out.print ("*");
            }

            System.out.println();
        }


    }
}
