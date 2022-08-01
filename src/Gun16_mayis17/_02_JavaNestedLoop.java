package Gun16_mayis17;

import java.util.Scanner;

public class _02_JavaNestedLoop {

    // Aşağıdaki şekilde çıktı veren programı print içerisinde
// sadece bir tane # kullanarak yazıdırınız

//            #####
//            #####
//            #####
//            #####
//            #####

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
