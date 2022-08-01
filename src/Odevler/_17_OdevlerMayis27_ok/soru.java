package Odevler._17_OdevlerMayis27_ok;

import java.util.HashSet;
import java.util.Scanner;

public class soru {

//12-changeSet() isminde bir method oluşturun.
//
//Parametre olarak bir String HashSet   ve  iki String
//
//return hashset olmalı
//
//Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
//
//**ÖRNEK:**
//
//hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
//
//String 1 = **banana**
//
//String 2 = **peach**
//
//**CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"

    public static void main(String[] args) {
        HashSet<String> liste = new HashSet<>();
        liste.add("banana");
        liste.add("strawberry");
        liste.add("kiwi");
        liste.add("pineapple");

        System.out.println(changeSet(liste));
    }

    static HashSet<String> changeSet(HashSet<String> liste) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Metin girinizi =");
        String s1= oku.nextLine();
        System.out.print("Metin girinizi =");
        String s2= oku.nextLine();

        if (liste.contains(s1)){
            liste.remove(s1);
            liste.add(s2);
        }
        return liste;
    }
}
