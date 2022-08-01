package Odevler._18_OdevlerHaziran06_ok;

import static java.lang.String.valueOf;

public class _11 {
    //Parametresi int ve return tipi int olan power4 isminde method verilmiştir.
    //power4 metodu girilen int parametresinin rakamlarının ayrı ayrı 4.kuvvetini alıp toplayınız.
    //Örnek:
    //parameter int is 1234
    //1⁴ + 2⁴ + 3⁴ + 4⁴ = 1 + 16 + 81 + 256
    //result 354 olmalı.

    public static void main(String[] args) {
        int sayi = 1234;
        System.out.println(power4(sayi));
    }
    public static int power4(int sayi) {
        String str = valueOf(sayi);
        int toplam = 0;
        for (int i = 0; i < str.length(); i++) {
            int deger = Integer.parseInt(String.valueOf(str.charAt(i)));
            toplam += Math.pow(deger, 4);
        }
        return toplam;
    }
}
