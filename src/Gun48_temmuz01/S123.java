package Gun48;

class S123 {
    int a1;

    public static void doProduct(int a) {

        a = a * a; // a=100
    }

    public static void doString(String s) {
       s= s.concat(" " + s);
    }

    public static void main(String[] args) {
        S123 item = new S123();
        item.a1 = 11;

        String sb = "Hello";
        Integer i = 10;

        doProduct(i);  // 10 değişmedi

        doString(sb);  // sb değişmemesi

        doProduct(item.a1); // item.a1 değişmedi

        System.out.println(i + " " + sb + " " + item.a1); // 10 Hello 11
    }

}

//        byte int short long float double - pri    - metodlara sadece değerleri gider.
//
//        Byte Integer Short Long Float Double
//        String gibi Referans değer olmasına RAĞMEN
//        primitve gibi davranırla,
//        çünkü var olan değerleri değiştirlemez,
//        her zaman yeni atanırlar.
//        diğer tiplerden tek farkı NULL değerini
//        alabiliyor olmaları.
//
//        dizi,ArrayList, set, map, nesne  metodlara referansları yeni kendileri gider