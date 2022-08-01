package Gun08_mayis05;

import java.util.Scanner;

public class _05_Soru {
    public static void main(String[] args) {
        //Girilen bir kelimenin ilk ve son harfini bulunuz

        Scanner oku = new Scanner(System.in);
        System.out.println("Yazı giriniz: ");
        String text = oku.nextLine();
        int uz=text.length();
        System.out.println(text.charAt(0)+ " "+ text.charAt(uz-1));

        Character ilkharf =text.trim().charAt(0);
        Character sonHarf =text.charAt(text.trim().length()-1);

        System.out.println(ilkharf+" "+sonHarf);

//        girilen bir kelimenin ilk ve son harfini bulunuz.
//
//        Scanner oku=new Scanner(System.in);
//        System.out.print("Bir kelime giriniz=");
//        String kelime=oku.next();
//
//        char ilkHarf= kelime.charAt(0);
//        char sonHarf= kelime.charAt( kelime.length() -1 );  // Melike  -> length 6
//
//        System.out.println("ilkHarf ve Sonharf = " + ilkHarf+" "+sonHarf);

    }
}
