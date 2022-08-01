package Odevler._18_OdevlerHaziran06_ok;

import java.util.HashSet;
import java.util.Set;

public class _15 {
//Parametresi Set String olan ve Set içindeki Stringlerin uzunluklarının toplamını döndüren
//getTotalLength metodunu yazınız.
//return total
//Örnek:
//Set String "repl" "is" "homework"
//result 14 olmalı
//NOT : EĞER SONUÇ 0'A EŞİT OLURSA -1 İLE DEĞİŞTİRİNİZ.

    public static void main(String[] args) {
        Set<String> toplamleng = new HashSet<>();
        toplamleng.add("repl");
        toplamleng.add("is");
        toplamleng.add("homework");

        System.out.println("getTotalLength = " + getTotalLength(toplamleng));
    }
    public static int getTotalLength(Set<String> toplamleng) {
        int toplam = 0;
        for (String a : toplamleng) {
            toplam += a.length();
        }
        if (toplam == 0)
            toplam = -1;
        return toplam;
    }
}
