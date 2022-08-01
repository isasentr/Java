package Odevler._01_16_OdevlerMayis_ok;

import java.util.Scanner;

public class _12_OdevlerMayis16 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
//        1- # 0 ile 100 arasındaki bütün çift sayıları yazdırabileceğiniz bir kod yazınız.
//        Not: 0 ve 100 dahildir._

//        int toplam = 0;
//        for (int a = 0; a <= 100; a++) {
//            if (a % 2 == 0)
//                toplam += a;
//        }
//        System.out.println("Çİft sayılar toplamı = " + toplam);


//        2- # 0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen bütün sayıları yazdırınız.
//        Sonuç bu şekilde olmalıdır.`
//        ```
//        0
//        20
//        40
//        60
//        80
//        100
//        ```

//        for (int a = 0; a <= 100; a++) {
//            if (a % 5 == 0 && a % 4 == 0)
//                System.out.println(a);
//            continue;
//        }

//        3-  Kullanıcıdan 10 adet sayı isteyiniz, eğer sayı çift ise toplasın, tek ise girdiğinde ise döngü sonlansın.

//        int toplam = 0;
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i + ".Sayıyı giriniz:");
//            int sayi = oku.nextInt();
//            if (sayi % 2 == 0) {
//                toplam += sayi;
//            } else {
//                break;
//            }
//        }
//        System.out.println("Çift sayıların toplamı:" + toplam);

//        4- Kullanıcın gireceği bir sayının kaç basamak olduğunu bulunuz

//        System.out.print("Sayı giriniz:");
//        int sayi=oku.nextInt();
//        int basamak=1;
//        while (sayi>9){
//            sayi=sayi/10;
//            basamak++;
//        }
//        System.out.println("Basamak sayisi :"+ basamak);

//        5- Kullanıcın girdiği bir sayının ilk ve son basamaklarının eşit olup olmadığınız bulunuz
//        System.out.print("Sayı giriniz:");
//        int sayi = oku.nextInt();
//
//        int ilk = sayi % 10;
//        int son =0;
//
//        while (sayi>9){
//            sayi=sayi/10;
//            son=sayi;
//        }
//        System.out.println("ilk = " + ilk);
//        System.out.println("son = " + son);
//
//        if (ilk == son)
//            System.out.println("eşit");
//        else
//            System.out.println("Eşit Değil");

//        6-Kullanıcnın gireceği bir sayının basamaklarına göre tersi olan sayıyı bulunuz.
//
//        System.out.print("Sayı giriniz:");
//        int sayi = oku.nextInt();
//        int ters=0;
//
//        while(sayi>0){
//            int basamak=sayi%10;
//            ters=ters*10+basamak;
//            sayi/=10;
//        }
//        System.out.println("Girilen sayının tersi = " + ters);

//        7-Girilen bir cumledeki a harfi sayısını bulunuz.(Regex kullanmayın)
//
//        System.out.print("Bir cümle giriniz:");
//        String cumle = oku.nextLine();
//        int var=0;
//        for (int i = 0; i < cumle.length(); i++) {
//            if(cumle.toLowerCase().charAt(i)=='a')
//                var++;
//        }
//        System.out.println("'a' harfi sayısı = " + var);
//
//        8-Girilen bir cümledeki kelime sayısını bulunuz.(Regex kullanmayın)

//        System.out.print("Bir cümle giriniz:");
//        String cumle = oku.nextLine();
//        int bosluk=0;
//        for (int i = 0; i < (cumle.length()-1); i++) {
//            if(cumle.trim().charAt(i)==' ')
//                bosluk++;
//        }
//        System.out.println("Kelime sayısı = " + bosluk);
//

//        9-Girilen bir cümledeki kelimelerin baş harflarini yazdırınız.(Regex kullanmayın)

//        System.out.print("Bir cümle giriniz:");
//        String cumle = oku.nextLine();
//
//        System.out.println("Kelime baş harfleri= "+ cumle.charAt((0)));
//        for (int i = 0; i < cumle.length(); i++) {
//
//            if ((cumle.trim().charAt(i)==' '))
//                System.out.println("Kelime baş harfleri= "+ cumle.charAt((i+1)));
//        }
//

//        10-Kullanıcından 10 sayı isteyiniz, eğer sonra girilen önce girilenden büyük ise döngü sonlansın.

//        System.out.print("Sayı giriniz:");
//        int sayi = oku.nextInt();
//        int enb = 0;
//
//        enb = sayi;
//
//        for (int i = 0; i < 10; i++) {
//            System.out.print("Sayı giriniz:");
//            int sayi1 = oku.nextInt();
//
//            if (sayi1 < enb) {
//
//            } else
//                break;
//        }
    }
}
