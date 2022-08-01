package Z_1_Java_Exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class a9_Arraylist_Array_Ornegi {

    // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
    // sadece tek sayı olan elemanlarını ayrı diziye atayarak
    // yazdırınız.

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);

        int[] veri = new int[3];
        int[] tek = new int[3];

        for (int i = 0; i < veri.length; i++) {
            System.out.print("Sayı giriniz: ");
            veri[i] = oku.nextInt();
        }
        System.out.println(Arrays.toString(veri));

        tekSayilarDizisi(veri, tek);  // Yöntem 1

        int[] sayi2 = tekSayilarDizisima(veri, tek);  // Yöntem 2
        System.out.println("Yazdırma :" + Arrays.toString(sayi2));


        ArrayList<Integer> tekSayilarDizisiAr1 = tekSayilarDizisiAr(veri, tek); // Yöntem 3
        System.out.println("Yazdırma Arraylist:" + tekSayilarDizisiAr1);

    }
 // Yöntem 1
    public static void tekSayilarDizisi(int[] veri, int[] tek) {

        for (int i = 0; i < veri.length; i++)
            if ((veri[i] % 2) == 1)
                tek[i] = veri[i];

        System.out.println(Arrays.toString(tek));
    }
    // Yöntem 2
    public static int[] tekSayilarDizisima(int[] veri, int[] tek) {

        for (int i = 0; i < veri.length; i++)
            if ((veri[i] % 2) == 1)
                tek[i] = veri[i];

        return tek;
    }
    // Yöntem 3
    public static ArrayList<Integer> tekSayilarDizisiAr(int[] veri, int[] tek) {
        ArrayList<Integer> tekAr = new ArrayList<>();

        for (int i = 0; i < veri.length; i++)
            if ((veri[i] % 2) == 1)
                tekAr.add(veri[i]);
        return tekAr;

    }
}

