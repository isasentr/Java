package Gun28_haziran03._02_Soru;

public class Soru {
    public static void main(String[] args) {
        // Math sınıfndaki metodlarıdan 5 tanesini ve bir de diziElemanlarTopla fonksiyonlarını
        // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
        // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
        // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
        // kullanımlarını yazınız.

        int a = MyMath.getMin(3, 4);
        int b = MyMath.getAbs(-5);
        int c = MyMath.getMax(3, 4);
        double d = MyMath.getPow(3, 5);
        int e = MyMath.getRandom(3, 15);

        int[] dizi = {2, 6, 9, 8, 45};
        int f = MyMath.getDiziElemanlarTopla(dizi);

        System.out.println("getMin = " + a);
        System.out.println("getAbs = " + b);
        System.out.println("getMax = " + c);
        System.out.println("getPow = " + d);
        System.out.println("getRandom = " + e);
        System.out.println("getDiziElemanlarTopla = " + f);
    }
}


