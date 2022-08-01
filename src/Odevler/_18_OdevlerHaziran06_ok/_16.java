package Odevler._18_OdevlerHaziran06_ok;


public class _16 {
    // İnteger array ‘numaralar’ ve integer ‘toplam’ verilmistir.
    //Verilen array’de toplami, integer ‘toplam’ a esit olan kac cift numara bulunduğunu hesaplayınız.
    //Örnek:
    //int[] numaralar = {1, 9, 5, 14, 2, 0, 4};
    //Int toplam = 6;
    //Verilen array’de toplami 6 olan çift sayisini bulmalıyız.
    //Toplami 6 olan ciftler = [1, 5] ve [2, 4] dur. Toplami 6 olan iki adet ciftimiz var.
    //Result 2 olmali!

    public static void main(String[] args) {
        int[] numaralar = {1, 9, 5, 14, 2, 0, 4};
        int toplam = 6;

        System.out.println(list(numaralar));
    }

    public static int list(int[] numaralar) {
        int sayac = 0;
        for (int i = 0; i < numaralar.length; i++) {
            for (int j = 1+i; j < numaralar.length; j++) {
                if (numaralar[i] + numaralar[j] == 6) {
                    sayac++;
                }
            }
        }
        return sayac;
    }
}
