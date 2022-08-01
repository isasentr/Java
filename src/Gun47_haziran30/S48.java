package Gun47;

import java.util.ArrayList;
import java.util.List;

public class S48 {
    public static void main(String[] args) {

        List colors= new ArrayList();

        colors.add("green");
        colors.add("blue");
        colors.add("red");
        colors.add("yellow");

        colors.remove(2); // red silindi
        System.out.println("colors = " + colors);

        colors.add(3, "cyan");
        // son sıraya denk gelen indexe eklenebilir,
        // ama ondan daha büyük bir indexe eklenemez hata veririr

        System.out.println(colors);

    }
}
