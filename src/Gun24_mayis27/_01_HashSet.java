package Gun24_mayis27;

import java.util.ArrayList;
import java.util.HashSet;

public class _01_HashSet { // okul numarası gibi sadece 1 tane benzersiz eleman girmeni sağlıyor.
    public static void main(String[] args) {
        int sayi = 5; // hafızada 1 sayı tutar.

        int[] dizi = new int[5]; // hafızada 5 rakam tutuyor.

        int[][] tablo = new int[3][4];// 12 adet sayı tutuyor

        //dinamik boyutlu diziler lazım.
        ArrayList<Integer> liste = new ArrayList<>(); // boyu eklendikçe artan dinamik dizii.
        ArrayList<ArrayList<Integer>> listelerinlistesi = new ArrayList<>(); // dinamik 2 boyutlu

//Bana artık elemanları gelişigüzel miktarınca tutan değil, aynı elemanları tutmayan,
        //yani  1 elemandan sadece 1 tane olan diziler lazım, hangi sırada olduğunun bir önemi yok.
        //Bunlara set denir.  LINKEDHASHSET (ekleme sırasına göre),TREESET(ordered-sıralı) , HASHSET(hızlı)


        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(45);
        hs1.add(52);
        hs1.add(24);
        hs1.add(48);
        hs1.add(32);
        hs1.add(52);
        boolean eklendiMi = hs1.add(51);
        System.out.println("eklendiMi = " + eklendiMi);
        System.out.println(hs1);


    }
}
