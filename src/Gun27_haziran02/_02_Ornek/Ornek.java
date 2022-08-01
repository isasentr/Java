package Gun27_haziran02._02_Ornek;

public class Ornek {
    public static void main(String[] args) {
        // 1-Adım :Rectangle isminde ayrı bir dosyada olmak üzere sınıf yazınız.fields: width, length
        // 2-Adım :Çevre bulmak üzere Cevre isminde bir metod yazınız.
        // 3-Adım :Dikdörtgenin alanını bulan Alan isimli bir metod yazınız.
        // 4-Adım :1 tane nesne ye deger vererek metodların sonuçları yazdırınız.
        Rectangle olcu = new Rectangle();
        olcu.width=5;
        olcu.length=10;

        //1.yöntem method
        cevreYazdir(olcu);
        alanYazdir(olcu);

        System.out.println("----------------");

        //2.yöntem class
        olcu.cevre();
        olcu.alan();


        //3.yöntem return

        int exalan=olcu.Alan2();
        System.out.println("alan = " + exalan);

    }
    //1.yöntem method
    public static void  cevreYazdir (Rectangle olcu ){
        System.out.println("cevre :" +(olcu.width*2+2*olcu.length ));
    }

    public static void  alanYazdir(Rectangle olcu ){
        System.out.println("alan :" +(olcu.width*olcu.length ));
    }
}
