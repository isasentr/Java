package Odevler._01_16_OdevlerMayis_ok;

public class _16_OdevlerMayis24 {

//1-
//Ismi **randomNum** olan bir method oluşturun.
//Parametre olarak **int max** almalı.
//Bu method, 0 ile max arasında random bir değer döndürmelidir.
//Random numarayı döndürünüz.
/*

public static void main(String[] args) {
    Scanner oku = new Scanner(System.in);

    System.out.print("Sayı giriniz :");
    int max= oku.nextInt();

   int sayi = randomNum(max);

}
    public static int randomNum(int sayi){

     int max=(int)(Math.random()*sayi);
        System.out.println("Random sayı :"+ max);
        return max;
}
*/

//2-
//"OrtaKelime" isminden bir method oluşturun.
//Bu method String'i parametre olarak almalı.
//Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
//Ortadaki kelimeyi return yapınız.
//Örnek: Ben Java'yı seviyorum.
//print : Java'yı
//Örnek2:
//Java'yı kolayca öğreniyorum.
//print: kolayca

/*
public static void main(String[] args) {
    Scanner oku = new Scanner(System.in);
    System.out.print("Cümle giriniz :");
    String cumle = OrtaKelime(oku.nextLine());
}
    public static String OrtaKelime(String cumle){
       String[] kelime=cumle.split(" ");

        for (int i = 1; i < kelime.length-1 ; i++) {
            System.out.print( kelime[i]+" ");
        }
        return cumle;
    }
*/

//3-
//reverseString isminde bir method oluşturun.
//Bu method bir String'i parametre olarak alsın.
//Ve bu method, girilen String'i tersten yazsın.
//Terste yazılmış halini yazdırınız.
//Örn: String = "Java'yı Seviyorum."
//Print: .muroyiveS ıy'avaJ

/*
public static void main(String[] args) {

    Scanner oku = new Scanner(System.in);
    System.out.print("Cümle giriniz :");
    String cumle = reverseString(oku.nextLine());

}

    public static String reverseString(String cumle){
    String [ ]kelime=cumle.split("");

        for (int i =kelime.length-1 ; i >= 0; i--) {
            System.out.print(kelime[i]);
        }
    return cumle;
    }
*/

//4-
// adı  reverseWord olan bir method oluşturun
//Bu methodun String olarak bir parametresi olmalıdır
//Ve bu cümledeki kelimelerle tersine çevirmeli
//Ters halini yazdırın.
//Örnek 1 :
//Dize: Java yazın
//dönüş şöyle olmalıdır:  yazın Java
//Örnek 2:
//Dize: Sakin olun ve evde kalın
//dönüş olmalı: kalın evde ve olun sakin
/*

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Cümle giriniz :");
        String cumle = reverseWord(oku.nextLine());

    }
    public static String reverseWord(String cumle){
        String [ ]kelime=cumle.split(" ");

        for (int i =kelime.length-1 ; i >= 0; i--) {
            System.out.print(kelime[i]+" ");
        }

        return cumle;
    }

*/

//5-
//getSum isminde bir method oluşturun.
//Parametresi ArrayList'tir.
//Dizideki tüm $ ları kaldır ve tüm sayıları topla
//return yaptğımız veri tipi 'int' olmalıdır.
//sonuç 0'dan küçükse, -1 yazdırın.
//Örnek1:
//ArrayList = $13, $15, $20
//Cevap = 48 olmalı
//Örnek 2 :
//ArrayList= $-13, $0, $055
//Cevap = -1 olmalı.

/*
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        ArrayList<String> liste=new ArrayList<>();

        for (int i = 0; i < 3; i++) {
         System.out.print("Veri giriniz:");
         String tutar= oku.nextLine();
         liste.add(tutar);}

        System.out.println( getSum(liste));
    }
    public static int getSum(ArrayList<String> arrayList){
        int toplam=0;
        int gelensayi;
        for (int i = 0; i < arrayList.size(); i++) {
           gelensayi=Integer.parseInt(arrayList.get(i).replaceAll("[^0-9]",""));
           toplam+=gelensayi;
        }

        if (toplam<0)
            return -1;
        else
            return toplam;
    }
*/

//6-
//EvenOddNums isminde bir method oluşturun.
//Bu yöntem String olan bir parametreyi kabul etsin.
//Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
//Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.
//toplam sonucu yazdırın.
//**İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.**
//For example Örnek:
//String =  "6678421312"
//6+6-7+8+4+2-1-3-1+2
//sonuç 16 olmalı

/*

    public static void main(String[] args) {
        Scanner oku =new Scanner(System.in);
        System.out.print("10 basamaklı sayı giriniz:");
        String sayi=oku.nextLine();

        System.out.println("Sonuc :"+EvenOddNums(sayi));
    }
        public static int EvenOddNums (String sayi) {
            int toplam=0;
            int sekSayi=0;
            String [] tane=sayi.split("");
            for (int i = 0; i < tane.length ; i++) {
                sekSayi=Integer.parseInt(tane[i]);
                if (sekSayi%2==0)
                    toplam+=sekSayi;
                else
                    toplam-=sekSayi;
            }
            return toplam;
        }

*/


//7-
//addDigits isminde bir method oluşturun.
//Parametresi int
//Return tipi de int
//Pozitif int değerler ver ve en son sonuç tek basamaklı çıkana kadar basamakları birbiriyle topla.
//Tek basamaklı çıktığında, döndürün
//**Örnek1:**
//```
//**Girdi** `38`
//**Çıktı:** 2
//**Açıklama: İşlemler şöyle olacak**: `3 + 8 = 11`, `1 + 1 = 2`.
//             2 , tek basamaklı olduğundan, bunu döndürün.
//```
/*

    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        int sayi = oku.nextInt();

        while (sayi > 9) {
            sayi = addDigits(sayi);
        }
        System.out.println("sayi = " + sayi);
    }

    public static int addDigits(int sayi) {

        String tane = Integer.toString(sayi);
        String[] kume = tane.split("");

        int sayilar[] = new int[kume.length];
        for (int i = 0; i < kume.length; i++) {
            sayilar[i] = Integer.parseInt(kume[i]);
        }
        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {
//
            toplam += sayilar[i];
        }
        return toplam;
    }
*/


//8-
//powerOfThree isminde bir method oluşturun.
//Parametre olarak int
//Return tipi boolean
//Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
//**Örnek 1:**
//```
//**Girdi:** 27
//**Çıktı:** true
//```
//```
//Açıklama: 3*3*3 =27
//```
//```
//Sonuç= true
//```
//**Örnek 2:**
//```
//**Girdi:** 0
//**Çıktı:** false
//```
//**Örnek 3:**
//```
//**Girdi:** 9
//**Çıktı:** true
//```
/*
public static void main(String[] args) {
    Scanner oku = new Scanner(System.in);
    System.out.print("Sayı giriniz:");
    int sayi = oku.nextInt();

    System.out.println(powerOfThree(sayi));
}
    public static boolean powerOfThree( int sayi){

        for (int i = 0; i < sayi; i++) {
            if((i*i*i)==sayi)
             return true;
        }
        return false ;
    }*/

