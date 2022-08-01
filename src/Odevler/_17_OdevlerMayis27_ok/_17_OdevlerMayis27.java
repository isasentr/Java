package Odevler._17_OdevlerMayis27_ok;

public class _17_OdevlerMayis27 {


//UYARI:  Arkadaşlar soruların kolay anlaşılması için her soruda 1 veya 2 tane örnek girdi ve çıktı verilmiştir.

//ne yapılacağı bunlardan kolaylıkla anlaşılmaktadır. bilginize.


//1-ismi getCount() olan bir method oluşturun.
//
//Parametre olarak bir String ArayList  ve  bir tane String
//
//Return tipi int olmalı.
//
//ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
//
//Örneğin;
//
//ArrayList = Orange , Kiwi , Peach , Banana , Orange
//
//String Orange:
//
//Count = 2 olmalı. (Orange 2 kez yazılmış)
/*

    public static void main(String[] args) {
        ArrayList<String> kelimeArray = new ArrayList<>();
        String[] kelime = {"Orange", "Kiwi", "Peach", "Banana", "Orange", "Kiwi"};

        System.out.println("Benzer sayısı :" + getCount(kelimeArray, kelime));
    }
    public static int getCount(ArrayList<String> kelimeArray, String[] kelime) {
        ArrayList<String> kelimeArray1 = new ArrayList<>();
        for (int i = 0; i < kelime.length; i++) {
            kelimeArray1.add(kelime[i]);
        }
        int benzer = 0;

        for (int i = 0; i < kelimeArray1.size(); i++) {
            for (int j = i + 1; j < kelimeArray1.size(); j++) {
                if (kelimeArray1.get(i).equals(kelimeArray1.get(j))) {

                    System.out.println(kelimeArray1.get(i));
                    benzer++;
                    //System.out.println(kelimeArray1.get(i)+ " "+(kelimeArray1.size()));
                }
            }
        }
        return benzer;
    }
*/

//2-getSum() isminde bir method oluşturun.
//
//Parametresi ArrayList olmalı
//
//Return tipi int olmalı.
//
//ArrayList teki tüm sayıları birbiri ile toplayın.
//
//return olarak toplam sonucu döndürün.
//
//Örneğin;
//
//Arraylist = 1,2,3,4,5
//
//return 15 olmalı

/*
    public static void main(String[] args) {
        ArrayList<Integer> sayilar = new ArrayList<>();
        int[] kume = {1,2,3,4,5};

        System.out.println("Toplam =" + getSum(sayilar,kume));

    }
    public static int getSum(ArrayList<Integer> array,int[] sayi) {
        System.out.println(Arrays.toString(sayi));

        int toplam = 0;
        for (int i = 0; i < sayi.length; i++) {
            array.add(sayi[i]);
            toplam+= array.get(i);
        }
        return toplam;
    }
*/


//3-getLength() isminde bir method oluşturun.
//
//Parametre olarak String ArrayList
//
//Return tipi Integer ArrayList
//
//ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
//
//Tüm elementlerin uzunluğunu döndürün
//
//Örneğin;
//
//ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
//
//Tüm Stringlerin uzunluklarını yazdırın;
//
//cevap: 10 ,  8 , 4 , 7 , 6 olmalı
/*

    public static void main(String[] args) {
        ArrayList<String> kelimeler = new ArrayList<>();
        String[] kelime = {"New jersey", "New york", "Ohio", "Florida", "Boston"};

        System.out.println(getLength(kelimeler, kelime));
    }
    public static ArrayList<Integer> getLength(ArrayList<String> kelimeler, String[] kelime) {

        for (int i = 0; i < kelime.length; i++) {
            kelimeler.add(kelime[i]);
        }
        System.out.println(kelimeler);

        ArrayList<Integer>sayi=new ArrayList<>();
        for (int i = 0; i < kelimeler.size() ; i++) {
           sayi.add( kelimeler.get(i).length());
        }
        return sayi;
    }
*/

//4-İsmi changelnArraylist() olan bir method oluşturun.
//
//Parametre olarak String ArrayList, String s1, String s2
//
//Arraylist'te s1'i s2 olarak değiştirin
//
//Return String arrayList

//Örneğin;
//
//Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
//
//s1 = blue
//
//s2 = yellow
//
//Tüm blue 'ları yellow'a dönüştürün.
//
//cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
/*

    public static void main(String[] args) {
        ArrayList<String> renkler = new ArrayList<>();
        String [] renklerString={"yellow" , "red" , "blue" , "red" , "blue"};

        System.out.println(Arrays.toString(renklerString));
        System.out.println(changelnArraylist(renkler,renklerString));

    }
    public static ArrayList<String> changelnArraylist(ArrayList<String> renkler,String [] renklerString) {
        for (int i = 0; i <renklerString.length ; i++) {
            renkler.add(renklerString[i]);
        }

        String s1="blue";
        String s2=" yellow";
        for (int i = 0; i < renkler.size(); i++) {
            if (renkler.get(i).equals(s1))
                renkler.set(i,s2);
        }
        return renkler;
    }

*/

//5-rotateList() isminde bir method oluşturun.
//
//Parametre olarak String ArrayList
//
//ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
//
//Tersten yazılmış halini return edin.
//
//Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
//
//cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
/*

    public static void main(String[] args) {
        ArrayList<String> kelimeler = new ArrayList<>();
        String[] kelime = {"New jersey", "New york", "Atlanta", "Florida", "Ohio"};

        System.out.println(rotateList(kelimeler,kelime));
    }
    public static ArrayList<String> rotateList(ArrayList<String> kelimeler,String[] kelime) {
        for (int i = 0; i < kelime.length; i++) {
            kelimeler.add(kelime[(kelime.length-i-1)]);
        }
            return kelimeler;
    }
*/


