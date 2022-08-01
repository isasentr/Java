package Gun11_mayis10;

import java.util.Scanner;

public class _04_IfElse {
    public static void main(String[] args) {
        // Mantıksal (Lojik) İfadeler
        // && -> ve    || ->  veya

        // Girilen sayı pozitif ve tek ise , ekrana uygun sayı girildi
        // degilse uygun sayı girilmedi yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        int sayi = oku.nextInt();
        if(sayi>0 && sayi%2==1){
            System.out.print("Uygun sayı girildi.");
        }else {
            System.out.print("Uygun sayı girilmedi.");
        }
    }
}
