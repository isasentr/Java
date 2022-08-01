package Odevler._01_16_OdevlerMayis_ok;
import java.util.Scanner;
public class _09_OdevlerMayis11 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

//        1- kullanıcıdan ondalıklı bir sayının ,   tam ve ondalıklı kısmını ayrı  ayrı alınız.
//        bır sayıları  nokta ıle bırlestırerek tek bır ondalıklı sayı haline gitirip, sonra yazdırınız.
/*
        System.out.print("Tam sayı giriniz :");
        int sayiTam =oku.nextInt();
        System.out.print("Ondalık kısmı giriniz :");
        int sayiOndalik =oku.nextInt();

        String yazi = sayiTam+"."+sayiOndalik;
        System.out.println("Ondalıklı yazılmış sayı :"+yazi);
*/
//        2- Girilen bir sayı
//        Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın.
//        Eğer int 4'e bölününce kalan 0 ise ve 5'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdırın.
/*
        System.out.print("Tam sayı giriniz :");
        int sayi = oku.nextInt();
        if (sayi % 9 == 0 && sayi % 5 == 0) {
            System.out.println("Able to divide by 9 and 5");
        } else {
            if (sayi % 4 == 0 && sayi % 5 == 0)
                System.out.println("Able to divide by 4 and 15");
        }
 */
//        3- Girilen 3 sayıdan en küçük olanını bulunuz.

/*
        System.out.print("1.sayıyı giriniz :");
        int sayi1 = oku.nextInt();

        System.out.print("2.sayıyı giriniz :");
        int sayi2 = oku.nextInt();

        System.out.print("3.sayıyı giriniz :");
        int sayi3 = oku.nextInt();

        int enk =Math.min(sayi1,sayi2);
        enk=Math.min(enk,sayi3);
        System.out.println("En küçük sayı:"+enk);
*/

//        4-Girilen bir string
//        Eğer String € karakterini kapsıyorsa "This is euro" yazdırın.
//        Eğer String $ karakterini kapsıyorsa "This is dollar" yazdırın.
//        Aksi halde (else) "no money" yazdırın.
  /*
        System.out.print("Bir cümle giriniz :");
        String cumle=oku.nextLine();

        if(cumle.contains("€")){
            System.out.print("This is euro");
        }else{
            if (cumle.contains("$")){
             System.out.print("This is dollar");
            }else{
                System.out.print("no money");
            }
        }
*/
//        5-Girilen Bir öğrencinin notunu belirleyen bir Java programı yazın.
//        Program üç tür puan (sınav, ara sınav ve final puanı) okuyacak ve notu aşağıdaki kurallara göre belirleyecektir:
//        Eğer ortalama not >=90 =>not=A
//        Eğer ortalama not >= 70 ve<90 => not=B
//        Eğer ortalama not >=50 ve <70 =>not=C
//        Eğer ortalama not <50 =>note=F

//        Aşağıdaki örnek çıktıya bakın:
//        int Quiz_score: 80
//        int mid_term_score: 68
//        int Final_score: 90
//        print (Your grade is B)
//        (Notunuz B'dir)
/*
        System.out.println("Öğrencinin notlarının giriniz.");
        System.out.print("İlk sınav notu:");
        int sinav1=oku.nextInt();

        System.out.print("Ara sınav notu:");
        int sinav2=oku.nextInt();

        System.out.print("Final notu:");
        int ffinal=oku.nextInt();

        int ort =(int)(0.3 * sinav1)+(int)(0.3 *sinav2)+(int)(ffinal*0.4);

        System.out.println("Notunuz:"+((ort>=90)? "A'dır.":(ort>=70)? "B'dir.":(ort>=50)? "C'dir.":"F'dir.Kaldınız."));
        */

     //  6-
        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        System.out.print("Sayı aralığını giriniz:");
        int aralik=oku.nextInt();

        int randomSayi= (int)Math.random();
        int tamsayi=randomSayi*aralik;
        System.out.println(tamsayi);

        System.out.print("0"+"-"+aralik+" arası tuttuğunuz sayıyı giriniz:");
        int tutSayi = oku.nextInt();

        if(tamsayi==tutSayi){
            System.out.println("Tebrikler");
        }else {
            System.out.println("Bilemediniz");
        }

    }
}

