package Gun42_haziran23.StringIslemleri;

import java.util.Arrays;

public class _02_StringBuilderAndStringBuffer {
    public static void main(String[] args) {

        // String değişkeni çok fazla ekleme veya işlemlere
        // göre perfomansı oldukça düşük.

        String cumle = "";
        cumle = cumle + "bugün ";
        cumle = cumle + "hava ";
        cumle = cumle + "guzel ";


        System.out.println("cumle = " + cumle);

        cumle = cumle.concat("oldu"); // atama gerekir

        System.out.println("cumle=" + cumle);

        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır. Fakat paralel çalışan
        // uygulamalarda güvenli değildir.Ozaman StringBuffer kullanılır.

        StringBuilder s = new StringBuilder();  // her şey StringBuffer aynı.. Buffer ile String arasında ki tek fark kontrol etmesi(buffer).

        s.append("Bugün ");  // tekrar kendine atama gerektşrmez
        s.append("hava ");
        s.append("guzel ");
        System.out.println("s = " + s);

        System.out.println("s.length = " + s.length());
        s.append(4); //eklenen her şeyi string çevirip ekler
        System.out.println("s = " + s);

        s.reverse(); // stringi tersine çevirir.
        System.out.println("s = " + s);

        s.delete(0, 5); // o dahil 5 hariç indexe göre siler
        System.out.println("s = " + s);

        s.deleteCharAt(3); // sadece belirtilen indexteki karakteri siler
        System.out.println("s = " + s);

        s.insert(5,"kelime"); // 5 nolu indexe araya kelime eklendi.
        System.out.println("s = " + s);

        s.insert(4, 5.46); // 4 nolu indexe rakam da double eklenebilir.
        System.out.println("s = " + s);


        int [] dizi ={1,3,46,56};
        s.insert(6, Arrays.toString(dizi));
        System.out.println("s = " + s);

        s=new StringBuilder("Bugün hava sıcak"); //sıfırlandı ve ilk değer aldı.
        System.out.println("s = " + s);

        s.replace(3,8,"bu"); // verilen aralığı verilenle değiştirir.
        System.out.println("s = " + s);
        System.out.println("----------------");
        for (int i: dizi)
            s.append(i);
        System.out.println("s = " + s);



        String yenis=s.toString();
        yenis.replaceAll("a", "b");
        System.out.println("yenis = " + yenis);
    }
}