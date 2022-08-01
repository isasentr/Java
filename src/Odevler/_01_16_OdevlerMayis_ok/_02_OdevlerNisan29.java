package Odevler._01_16_OdevlerMayis_ok;
import java.util.Scanner;
public class _02_OdevlerNisan29 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

//        1- Bir String oluşturun. Konsol'a isminizi girin.İsminizi yazdırın.
        System.out.print("Adınızı giriniz: ");
        String adiniz= scan.nextLine();
        System.out.println("Adiniz = " + adiniz);
        System.out.println("------------------------");

//        2- Bir int oluşturun.Konsol'a herhangi bir sayı giriniz.Bu sayıyı yazdırın.
        System.out.print("Sayı giriniz: ");
        int sayigiriniz =scan.nextInt();
        System.out.println("Girilen sayı = " + sayigiriniz);
        System.out.println("------------------------");

//        3- Bir String oluşturun.Konsol'a sevdiğiniz bir meyveyi yazın.O meyveyi yazdırınız.
        Scanner scan1 =new Scanner(System.in);
        System.out.print("Sevdiğiniz meyveyi yazınız: ");
        String sevmeyve = scan1.nextLine();
        System.out.println("Favori meyveniz: = " + sevmeyve);
        System.out.println("------------------------");

//        4- Bir int oluştur.Konsol'a arabanızdaki kapı sayısını girin.Bu int'i yazdırın.
        System.out.print("Arabanızdaki kapı sayısını giriniz: ");
        int kapi = scan.nextInt();
        System.out.println("Kapı Sayısı:  = " + kapi);
        System.out.println("------------------------");

//        5- Bir String oluştur.Konsol'a 10 sene önceki yaşadığın şehri yazın.Bu String'i yazdırın.
        Scanner scan2 =new Scanner(System.in);
        System.out.print("10 sene önceki yaşadığın şehri yazın:");
        String sehir= scan2.nextLine();
        System.out.println("Girilen şehir adı: = " + sehir);
        System.out.println("------------------------");

//        6- Bir string oluşturunuz.Doğum gününüzü konsola giriniz.String'i yazdırınız.
        Scanner scan3 =new Scanner(System.in);
        System.out.print("Doğum gününüzü giriniz: ");
        String dogumGun = scan3.nextLine();
        System.out.println("Doğum Gününüz:  = " + dogumGun);
        System.out.println("------------------------");

//        7- Bir boolean oluşturunuz.Konsola "Bir Banka Hesabınız Var mı ? " yazınız.
       //    Varsa True , yoksa False olarak  konsoldan cevap veriniz.Boolean'ı yazdırınız.
        System.out.print("Banka hesabınız var mı ?");
        boolean hesap= scan.nextBoolean();
        System.out.println("Banka hesabınız var mı ? = " + hesap);
        System.out.println("------------------------");

//        8- Bir byte oluşturunuz.Konsola kg cinsinden bir ağırlık yazınız.Byte'ı yazdırınız.
        Scanner scan4 =new Scanner(System.in);
        System.out.print("0-127 kg aralığında bir ağırlık giriniz:");
        byte agırlık = scan4.nextByte();
        System.out.println("Girilen ağırlık: = " + agırlık + " kg");
        System.out.println("------------------------");

//        9- Bir float oluşturunuz.Konsola boyunuzu giriniz.Float'ı yazdırınız.
        System.out.print("Boyunuzu giriniz:");
        float boy = scan.nextFloat();
        System.out.println("Boyunuz = " + boy+ " cm");
        System.out.println("------------------------");
    }

}
