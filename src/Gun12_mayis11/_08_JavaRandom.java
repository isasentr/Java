package Gun12_mayis11;

public class _08_JavaRandom {
    public static void main(String[] args) {
        //Soru :0 ile 6 arasında sayı üreten programı yazınız.

        // Math.random () -> 0.0000- 0.99999 arası sayı üretir.

        double doubleRandomSayi = Math.random(); // 0.0000- 0.99999 arası sayı üretir.
        System.out.println("doubleRandomSayi = " + doubleRandomSayi);

        int tamSayi = (int)(Math.random() * (20-10)+6); // 0-5 arası veriyor.
        System.out.println("tamSayi = " + tamSayi);

        //direk yöntem
        System.out.println("tamSayi = " +(int)(doubleRandomSayi * 6) );


    }
}
