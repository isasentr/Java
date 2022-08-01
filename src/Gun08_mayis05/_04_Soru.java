package Gun08_mayis05;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {
        //Girilen bir pasaportun sizin bildiğiniz bir kelimeyle eş olup olmadığını bılunuz.
        //şifre ="bayrak";

        Scanner oku = new Scanner(System.in);
        System.out.print("veri giriniz : ");
        String text = oku.nextLine();
        String sifre ="bayrak";

        System.out.println("Şifre geçerli mi ? " + sifre.equals(text));
        System.out.println( "Şifre geçerli mi ? " + sifre.equalsIgnoreCase(text));

        //giriline bir password un sizin bildiğiniz bir kelimeyle eş olup olmadığını bulunuz
        // şifre= "bayrak"

//        String gizliSifre="bayrak";
//
//        Scanner oku=new Scanner(System.in);
//        System.out.print("Şifreyi giriniz=");
//        String girilenSifre=oku.next();
//
//        System.out.println("Şifre geçerli mi = " + girilenSifre.equals(gizliSifre));
//        System.out.println("Şifre geçerli mi = " + gizliSifre.equals(girilenSifre));
//        System.out.println("Şifre geçerli mi = " + gizliSifre.equalsIgnoreCase(girilenSifre)); // büyük küçük harf ayırmaz
//
    }
}
