package Odevler._19_OdevlerHaziran13_oop1.Soru3;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        Subscribe uyelik=new Subscribe("isa",true, 1);
//
//        System.out.println("Üyelik Bilgileri = " + uyelik);

        Scanner oku = new Scanner(System.in);
        Scanner sayi = new Scanner(System.in);
        ArrayList<Subscribe> subscribeArrayList = new ArrayList<>();

        System.out.print("Adınızı giriniz=");
        String adi = oku.nextLine();
        System.out.print("Talik etmek istiyor musunuz ? E/H = ");
        String takip = oku.nextLine();
        if (takip.equalsIgnoreCase("E")) {
            System.out.println(
                    "\nGold üyelik için 1'e" +
                            "\nSilver üyelik için 2'e" +
                            "\nBronze üyelik için 3'e " +
                            "basınız.");
            System.out.print("Seçiminiz=");
            int secim = sayi.nextInt();
            if (secim == 1) {
                subscribeArrayList.add(new Subscribe(adi, true, 1));
            }
            else if (secim == 2) {
                subscribeArrayList.add(new Subscribe(adi, true, 2));
            }     else  if (secim == 3) {
                        subscribeArrayList.add(new Subscribe(adi, true, 3));
            }
        } else if (takip.equalsIgnoreCase("H")) {
            System.out.println("See you when you want to be a member.");
        }
        System.out.println();
        System.out.println("subscribeArrayList ="+subscribeArrayList);
    }
}
