package Gun19_mayis20;

import java.util.Arrays;
// 100 elemanlı bir diziyi random (0-100) doldurduktan sonra,
// sadece tek elemanlarınız bir başka diziye atayınız.
public class _01_JavaArray {
    public static void main(String[] args) {
/*        int [] dizi = new int[10];
        int [] tekler = new int[10];
        System.out.println("Once teklr = " + Arrays.toString(tekler));

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);
        }
        int tekIndex=0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==1){
                tekler[tekIndex] =dizi[i];
                tekIndex++;
            }
        }
        System.out.println("dizi ="+ Arrays.toString(dizi));
        System.out.println("tekler " + Arrays.toString(tekler));*/


        int [] dizi = new int[10];
        int [] tekler = new int[10];
        System.out.println("Once teklr = " + Arrays.toString(tekler));

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 100);
        }
        int tekIndex=0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==1){
                tekler[tekIndex] =dizi[i];
                tekIndex++;
            }
        }
        System.out.println("dizi ="+ Arrays.toString(dizi));
        System.out.println("tekler " + Arrays.toString(tekler));
    }
}