    //6-hillNum() isminde bir method oluşturun.
//
//Parametre olarak Integer ArrayList
//
//Return tipi int,
//
//Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
//
//Örneğin;
//
//ArrayList  5,4,6,2,1
//
//2, 6'dan küçük ve 1 den büyüktür.
//
//Return 2 olmalı.
/*
 public static void main(String[] args) {

        ArrayList<Integer> liste = new ArrayList<>(asList(5, 4, 6, 2, 1));

        System.out.println(hillNum(liste));
    }

    static int hillNum(ArrayList<Integer> liste) {
        int sayi=0;
        for (int i = 1; i < liste.size()-1; i++) {

            if ((liste.get(i) > liste.get(i + 1)) && (liste.get(i - 1) > liste.get(i)))
                sayi = liste.get(i);
        }
        return sayi;
    }

*/

//7-common_values() isminde bir method oluşturun.
//
//Parametre olarak 2 tane Integer ArrayList
//
//Return tipi integer ArrayList olmalı
//
// İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
//
//**Örneğin;**
//
//ArrayList 1:    3 , 2 , 5 , 6
//
//ArrayList 2:     5 , 8 , 9
//
//return  5 olmalı
//
//**Örneğin;**
//
//ArrayList 1: 8,7,9,6,7
//
//ArrayList 2: 6,7,12,3,1
//
//return 6 ve 7 olmalı
/*

public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<>(asList(8,7,9,6,7));

        ArrayList<Integer> array2 = new ArrayList<>(asList(6,7,12,3,1));

        System.out.println(common_values(array1, array2));

    }

    static ArrayList<Integer> common_values(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        ArrayList<Integer> array3 = new ArrayList<>();
        for (int i = 0; i < array1.size(); i++) {
            for (int j = 0; j < array2.size(); j++) {
                if (array1.get(i) == array2.get(j))
                    array3.add(i);
            }
        }
        return array3;
    }


 */

//8-secondMax()  isminde bir method oluşturun.
//
//Parametre olarak integer ArrayList.
//
//Return tipi int olmalı.
//
//ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
//
//**ÖRN;**
//
//ArrayList   --  5,3,4,6,7
//
//CEVAP : 6
/*
public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(asList(5, 3, 4, 6, 7));

        System.out.println(secondMax(list));
    }

    static int secondMax(ArrayList<Integer> list) {
        Collections.sort(list);
        int secondMax=list.get(list.size()-2);
        return secondMax;
    }
 */

//9-rangeBtw() isminde bir method oluşturun.
//
//Parametre olarak   **bir Arraylist**  ve **iki ayrı int**
//
//return tipi int
//
// Arraylist'in **iki int arasında kaç değeri olduğunu** sayın.
//
//return  **count**       (sayacı (count) döndürün.)
//
//**Example (Örnek):**
//
//ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
//
//min = 20
//
//max = 30
//
//return =  5    (20,22,25,28,30)
//
//min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)

    /*
     public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(asList(1, 5, 22, 10, 20, 14, 8, 25, 30, 28));

        System.out.println(rangeBtw(list));

    }

    static int rangeBtw(ArrayList<Integer> list) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Min sayıyı giriniz =");
        int min = oku.nextInt();
        System.out.print("Max sayıyı giriniz =");
        int max = oku.nextInt();

        int say = 0;
        for (int c : list) {
            if (c >= min && c <= max){
                say++;}
        }
        return say;
    }

     */


//10-Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
//
//Store all the elements in one arraylist and print the arraylist
//
//Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
//
//**Örnek:**
//
//```
//**Girdi:**
//[
// [ 1, 2, 3 ],
// [ 4, 5, 6 ],
// [ 7, 8, 9 ]
//]
//**Çıktı:** [1,2,3,4,5,6,7,8,9]
//```

