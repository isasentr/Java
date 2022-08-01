package Mentoring._020622;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList2 {
    //    Write a Java program with following option
//    a. Accept elements of a list
//    b. Display elements of a list
//    c. Search the element within list given by user
//    d. Sort the list using sort method
//    e. Display elements of the list
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add((int) (Math.random()*50));
        }
        System.out.println(list);

        System.out.print("Aramak istediginiz sayiyi girin= ");
        Scanner oku=new Scanner(System.in);
        System.out.println(list.contains(oku.nextInt()));
        Collections.sort(list);
        System.out.println("list = " + list);


    }
}
