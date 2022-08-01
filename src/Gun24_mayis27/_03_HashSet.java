package Gun24_mayis27;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class _03_HashSet {
    public static void main(String[] args) {

        HashSet<String> renkler = new HashSet<>();
        renkler.add("Red");
        renkler.add("Green");
        renkler.add("Blue");
        renkler.add("Red"); // bu eklenmedi
        renkler.add("RED");// bu eklendi

        //ekrana yazdırma 1. yöntem
        System.out.println("renkler = " + renkler);

        //ekrana tek tek yazdırma 2. yöntem  foreach
        for (String s : renkler) { // renklerin içindeki elemanları herhangi bir sırayla s ismini vererek gönderiyor.
            System.out.println("renkler = " + s);

        }
        // ben bunları kendi içinde sıralı olanların sırasına göre nasıl yazdırabilirim. TreeSet ve LinkedSet

        TreeSet<String> ts = new TreeSet<>();

        ts.add("bir");
        ts.add("iki");
        ts.add("üç");
        ts.add("dört");
        ts.add("beş");

        System.out.println("ts = " + ts);//ts = [beş, bir, dört, iki, üç]

        for (String a : ts) // sırayı garanti etmiyor.
            System.out.println("a = " + a);


        Iterator gosterge = ts.iterator(); // indexin yaptığını yapıyor.
        while (gosterge.hasNext())//
        {
            System.out.println("gosterge = " + gosterge.next()); //sıradaki elemanı gösteriyor.
        }
    }


//çok önemli değilmiş

    // TODO: 27.05.2022
    //  int[] dizi=new int[5]; index var,
    //   fori(sıra garanti çünkü indexe göre ilerliyor),
    //   foreach(sıra garanti değil)
    //   for(int eleman:dizi)
    //       so eleman

    //ArrayList  index var,
    //   fori(sıra garanti çünkü indexe göre ilerliyor),
    //   foreach(sıra garanti değil)
    //   for(int eleman:dizi)
    //       so eleman
    //
    //SET lerde
    //    INDEX YOK
    //    fori yok
    //    foreach(sıra garanti değil)
    //    garanti istiyorsan ITERATOR yöntemi






}