    /*
     public static void main(String[] args) {
        int[][] list = {{ 1, 2, 3 },{ 4, 5, 6 },{ 7, 8, 9 }};

        ArrayList<Integer>  listeyuk = new ArrayList<>();

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                listeyuk.add(list[i][j]);
            }
        }
        System.out.println(listeyuk);
    }

    */

//11-Create a method totalCount()
//
//totalCount() isminde bir method oluşturun.
//
//Parametresi  'Integer Hashset' olmalı
//
//HashSetteki eleman sayısını alın.
//
//totalCount'u döndürün.
//
//_**Örnek:**_
//
//hashset ; 4,2,3,1,7
//
//cevap: 5
/*
 public static void main(String[] args) {
        HashSet<Integer> has1 = new HashSet<>();
        has1.add(4);
        has1.add(2);
        has1.add(3);
        has1.add(1);
        has1.add(7);

        System.out.println(totalCount(has1));
    }
    static Integer totalCount(HashSet<Integer> has1) {

        int sayi = has1.size();
        return sayi;
    }
 */

//12-changeSet() isminde bir method oluşturun.
//
//Parametre olarak bir String HashSet   ve  iki String
//
//return hashset olmalı
//
//Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
//
//**ÖRNEK:**
//
//hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
//
//String 1 = **banana**
//
//String 2 = **peach**
//
//**CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"
/*

 public static void main(String[] args) {

        HashSet<String> hashset = new HashSet<>();

        hashset.add("banana");
        hashset.add("strawberry");
        hashset.add("kiwi");
        hashset.add("pineapple");

        String s1 = "banana";
        String s2 = "peach";

        System.out.println(changeSet(hashset, s1, s2));
    }


    public static HashSet changeSet(HashSet<String> hashset, String s1, String s2) {

        ArrayList<String> degisim = new ArrayList<>(hashset);
        if (degisim.contains(s1)){
                int a=degisim.indexOf(s1);
                degisim.set(a,s2);
        }
        HashSet<String> degisim2 =new HashSet<>(degisim);

            return degisim2;
        }
    }
 */





//13-commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
//
//return tipi arraylist olmalı.
//
//**ÖRNEĞİN:**
//
//    İlk Hashset : **"Germany"** , "England" , "South Africa" , **"Brazil" , "USA"**
//
//     İkinci  hashset  : **"Germany"** , "China" , **"Brazil"** , "France" ,  **"USA"**
//
//Ortak değerleri ArrayListe ekleyiniz.
//
//çıktı:  "Germany" , "Brazil" ,"USA"
//
//ArrayListi yazdırınız.
/*
 public static void main(String[] args) {
        HashSet<String> liste = new HashSet<>();
        liste.add("banana");
        liste.add("strawberry");
        liste.add("kiwi");
        liste.add("pineapple");

        System.out.println(changeSet(liste));
    }

    static HashSet<String> changeSet(HashSet<String> liste) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Metin girinizi =");
        String s1= oku.nextLine();
        System.out.print("Metin girinizi =");
        String s2= oku.nextLine();

        if (liste.contains(s1)){
            liste.remove(s1);
            liste.add(s2);
        }
        return liste;
    }


 */

//14-removing() isminde bir method oluşturun.
//
//Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
//
//Eğer Stringler LinkedHashset 'in içinde varsa, sil.
//
//Return tipi linkedhashset
//
//Örneğin,
//
//linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
//
//String 1= Germany
//
//String 2 = USA
//
// **Germany ve USA 'i sil.**
//
//**Set'i döndür.**
/*
    public static void main(String[] args) {

        LinkedHashSet<String> sirali = new LinkedHashSet<>();
        sirali.add("Germany");
        sirali.add("France");
        sirali.add("USA");
        sirali.add("Canada");
        sirali.add("Mexico");
        sirali.add("Brazil");

        String s1 = "Germany";
        String s2 = "USA";

        System.out.println(degistir(sirali, s1, s2));
    }

    static LinkedHashSet degistir(LinkedHashSet<String> sirali, String s1, String s2) {

        if (sirali.contains(s1) || sirali.contains(s1)) {
            sirali.remove(s1);
            sirali.remove(s2);
        }
        return sirali;
    }
}

 */

}
