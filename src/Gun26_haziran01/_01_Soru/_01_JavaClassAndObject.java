package Gun26_haziran01._01_Soru;

import java.util.Scanner;

public class _01_JavaClassAndObject {

    //methodun yazılabildiği yer
    public static void main(String[] args) {
    // ana programın başladığı ve çalıştığı yer

        int sayi=5;
        Scanner oku=new Scanner(System.in);

        Araba benimArabam =new Araba(); //Araba tür , benimArabam obje
        benimArabam.renk="kırmızı";
        benimArabam.motorHacmi=1600;
        benimArabam.yili=2020;

        System.out.println("benimArabam.renk = " + benimArabam.renk);
        System.out.println("benimArabam = " + benimArabam.motorHacmi);
        System.out.println("benimArabam = " + benimArabam.yili);

    }
    //methodun yazılabildiği yer
}
// bir dosyanın içinde 1 adet public olabiliri
class Araba{ // bu bölüme class diyoruz ve bu şekilde tanımlanıyor.

    String renk;
    int yili;
    double motorHacmi;
    
    
}
