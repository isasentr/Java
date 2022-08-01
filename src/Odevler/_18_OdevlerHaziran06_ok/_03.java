package Odevler._18_OdevlerHaziran06_ok;

public class _03 {

//    a ve b den oluşan 2 int array verildiğinde, aynı ilk öğeye sahiplerse veya aynı son öğeye
//    sahiplerse true değerini döndürünüz.
//    Her iki arrayin lengthi(öğe sayısı) 1 veya daha fazla olacaktır.
//    commonEnd([1, 2, 3], [7, 3]) → true
//    commonEnd([1, 2, 3], [7, 3, 2]) → false
//    commonEnd([1, 2, 3], [1, 3]) → true

    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = {7, 3, 2};

        System.out.println("durum=" + sonuc(a, b));

        int[] c = {1, 2, 3, 9};
        int[] d = {1, 3, 2, 9};

        System.out.println("durum=" + sonuc(c, d));

    }

    public static boolean sonuc(int[] a, int[] b) {

        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }
}

