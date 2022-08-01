package Gun12_mayis11;

import java.util.Scanner;

public class _09_JavaRandom {
    public static void main(String[] args) {
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.
        Scanner oku=new Scanner(System.in);

        System.out.print("Sayı aralığını giriniz:");
        int aralik=oku.nextInt();

        int randomSayi= (int)Math.random();
        int tamsayi=randomSayi*aralik;
        //System.out.println(tamsayi);

        System.out.print("0"+"-"+aralik+" arası tuttuğunuz sayıyı giriniz:");
        int tutSayi = oku.nextInt();

        if(tamsayi==tutSayi){
            System.out.println("Tebrikler");
        }else {
            System.out.println("Bilemediniz");
        }

        System.out.println(tamsayi==tutSayi ? "Tebrikler":"Bilemediniz");

/*

 Scanner oku=new Scanner(System.in);
        System.out.print("Kaça kadar sayı tutulsun = ");
        int kacaKadarRandomSayi=oku.nextInt();
        
        int tutulanSayi=  (int)(Math.random() * kacaKadarRandomSayi);

        System.out.print("Tahmininz = ");
        int tahmin=oku.nextInt();
        
        // 1.Yöntem
        if (tutulanSayi == tahmin)
            System.out.println("Tebrikler");
        else
            System.out.println("bilemedinki bilemedinki");
        
        //.Yöntem
        System.out.println( ((tutulanSayi == tahmin) ? "Tebrikler" : "bilemedinki bilemedinki")  );

        System.out.println("tutulanSayi = " + tutulanSayi);



*/


    }
}
