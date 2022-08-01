package Mentoring._260522;

public class ArraysWithLoops3 {

    //  TODO  Write a Java program to find the duplicate values of an array of string values.
//    String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
    public static void main(String[] args) {
        String[] my_array = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};

        for (int i = 0; i < my_array.length-1; i++) {
            for (int j = i+1; j < my_array.length; j++) {
                if(my_array[i].equals(my_array[j])){
                    System.out.println("my_array = " + my_array[i]);
                }
            }
        }
    }
}
