package Odevler._18_OdevlerHaziran06_ok;

import java.util.Arrays;

public class _09 {

//    Bir int array verildiğinde, array uzunluğu 1 veya daha fazlaysa ve ilk öğe ile son öğe eşitse
//true değerini yazdırınız.
//    sameFirstLast([1, 2, 3]) → false
//    sameFirstLast([1, 2, 3, 1]) → true
//    sameFirstLast([1, 2, 1]) → true
//    sameFirstLast([1]) → true
//    sadece true veya false print ediniz

    public static void main(String[] args) {

        int[] dizi = {1, 2, 3};

        if (dizi.length >= 1 && (dizi[0] == dizi[dizi.length - 1]))
            System.out.println(Arrays.toString(dizi)+" = " +true);
        else
            System.out.println(Arrays.toString(dizi)+" = " +false);

    }
}
