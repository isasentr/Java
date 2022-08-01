package Odevler._18_OdevlerHaziran06_ok;

import java.util.Arrays;

public class _02 {
//    String bir array verildiğinde;
//    Eger String Orange içeriyorsa bütün Orange leri Apple çeviriniz.
//            Örnek:
//    Array : Peach , Berry , Orange , WaterMelon , Orange
//    Result böyle olmalı --> : Peach , Berry , Apple , WaterMelon , Apple
//    Arrayi print ediniz

    public static void main(String[] args) {
        String[] list = {"Peach", "Berry", "Orange", "WaterMelon", "Orange"};

        list1(list);
    }

    public static void list1(String[] list ){
        for (int i = 0; i < list.length; i++) {
            if (list[i].contains("Orange"))
                list[i] = "Apple";
        }
        System.out.println("list = " + Arrays.toString(list));
    }

}
