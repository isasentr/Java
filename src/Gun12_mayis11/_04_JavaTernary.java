package Gun12_mayis11;

import java.util.Scanner;

public class _04_JavaTernary {
    public static void main(String[] args) {
        // Kullanıcının gireceği sayı çift ise bir stringe "çift" atayınız,
        // tek ie "tek" atayınız ve ekrana stringi yazdırınız.

        Scanner oku = new Scanner(System.in);

        System.out.println("Sayı giriniz=");
        int sayi = oku.nextInt();

        if(sayi%2==0){
            System.out.println("Çİft");
        }else {
            System.out.println("Tek");
        }

        //Alternatif Ternary yöntemi
        System.out.println((sayi%2==1) ? "tek":(sayi%2==1) ? "tek":"çift");

    }
}
