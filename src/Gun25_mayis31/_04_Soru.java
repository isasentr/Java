package Gun25_mayis31;

import java.util.*;

public class _04_Soru {
    public static void main(String[] args) {
        //Canlı sözlük yapılmak isteniyor.
        //Kullanıcıya  aşağıdaki gibi bir menü çıkartınız
        //1-Ekleme (Bu seçenekte kelimenin kendisi ve manasını bir cümle ile yazınız.)
        //2-Düzeltme (Bu seçenekte kullanıcıya kelimenin manasının düzelttiriniz.)
        //3-Listeleme
        //4-Arama (Bu seçenekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        //5-Silme
        //6-Çıkış

        Map<String, String> sozluk = new TreeMap<>();

        Scanner oku=new Scanner(System.in);
        Scanner okuStr=new Scanner(System.in);
        int secim;
        String kelime;
        String anlami;


        do {
            System.out.println("*****Menü***** :\n" +
                    "1-Ekleme\n" +
                    "2-Düzeltme\n" +
                    "3-Listeleme\n" +
                    "4-Arama\n" +
                    "5-Silme\n" +
                    "6-Çıkış");

            secim=oku.nextInt();

            switch (secim){
                case 1: // ekleme işlemleri
                    System.out.print("Kelimeyi giriniz:");
                    kelime=okuStr.nextLine();
                    System.out.print("Anlamını giriniz:");
                    anlami=okuStr.nextLine();
                    sozluk.put(kelime,anlami);
                    break;

                case 2: // düzeltme işleri
                    // TODO : kelime var mı yokmu kontrolü yapılacak
                    System.out.print("Düzeltilecek kelimeyi giriniz:");
                    kelime=okuStr.nextLine();
                    if (sozluk.containsKey(kelime)){
                    System.out.print("Anlamını giriniz:");
                    anlami=okuStr.nextLine();
                    sozluk.put(kelime,anlami);}
                    else
                        System.out.println("Kelime mevcut değil");
                    break;

                case 3: // listeleme işleri
                    System.out.println("sozluk = " + sozluk);
                    break;

                case 4: // arama işleri / kelimenin bir kaç harfini girdiğinde yine en yakın kelimeyi bulsun
                    System.out.print("Aramak istediğiniz kelimeyi yazınız =");
                    kelime = oku.nextLine();

//                    System.out.println("Aradığınız kelimenin anlamı ="+sozluk.get(kelime));
//                    System.out.println();

                    for ( Map.Entry<String, String> ara: sozluk.entrySet()){
                        if (ara.getKey().contains(kelime))
                            System.out.println("\nKelime ="+ ara.getKey()+"Anlamı = "+ara.getValue());
                    }
                    break;


                case 5: // silme işleri
                    System.out.print("Silinecek kelimeyi giriniz:");
                    kelime=okuStr.nextLine();
                    sozluk.remove(kelime);
                    break;
            }

        }while (secim<6);
        System.out.println("Sözlükten çıkıldı....Güle güle");

        // TODO : bütün işlemler burda yapıldıktan sonra , METOD ile bütün işlemleri ayırınız.
    }
}
