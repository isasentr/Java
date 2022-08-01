package Odevler._01_16_OdevlerMayis_ok;

public class _03_OdevlerMayıs03 {
    public static void main(String[] args) {
        /*
//        1-**I love java** olan bir String oluşturun.
//        Bu cümlenin toplam karakter sayısını yazdırın.

        String kelime ="I love java";
        int uzunluk =kelime.length();
        System.out.println("Karakter sayısı: "+ uzunluk);

//        2-**Sprint planning** olan bir String oluşturun.
//        Bu dizenin _toplam karakter sayısını_ yazdırın.

        String kelime1="Sprint planning";
        int uzunluk1 = kelime1.length();
        System.out.println("Karakter sayısı: "+ uzunluk1);

//        3-**apple** olan bir String oluşturun.
//        String'in _içinde_ **app** olup olmadığını **doğrula**.
        String kelime2 = "apple";
        boolean dogrula =kelime2.contains("app");
        System.out.println("dogrula = " + dogrula);

//        4- **orange** kelimesinden oluşan bir String oluşturun.
//        String'in **Apple**'a _eşit_ olup olmadığını doğrulayın.

        String keli1 ="orange";
        String keli2 ="Apple";

        boolean sorgu =keli1.equals(keli2);
        System.out.println("sorgu = " + sorgu);
        
//        5-**apple**  olan  bir String oluşturun.
//        String'in **apple**'a _eşit_ olup olmadığını doğrulayın.
//        _Büyük harf veya küçük harf önemli değildir._

        String kelim3= "apple";
        boolean sorgu1 = kelim3.equalsIgnoreCase("apple");
        System.out.println("sorgu1 = " + sorgu1);

//        6-**Florida** kelimesinden bir String oluşturun.
//        Florida kelimesinin içindeki, sadece  **'o'**  harfinin bulunduğu indexini yazdırın.
        String kelim = "Florida";
        System.out.println("kelim.indexOf(\"o\") = " + kelim.indexOf("o"));

//        7-**Thank you** olan bir String oluşturun.
//        Thank you içindeki, sadece  **'y'** harfinin bulunduğu _konumu_ yazdırın.

        String kelime4 = "Thank you";
        int harfKonum = kelime4.indexOf("y");
        System.out.println("harfKonum = " + (harfKonum+1));

//        8-**Main method** oluşturun.
//        **Mouse** değerinde bir String oluştur.
//        Mouse String'inin 3_. sırasındaki karakteri_ yazdırın.
        String kelime06 ="Mouse";
        System.out.println("3.sıradaki karakter = " + kelime06.charAt(3-1));
*/
//        ÖZEL SORULAR
//
//        9-girilen tamAdSoyad ın  2 kelimelik mi 3 kelimelik mi oldugunu nasıl anlarsınız
/*
        Scanner oku = new Scanner(System.in);
        System.out.print("Ad soyag giriniz:");
        String adsoyad = oku.nextLine();
        int uzunluk1 =adsoyad.trim().length();
        String bosluksuz= adsoyad.replace(" ","");
        int uzunluk2 =bosluksuz.trim().length();
        System.out.println("Kelime sayısı:"+(uzunluk1-uzunluk2+1));

/*
//        10-3 kelimelik ismi olan kişinin ad , 2.ad ve soyadını A.E.Y. şeklinde yazınız.

        Scanner oku=new Scanner(System.in);
        System.out.print("Ad ve soyad giriniz=");
        String tamAd=oku.nextLine();

        char ilkHarf=tamAd.charAt(0);
        int boslukIndex=tamAd.indexOf(" ");
        char ikiHarf=tamAd.charAt(boslukIndex+1);
        int boslukIndex1 =tamAd.lastIndexOf(" ");
        char soyad =tamAd.charAt(boslukIndex1+1);
        System.out.println("Şifreli Ad="+ilkHarf+"."+ikiHarf+"."+soyad+".");
*/
    }
}
