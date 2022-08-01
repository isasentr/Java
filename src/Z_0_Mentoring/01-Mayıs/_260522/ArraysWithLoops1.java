package Z_0_Mentoring._260522;

import java.util.Arrays;

public class ArraysWithLoops1 {

//   TODO //Fill an array with 20 random integers between 0-100 and print the following:
//    //number of odd numbers
//    //number of even numbers

    public static void main(String[] args) {
        int[] dizi= new int[20];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int)(Math.random()*100);
        }

        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==0){
                System.out.println(dizi[i]+"= cift");
            }
            else {
                System.out.println(dizi[i]+"= tek");
            }
        }
    }
}
