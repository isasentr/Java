package Gun29_haziran06._03_Constructor;

public class Bankalar {
    // Bir banka class ı tanımlayınız.
    // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
    // 3 adet constructor ekleyin.
    // toString metodu oluşturun.
    // 3 tane nesne oluşturup mainde yazdırınız.
    public static void main(String[] args) {

        Banka bnk1=new Banka("Garanti",25,1990);
        Banka bnk2=new Banka("Ziraat",35,1987);
        Banka bnk3=new Banka("Vakıfbank",1960);


        System.out.println("bnk1 = " + bnk1);
        System.out.println("bnk2 = " + bnk2);
        System.out.println("bnk3 = " + bnk3);

    }
}
