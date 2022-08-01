package Z_1_Test.a0_yemek;

import java.util.ArrayList;
import java.util.Scanner;

public class menuMain {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        int secim = 0;
        ArrayList<Menu> list = new ArrayList<>();
        do {
            Menu.menulist();
            System.out.print("Seçim yapınız=");
            secim = oku.nextInt();
            Menu.list(list, secim);
            System.out.println("Aratoplam=" + Menu.tutar(list) + " TL");
            System.out.println();
        } while (secim != 0);

        Menu.Yazdir(list);
        Menu.ozet(list);
        System.out.println("--------------------------------");
        System.out.println("Aratoplam =" + Menu.tutar(list) + " TL");
        System.out.println("Kdv (8%) =" + Math.round(Menu.tutar(list) * 0.08) + " TL");
        System.out.println("Toplamtutar =" + Math.round(Menu.tutar(list) * 1.08) + " TL");
    }
}
