package Gun25_mayis31;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _04_Soru_Method {
    public static void main(String[] args) {

        //Canlı sözlük yapılmak isteniyor.
        //Kullanıcıya  aşağıdaki gibi bir menü çıkartınız
        //1-Ekleme (Bu seçenekte kelimenin kendisi ve manasını bir cümle ile yazınız.)
        //2-Düzeltme (Bu seçenekte kullanıcıya kelimenin manasının düzelttiriniz.)
        //3-Listeleme
        //4-Arama (Bu seçenekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        //5-Silme
        //6-Çıkış

        Scanner okuInt = new Scanner(System.in);
        int secim;

        do {
            Map<String, String> sozluk = new TreeMap<>();
            System.out.print("Yapmak istediğiniz işlemi seçiniz =");
            System.out.println("\n1-Ekleme" +
                    "\n2-Düzeltme" +
                    "\n3-Listeleme" +
                    "\n4-Arama" +
                    "\n5-Silme" +
                    "\n6-Çıkış");

            System.out.println();

            System.out.print("Secim =");
            secim = okuInt.nextInt();

            switch (secim) {
                case 1:
                    Ekleme(sozluk);

                    break;
                case 2:
                    Duzeltme(sozluk);

                    break;
                case 3:
                    Listeleme(sozluk);

                    break;
                case 4:
                    Arama(sozluk);

                    break;
                case 5:
                    Silme(sozluk);

                    break;
            }
        } while (secim < 6);

    }

    public static void Ekleme(Map<String, String> sozluk) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Kelime giriniz =");
        String kelime = oku.nextLine();
        System.out.print("Anlamını giriniz =");
        String anlami = oku.nextLine();
        sozluk.put(kelime, anlami);
    }

    public static void Duzeltme(Map<String, String> sozluk) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Düzeltmek istediğiniz kelimeyi yazınız =");
        String kelime = oku.nextLine();
        if (sozluk.containsKey(kelime)) {
            System.out.print("Anlamını giriniz =");
            String anlami = oku.nextLine();
            sozluk.put(kelime, anlami);
        } else
            System.out.println("Kelime bulunamamıştır");
        System.out.println();


    }

    public static void Listeleme(Map<String, String> sozluk) {

        System.out.println("Sözlük arşivi =\n" + sozluk);

    }

    public static void Arama(Map<String, String> sozluk) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Aramak istediğiniz kelimeyi yazınız =");
        String kelime = oku.nextLine();
        for (Map.Entry<String, String> ara : sozluk.entrySet()) {
            if (ara.getKey().contains(kelime))
                System.out.println("\nKelime =" + ara.getKey() + "Anlamı = " + ara.getValue());

        }

    }

    public static void Silme(Map<String, String> sozluk) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Silmek istediğiniz kelimeyi yazınız =");
        String kelime = oku.nextLine();
        sozluk.remove(kelime);
        System.out.print("Kelime silinmiştir.");
    }
}
