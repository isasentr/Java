package Odevler._18_OdevlerHaziran06_ok;

public class _13 {
    //Parametresi bir tane int (num1) ve return tipi int olan palindromeNum isminde method
    //verilmiştir.
    //Palindrome, bir kelime veya sayının, tıpkı ileri ile aynı şekilde geriye doğru okuduğu anlamına
    //gelir. Örneğin; "mom" , "refer" , "131" , "1221".
    //num1'i ve num1'in tersini ekleyin, sonucu bulun.
    //Sonucun palindrom olup olmadığını kontrol edin.
    //Sonuç bir palindrom numarası değilse, sonucun tersini bulun.
    //Ve sonucu ve sonucun tersine ekleyin, yeni toplamı bulun.
    //Yeni toplamın bir palindrom olup olmadığını kontrol edin.
    //Sonuçlarınızda bir palindrom numarasına ulaşana kadar aynı adımları uygulayın.
    //Palindrom numarasına ulaştıktan sonra, bir palindrome numarasına ulaşmak için aynı işlemi kaç
    //kez yaptığınızı bulun.
    //Return count olmali
    //Örnek:
    //num1 = 349 --> 349 + 943 =1292 Not : 1292 palindrom olmadığından bunun için aynı
    //adımı uygulayın (birinci işlem)
    //1292 + 2921 = 4213 Not : 4213 palindrom değil bunun için aynı adımı yapın
    //(ikinci işlem)
    //4213 + 3124 = 7337 Not : 7337 palindrome (üçüncü işlemde palindroma
    //ulaştınız ve count 3 olur)
    //return 3 olmalı
    //İPUCU: Bu soru için while loop kullanırsanız iyi olur
    public static void main(String[] args) {
        // "mom" , "refer" , "131" , "1221"
        int num1 = 349;

        System.out.println("tersiniekle="+ tersiniekle(num1));

    }
    public static int tersi(int num1) {
        int kalan = 0;
        int tersi = 0;

        while (num1!=0) {
            kalan=num1%10;
            tersi=tersi*10+kalan;
            num1=num1/10;
        }
        return tersi;
    }
    public static boolean tersikontrol(int num1) {
       int tersi = tersi(num1);
       return tersi==num1;
    }
    public static int tersiniekle(int num1) {
        int sayac=0;
        if (tersikontrol(num1)){
            return sayac;
        }else {
            while (!tersikontrol(num1)){
                int tersi = tersi(num1);
                num1+=tersi;
                sayac++;
            }
        }
        return sayac;
    }

}

