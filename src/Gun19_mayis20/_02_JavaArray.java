package Gun19_mayis20;

import java.util.Arrays;

public class _02_JavaArray {
    public static void main(String[] args) {

        // 100 elemanlı bir diziyi random (0-100) doldurduktan sonra,
// sadece tek elemanlarınız bir başka diziye atayınız.

        int[] dizi = new int[10];

        for (int i = 0; i < dizi.length; i++)
            dizi[i] = (int) (Math.random() * 100);

        int teklerMiktar = 0;// teklerin miktarını buluyoruz.
        for (int i = 0; i < dizi.length; i++)
            if (dizi[i] % 2 == 1)
                teklerMiktar++;

        int[] tekler = new int[teklerMiktar]; // teklerin miktarı kadar yeni dizi oluşturuldu

        int tekIndex = 0; // tekIndex diye ayrı bir ikinci dizi için index takip edildi.
        for (int i = 0; i < dizi.length; i++)
            if (dizi[i] % 2 == 1) {
                tekler[tekIndex] = dizi[i];
                tekIndex++;
            }
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));
        System.out.println("Arrays.toString(tekler) = " + Arrays.toString(tekler));
    }
}
