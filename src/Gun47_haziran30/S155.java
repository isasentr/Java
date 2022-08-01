package Gun47;

import java.util.ArrayList;

public class S155 {
    public static void main(String[] args) {

        ArrayList<Integer> points = new ArrayList<>();

        points.add(1);
        points.add(2);
        points.add(3);
        points.add(4);
        points.add(null);

        System.out.println(points);

        points.remove((Object)1); // deger olarak siler
        points.remove((Object)7); // deger olarak siler, değeri bulamazsa hata vermez
        //points.remove(1); // rakam ise önce indexe bakar
        //points.remove(7); olmayan indexi silme işleminde hata verir

        System.out.println("points = " + points);

        points.remove(null);

        System.out.println(points);
    }
}

//    Veri tipleri
//
//int short byte char float double primitive
//
//
//        String(NULL)
//
//        String gibi davranıyorlar   NULL
//        Integer Short Byte Char Float Double
//        metodlar  nesne gibi
