package Odevler._01_16_OdevlerMayis_ok;

import java.util.Scanner;

public class _13_OdevlerMayis18 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

//        1-String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
//        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
//        Eğer aitse "true" çevirin.

/*      String [] dizi={"Apple" , "Orange" , "Banana" , "Pineapple"};

        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i].equals("Apple")){
                System.out.println("Dizi kelimeyi içeriyor mu = " + (dizi[i].equals("Apple")));
            }
        }


//        2-int Array oluşturun ve elemanları : 12,2,5,15,8
//        En büyük değeri yazdırınız.
/*

        int [] dizi ={12,2,5,15,8};

        int enb=dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            enb =Math.max(enb,dizi[i]);
        }
        System.out.println("enb = " + enb);
*/


//        3- int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
//        En küçük (minimum) sayıyı yazdırınız.

/*

        int [] dizi ={14 , 19 , 5 , 21};

        int enk =dizi[0];
        for (int i = 0; i < dizi.length; i++) {
            enk=Math.min(enk,dizi[i]);
        }
        System.out.println("enk = " + enk);
*/

//        4- int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
//        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
/*

        int [] dizi ={15 , 25, 22, 18, 30};

        Arrays.sort(dizi);
        int enb=dizi[0];
        int enbindex =0;

        for (int i = 0; i < dizi.length; i++) {
            enb=Math.max(enb,dizi[i]);
            enbindex=i;
        }
        //System.out.println("En büyük sayı = " + enb);
        System.out.println("2. enbüyük sayı="+(dizi[enbindex-1]));

*/

//        5- int Array oluşturun ve elemanları : 5,6,8,12,14,19
//        Eğer sayı çiftse topla, tekse çıkar.
//        **Örneğin:**
//        **-5 + 6 + 8 + 12 + 14 - 19 = 16**
//        Toplamlarını yazdırın.
/*
        int [] dizi ={5,6,8,12,14,19};

        int cifttop=0;
        int tektop=0;
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i]%2==0)
               cifttop+= dizi[i];
            else
                tektop+=dizi[i];
        }
        System.out.println("Toplam="+(cifttop-tektop));

    */
//        7- Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array) ilk ve son elementlerini kapsayan yeni array'e return edin.
//        Oluşturacağınız int array'i =   ([1, 2, 3, 4])
//        Sonuç bu şekilde olmalıdır. [1, 4]
/*
        int [] dizi =new int[4];
        int [] dizi1 =new int[2];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i]=(int) (Math.random()*25);
        }
        dizi1[0]=dizi[0];
        dizi1[1]=dizi[(dizi.length-1)];

        System.out.println("ilk Array = " +Arrays.toString(dizi) );
        System.out.println("Yeni array = " + Arrays.toString(dizi1));
*/

//        8- int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
//        Array'in ortalamasını alınız.
/*

        int[] dizi = {12, 14, 21, 23, 10, 4};

        int toplam = 0;
        int sayac=0;
        int ort=0;
        
        for (int i = 0; i < dizi.length; i++) {
            toplam += dizi[i];
            sayac++;
            ort =toplam/sayac;
        }
        System.out.println("toplam = " + (toplam/ dizi.length)); // alternatif
        System.out.println("ort = " + ort); 
*/

//        9- String Array (Dizi) oluşturunuz.
//        elemanları : Apple, Orange , Babana, Kiwi
//        Array'leri tüm elemanları yazdırınız.
/*
        String []dizi ={"Apple", "Orange" , "Babana", "Kiwi"};

        for (int i = 0; i < dizi.length; i++) {
            System.out.println("Fruit name = " + dizi[i]);
        }
        System.out.println();

        System.out.println("Fruit name = " + Arrays.toString(dizi));

        */
//        10-String array  oluşturun ve elemanları: "new jersey" , "new york", "boston","California"
//        Array'daki eleman sayısını yazdırınız.
//        Cevap 4 olmalı.

       /* 
        String [] city = {"new jersey" , "new york", "boston","California"};

        System.out.println("Şehir sayısı  = " + city.length);
        */
        

//        11- İnt Array oluştur ve elemanları   : 25,30,30,35,100
//        Array in elemanlarının toplamını yazdır.
//        Cevap 220 olmalı.
/*

        int [] sayi ={25,30,30,35,100};

        int toplam =0;
        for (int i = 0; i < sayi.length; i++) {
            toplam+=sayi[i];
        }
        System.out.println("Sayıların toplamı = " + toplam);

*/

//        12- Kullanıcıdan alacağınız 5 ayrı kelimeyi bir diziye atayınız,
//        Kelimelerden en uzun olanının ilk ve son harfininin yerlerini değiştiriniz.
/*
        String [] kelime=new String[2];
        String [] uzkelime=new String[1];

        for (int i = 0; i < kelime.length; i++) {
            System.out.print(i+1+".Kelime giriniz:");
            kelime[i]=oku.nextLine();
        }
        int enuzkelime=kelime[0].length();
        int index=0;
        for (int i = 0; i < kelime.length; i++){// uzun kelime belirlendi
           if(kelime[i].length()>enuzkelime) {
               enuzkelime = kelime[i].length();
               uzkelime[index] = kelime[i];
           }
        }

        Character ilk =uzkelime[index].charAt(0);
        Character son=uzkelime[index].charAt(uzkelime[index].length()-1);
        String aralik=uzkelime[0].substring(1,uzkelime[index].length()-1);

        System.out.println("Normal:"+uzkelime[index]);
        System.out.println("Düzenlenmiş:"+son+aralik+ilk);

//        System.out.println(Arrays.toString(kelime));
//        System.out.println(Arrays.toString(uzkelime));
        */
        }
    }

