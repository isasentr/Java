package Mentoring._260522;

public class ArraysWithLoops2 {

    //    TODO// Write a program to check if elements of an array are
//    // same or not it read from front or back
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 2, 1};
        int[] array2 = {1, 2, 3, 3, 2, 1};

        String esitMi = "Evet";

        for (int i = 0; i < (array.length + 1) / 2; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                esitMi = "hayir";
                break;
            }
        }
        System.out.println("esitMi = " + esitMi);
    }
}
