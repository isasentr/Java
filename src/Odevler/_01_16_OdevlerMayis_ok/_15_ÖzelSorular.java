package Odevler._01_16_OdevlerMayis_ok;


import java.util.Scanner;

public class _15_ÖzelSorular {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

//        1-	Kullanıcıdan yaş bilgisini isteyiniz Eğer yaş 10 dan küçük veya eşit ise
//        "facebook hesabi acmak icin cok gencsin" şeklinde yazdırın
//
//        Eğer yaş 16 dan küçük veya eşit ise
//        "ehliyet almak icin cok gencsin" şeklinde yazdırın
//
//        Eğer yaş 18 den küçük veya eşit ise
//        "dovme yaptirmak icin cok gencsin" şeklinde yazdırın
//
//        Eğer yaş 21 den küçük veya eşit ise
//        "alkol icmek icin cok gencsin" şeklinde yazdırın
//
//        Eğer yaş 21 den büyük ise
//        "istediğini yapabilirsin" şeklinde yazdırın

/*
            System.out.print("Yaşınızı giriniz:");
            int yas=oku.nextInt();
            if (yas<=10) {
                System.out.print("facebook hesabi acmak icin cok gencsin");
            }else if (yas<=16){
                System.out.print("ehliyet almak icin cok gencsin");}
            else if (yas<=18){
                System.out.print("dovme yaptirmak icin cok gencsin");}
            else if (yas<=21){
                System.out.print("alkol icmek icin cok gencsin");}
            else if (yas>21){
                System.out.print("istediğini yapabilirsin");}
*/

//        2-	Girilen bir sayı çift ise "true" , tek ise "false" yazdırınız.

/*        System.out.print("Sayı giriniz:");
        int sayi=oku.nextInt();
        if (sayi%2==0)
            System.out.println("Girilen sayı çifttir.");
        else
            System.out.println("Girilen sayı tektir");
        */

//        3-	Girilen bir string de kaç tane b harfi olduğunu yazdırınız.

/*

        System.out.print("Kelime giriniz:");
        String kelime=oku.nextLine();
        int uzunluk =kelime.toLowerCase().trim().length();
        String bsiz =kelime.toLowerCase().replace("b","");
        int uzunlukbsiz=bsiz.trim().length();

        System.out.print("Girilen kelimedeki b sayısı:"+(uzunluk-uzunlukbsiz));

*/


//        4-	Aşağıda verilen gün adlarına göre, Girilen bir gün numarasına karşılık gelen gün adını yazınız.
//        Eger int 1 ise print monday Eger int 2 ise print tuesday Eger int 3 ise print wednesday Eger int 4 ise print thursday Eger int 5 ise print friday
//        Eger int 6 ise print saturday Eger int 7 ise print sunday
//        Eger int 8 den buyuk ise print "this is not a valid day"
//
//        NOT : BU PROBLEMI ÇÖZERKEN SWITCH STATEMENT KULLANIN

/*

        System.out.print("Hafta gün numarası giriniz:");
        int numara = oku.nextInt();

        switch (numara) {
            case 1:
                System.out.println("Monday");break;
            case 2:
                System.out.println("Tuesday");break;
            case 3:
                System.out.println("Wednesday");break;
            case 4:
                System.out.println("Tuesday");break;
            case 5:
                System.out.println("Friday");break;
            case 6:
                System.out.println("Saturday");break;
            case 7:
                System.out.println("Sunday");break;
            default:
                System.out.println("this is not a valid day");break;
        }

*/

//        5-	Girilen bir sayının faktöriyel değerini bulmak için bir program yazın.
//
//                number:6 factorial:1*2*3*4*5*6=720 output ---> 720

/*        System.out.print("Sayı giriniz:");
        int sayi = oku.nextInt();

        int faktoriyel=1;
        for (int i = 1; i <= sayi; i++) {
            faktoriyel*=i;
        }
        System.out.print("Girilen sayının faktoriyeli:"+faktoriyel);*/


//        6-	İçinde negatif de olabilen sayının ve para sembolünün olduğu aşağıdaki gibi 3 tane String okutunuz
//        okunan bu 3 string içindeki negatif de olabilen sayıları toplayın.
//                Toplam pozitif ise toplamı yazdırın, eğer toplam negatif ise sadece -1 yazdırın.
//
//                Ornek:
//        String num1 = "$15"; String num2 = "$20"; String num3 = "$30"; output ----> 65; olmali
//
//        String num1 = "$15"; String num2 = "$-80"; String num3 = "$30"; output ----> -1; olmali

/*
       int toplam=0;
        for (int i = 0; i < 3; i++) {
            System.out.print("Birimi ve sayıyı giriniz:");
            String sayiBirim = oku.nextLine();
            int sayi=Integer.parseInt(sayiBirim.replaceAll("[^-+0-9]",""));
            toplam+=sayi;
        }
        if (toplam>0)
        System.out.println("Toplam:" + toplam);
        else
            System.out.println(-1);

*/


//        7-	Girilen pozitif bir sayının tam kare olup olmadığını bulunuz, tam kare ise true değilse false yazdırınız.
//                Not: sqrt gibi fonksiyonları kullanmayın. Example 1:
//        Input: 16
//        Output: true
//        Not: bu sayı tam kare çünkü 4*4 = 16
//
//        Example 2:
//        Input: 14
//        Output: false (14 tam kare degil)

/*
        System.out.print("Sayı giriniz:");
        int sayi = oku.nextInt();

        int aranansayi = 0;
        for (int i = 1; i <=sayi ; i++) {
            if (i * i == sayi) {
                aranansayi = i;
                break;
            }
        }
        if (aranansayi > 0) {
            System.out.println(true);
        } else
            System.out.println(false);
*/


//        8-	Girilen bir sayıya kadar olan çift sayıları (0 ve girilen sayı dahil) yazdırınız.
//
//                Example 1: int input = 10;
//
//        print 0 2 4 6 8 10 olmalı
//
//        Example 2: int input = 15;
//
//        print 0 2 4 6 8 10 12 14 olmalı

/*
        System.out.print("Sayı giriniz:");
        int sayi = oku.nextInt();

        for (int i = 0; i <= sayi; i++) {
             if(i%2==0)
                 System.out.println(i);
        }
*/


//        9-	Kullanıcıdan pozitif bir sayı alınız ve 0 ile girilen sayı arasında Random int tipinde bir sayı üreten programı yazınız.
//                not : girilen sayı üretilen sayılara dahil olmalı

/*
        System.out.print("Sayı giriniz:");
        int gsayi = oku.nextInt();

        int randomsayi=(int)(Math.random()*(gsayi+1));
        System.out.println(randomsayi);

*/

//        10-	Girilen 2 sayı arasında Random integer sayı üreten programı yazınız.

/*        System.out.print("1.Sayı giriniz:");
        int gsayi1 = oku.nextInt();

        System.out.print("2.Sayı giriniz:");
        int gsayi2 = oku.nextInt();

        int maxsayi = Math.max(gsayi1, gsayi2);
        int minsayi = Math.min(gsayi1, gsayi2);

        int randomsayi = (int) (Math.random() * (maxsayi-minsayi)+minsayi);
        System.out.println(randomsayi);
        */

//        11-	Girilen bir string deki harf sayısı tek ise true , değilse false yazdırınız.


/*
        System.out.print("string giriniz:");
        String cumle= oku.nextLine();
        int harfSayi=cumle.length();

        boolean tek=true;
        boolean cift=false;

        if (harfSayi%2==1)
            System.out.println("harf sayısı tek:" +tek);
        else
            System.out.println("harf sayısı tek:" +cift);
*/



//        12-	Scanner class kullanılarak verilen iki tane Stringi birbirlerine ekle.
//        Eger ilk kelimenin son harfi, ikinci kelimenin ilk harfi ile aynı ise aynı olan harflerin birisini kaldırın Örnek:	"abc", "cat" --> "abcat"
//        "abc", "dog" -->"abcdog"

/*
        System.out.print("1.string giriniz:");
        String kelime1= oku.nextLine();

        System.out.print("2.string giriniz:");
        String kelieme2= oku.nextLine();

        Character ilkHarf=kelieme2.toLowerCase().charAt(0);
        Character sonHarf=kelime1.toLowerCase().charAt((kelime1.length())-1);

        String silkeme=kelieme2.substring(1);

        if (sonHarf.equals(ilkHarf))
        System.out.println(kelime1.concat(silkeme));
        else
            System.out.println(kelime1.concat(kelieme2));

*/

    }

}
