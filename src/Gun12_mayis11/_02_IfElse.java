package Gun12_mayis11;

import java.util.Scanner;

public class _02_IfElse {
    public static void main(String[] args) {
        //Girilen bir sayıyı pozitif, negatif veya sıfır olduğunu yazdırınız.
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int sayi = oku.nextInt();
        if (sayi>0) {
            System.out.println("Pozitif");
        }else if (sayi<0){
            System.out.println("Negatif");
        } else{
            System.out.println("Sıfır");
        }
        System.out.println("--------------");
        System.out.println((sayi>0) ? "pozitif":(sayi<0) ? "negatif":"sıfır");
    }
}
