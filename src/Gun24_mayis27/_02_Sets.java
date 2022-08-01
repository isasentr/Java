package Gun24_mayis27;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {

        //Sets :Hashset(hızlı)
        //LinkedHashSet (EKLEME SIRASINA GÖRE SIRALI),
        //TreeSet(her zaman sıralı)

        //TODO: 27.05.2022   Hızlı çalışmak için kendi özel algoritma sırasına göre saklar.

        HashSet<String> hs = new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("üç");
        hs.add("dört");
        hs.add("beş");

        System.out.println("hs = " + hs);//hs = [dört, iki, bir, üç, beş]

        //TODO: 27.05.2022   Ekleme sırasına göre tutuyor.

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("bir");
        lhs.add("iki");
        lhs.add("üç");
        lhs.add("dört");
        lhs.add("beş");

        System.out.println("lhs = " + lhs);

        //TODO: 27.05.2022   Alfebatik olarak sıralı tutuyor.
        TreeSet<String> ts = new TreeSet<>();

        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("beş");

        System.out.println("ts = " + ts);

        // TODO: 27.05.2022   sayısal sıraya göre sıralı tutuyor.
        TreeSet<Integer> ts1 = new TreeSet<>();

        ts1.add(5);
        ts1.add(89);
        ts1.add(3);
        ts1.add(17);
        ts1.add(1);

        System.out.println("ts1 = " + ts1);


    }
}
