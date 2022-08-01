package Mentoring._030622;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListsWithMethods {
    //    Suppose A, B, C are lists of integers.
//    The numbers in list A appear in ascending order
//    while the numbers in list B appear in descending order.
//    Write a user defined method in Java to produce third list C
//    by merging list A and B in ascending order.
//    Use A, B and C as arguments in the method.
    public static void main(String[] args) {
        ArrayList<Integer> A = listeOlustur(10);
        ArrayList<Integer> B = listeOlustur(25);

        Collections.sort(A);
        Collections.sort(B);
        Collections.reverse(B);
        System.out.println("A = " + A);
        System.out.println("B = " + B);

        ArrayList<Integer> BirlesikListe= birlestir(A,B);
        System.out.println("BirlesikListe = " + BirlesikListe);
    }

    public static ArrayList<Integer> birlestir(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> c=new ArrayList<>();
        c.addAll(list1);
        c.addAll(list2);
        Collections.sort(c);
        return c;
    }

    public static ArrayList<Integer> listeOlustur(int elemanSayisi){
        ArrayList yeniList=new ArrayList();
        for (int i = 0; i < elemanSayisi; i++) {
            yeniList.add((int) (Math.random()*100));
        }

        return yeniList;
    }
}
