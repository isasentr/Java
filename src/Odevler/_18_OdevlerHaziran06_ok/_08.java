package Odevler._18_OdevlerHaziran06_ok;

import java.util.Arrays;

public class _08 {
    //    Verilen String arrayde;
//    String arrayi ters çeviriniz.
//    ters arrayi yazdırınız.
//            NOT:
//            Arrays.toString(your_array_name); <--- kullanınız.
    public static void main(String[] args) {

        String[] seri = {"kumanda paneli","ali","mesut"};
        String[] seriters = new String[seri.length];
        int a=0;
        for (int i = seri.length-1; i >=0 ; i--) {
            seriters[a]=seri[i];
            a++;
        }
        System.out.println(Arrays.toString( seriters));
    }
}
