package Odevler._23_OdevlerHaziran20.Soru_3;

import java.util.ArrayList;

public abstract class Phone {

    public static ArrayList<String> cart= new ArrayList<>();

    public static int getSum(ArrayList<String> cart) {
        int sum = 0;
        for (String sm : cart) {
            int sayi = Integer.parseInt(sm.replaceAll("^[0-9-$]", ""));
            sum += sayi;
        }
        return sum;
    }
        public abstract void options (String a,String b);
    }
