package Odevler._18_OdevlerHaziran06_ok;

import java.util.ArrayList;

public class _12 {
    //Girdiğiniz String parametresinin herbir karakterinin(char) sayısını döndüren charCount
    //metodunu yazınız.
    //Örnek:
    //String = aabbbcccc
    //return a , 2 olmalı
    //b , 3
    //c , 4
    //Not: Stringde herhangi bir char olabilir.
    public static void main(String[] args) {
        String kelime = "aabbbcccc";
        System.out.println(charCount(kelime));
    }
    public static String charCount(String kelime) {
        int count = 1;
        ArrayList<String> strlist = new ArrayList<>();

        for (int i = 0; i < kelime.length()-1; i++) {
            if (kelime.charAt(i) == kelime.charAt(i+1)) {
                count++;
            } else {
                strlist.add(count + "-" + kelime.charAt(i));
                count = 1;
            }
        }
        strlist.add(count + "-" + kelime.charAt(kelime.length() - 1));

        return String.valueOf(strlist);
    }
}

