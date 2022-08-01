package Gun08_mayis05;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {
        // girilen bir cümledeki ilk kelimeyi yazdırınız.

        Scanner oku =new Scanner(System.in);

        System.out.println(" Cümle giriniz.");
        String text = oku.nextLine();

        System.out.println("ilk kelime: "+ text.substring(0,text.indexOf(" ")));
        System.out.println("Son kelime: "+ text.substring(text.lastIndexOf(" ")).trim());

        // girilen bir cümledeki ilk kelimeyi yazdırınız

        Scanner oku1=new Scanner(System.in);
        System.out.print("Bir cumle giriniz=");
        String cumle=oku.nextLine();

        String ilkKelime=cumle.substring(0, cumle.indexOf(" "));

        System.out.println("ilk Kelime = " + ilkKelime);
    }

    }