    //9-
//Write a method called `append`
//`append adında bir method oluşturun.`
//`Parametre olarak iki int array  oluşturun.`
// ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
// Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
//Bunu döndürmelidir:
// {2, 4, 6, 1, 2, 3, 4, 5}.
//#
 /*
    public static void main(String[] args) {
        int[] bir = {2, 4, 6};
        int[] iki = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString( append(bir, iki)));
    }

    public static int [] append(int[] bir, int[] iki) {
        int [] uc=new int[bir.length+ iki.length];
        for (int i = 0; i < uc.length; i++) {
            if (i< bir.length)
                uc[i]=bir[i];
            else
                uc[i]=iki[i- bir.length];
        }
        return uc;
    }
*/

//10-
//**isUnique** adında bir method oluşturun.
//Parametre olarak int array alır.
// ve bu dizideki değerlerin benzersiz olup olmadığını gösteren bir boolean değeri döndürür (benzerlik yoksa true, var ise false).
//örneğin, list isminde bir array'imiz varsa,
//```
//int[] list = {3, 8, 12, 2, 9, 17, 43, -8, 46, 203, 14, 97, 10, 4};
//```
//Bu listede yinelenen eleman olmadığı için sonuç true dönmelidir.
//```
//int[] list = {4, 7, 2, 3, 9, 12, -47, -19, 308, 3, 74};
//```
//Bu listede eleman 3, iki tane olduğu için sonuç false dönmelidir.
/*

    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6};

        System.out.println(isUnique(list));
    }
    public static boolean isUnique(int[] list1) {
        for (int i = 0; i < list1.length; i++) {
            for (int j = i + 1; j < list1.length; j++) {
                if (list1[i] == list1[j])
                    return false;
            }
        }
        return true;
    }
 */
}
