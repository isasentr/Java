package Odevler._18_OdevlerHaziran06_ok;

public class _04 {
//    Bir veya daha fazla öğe içeren int array verildiğinde, arraydeki en büyük ve en küçük öğeler
//    arasındaki farkı return ediniz.
//            Not: the built-in Math.min(v1, v2) ve Math.max(v1, v2) methodları en küçük ve en büyük
//    öğeleri return eder.
//            bigDiff([10, 3, 5, 6]) → 10-3 result = 7
//    bigDiff([7, 2, 10, 9]) → 10-2 result = 8
//    bigDiff([2, 10, 7, 1]) → 10-1 result = 9
//            return tipi int dir

    public static void main(String[] args) {
        int[] list = {10, 3, 5, 6};

        System.out.println(Listmax(list) - Listmin(list));

    }

    static int Listmax(int[] list) {
        int enb = list[0];
        for (int i = 0; i < list.length; i++) {
            if (enb < list[i]) {
                enb = list[i];
            }
        }
        return enb;
    }

    static int Listmin(int[] list) {
        int enk = list[0];
        for (int i = 0; i < list.length; i++) {
            if (enk > list[i]) {
                enk = list[i];
            }
        }
        return enk;

    }
}
