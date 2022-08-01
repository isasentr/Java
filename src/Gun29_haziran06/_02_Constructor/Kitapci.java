package Gun29_haziran06._02_Constructor;

public class Kitapci {
    public static void main(String[] args) {
        // Book class yazınız.fields: name,publishYear,autor.
        // 3 adet Consructor ekleyiniz.
        // Kitapların özelliklerini tek bir satırda yazdıran bir metod ekleyiniz.
        // 3 adet kitabı farklı constructor la oluşturup, mainde yazdırınız.

        //1.yöntem
        Kitap kitap =new Kitap();
        kitap.name="ince mehmet";
        kitap.publishYear=1990;
        kitap.author="yaşar kemal";

        //2.yöntem constructor
        Kitap kitap1 = new Kitap("ali", 1990, "kemal");

        System.out.println( kitap.name+", "+kitap.author+", "+kitap.publishYear);

        Kitap kitap2 = new Kitap("ali", 1990);

        Kitap kitap3 = new Kitap("ali");

        kitap.yazdir();
        kitap1.yazdir();
        kitap2.yazdir();
        kitap3.yazdir();

        System.out.println(kitap);
        //her zaman ekrana yazacağı zaman toString metodunu arar.
        String yaziHali =kitap1.toString();


    }
}
