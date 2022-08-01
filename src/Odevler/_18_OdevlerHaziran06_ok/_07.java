package Odevler._18_OdevlerHaziran06_ok;

import java.util.ArrayList;

public class _07 {

    //    Verilen int arrayde;
//    duplicated(tekrarlanan) öğeleri array den kaldırınız.
//    non-duplicated(tekrarlanmayan) öğeleri print ediniz.
//    Örnek:
//    Array is 1,2,2,2,3,3,3,4,4,4,5,5,5
//    result [1,2,3,4,5] olmalı
//    NOT: resultu print ederken for loop kullanmayınız.
//            System.out.println(Arrays.toString(your_array_name)); kullanınız
    public static void main(String[] args) {
//          1. Alternatif
//        Integer[] array = {1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5};
//        HashSet<Integer> array1=new HashSet<>(Arrays.asList(array));
//        System.out.println(array1);

//        2. Alternatif
        int[] array = {1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5};
        ArrayList<Integer> array1 = new ArrayList<>();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j])
                    array[i] = 0;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                array1.add(array[i]);
            }
        }
        System.out.println(array1);
    }
}
