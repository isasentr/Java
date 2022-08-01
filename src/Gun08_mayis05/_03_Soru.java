package Gun08_mayis05;

import java.util.Locale;
import java.util.Scanner;

public class _03_Soru {
    public static void main(String[] args) {
        //Girilen bir cümledeki A harfi sayısını bulunuz. Büyük küçük ayırımı olmadan

        Scanner oku =new Scanner(System.in);

        System.out.print("Veri giriniz :");
        String text = oku.nextLine();
        int uzunluk=text.length();

        /*
        String text1 = text.toLowerCase().replace("a","");
        int uzunluk1 = text1.length();

        System.out.println(uzunluk-uzunluk1);
*/

        int uz2 =text.replace("A","").replace("a","").length();
        int uz1 =text.toLowerCase().replace("a","").length();
        int uz3 =text.toUpperCase().replace("A","").length();
        int uz4 =text.replaceAll("[aA]","").length();

        System.out.println(uzunluk-uz1);
        System.out.println(uzunluk-uz2);
        System.out.println(uzunluk-uz3);
        System.out.println(uzunluk-uz4);


//        //girilen bir cümledeki A harfi sayısını bulunuz.(Büyük küçük harf ayırımı olmadan)
//
//        Scanner oku=new Scanner(System.in);
//        System.out.print("Bir cumle giriniz=");
//        String cumle=oku.nextLine();
//        int u=cumle.length();
//
//        int u11=cumle.replace("A","").replace("a","").length();
//        int u12=cumle.toLowerCase().replace("a","").length();
//        int u13=cumle.toUpperCase().replace("A","").length();
//        int u14=cumle.replaceAll("[Aa]","").length();
//
//        System.out.println("u-u11 = " + (u-u11));
//        System.out.println("u-u12 = " + (u-u12));
//        System.out.println("u-u13 = " + (u-u13));
//        System.out.println("u-u14 = " + (u-u14));


    }
}
