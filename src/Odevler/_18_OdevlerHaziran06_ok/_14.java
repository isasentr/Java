package Odevler._18_OdevlerHaziran06_ok;

import java.util.*;

public class _14 {
    //allNumbers Integer Hashset verildiğinde;
    //allNumbers hashset'i sort edin,
    //Sonucu ArrayList olarak değiştirin,
    //Return ArrayList.
    //NOT : SORUYU ÇÖZERKEN COLLECTİON CLASS KULLANMAYINIZ , FOR LOOP VEYA
    //FARKLI SET TİPLERİNİ KULLANINIZ.

    public static void main(String[] args) {

        Set<Integer> allNumbers = new HashSet<>();

        allNumbers.add(1);
        allNumbers.add(5);
        allNumbers.add(10);
        allNumbers.add(58);
        allNumbers.add(12);
        allNumbers.add(19);

        System.out.println(ArrayListdonus(allNumbers));
    }

    public static ArrayList ArrayListdonus(Set<Integer> allNumbers) {

        TreeSet<Integer> allNumbersshort = new TreeSet<>(allNumbers);
        for (Integer a : allNumbers) {
            allNumbersshort.add(a);
        }
        ArrayList<Integer> arrayList1 = new ArrayList<>(allNumbersshort);
        return arrayList1;
    }
}
