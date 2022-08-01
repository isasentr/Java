package Z_1_Test.banka;

public class bankalar {
    // Bir banka class ı tanımlayınız.
    // 3 adet field ekleyiniz.(adi, subeSayisi, kurulusYili)
    // 3 adet constructor ekleyin.
    // toString metodu oluşturun.
    // 3 tane nesne oluşturup mainde yazdırınız.
    public static void main(String[] args) {

        banka bkn1=new banka("Garanti",19,1980);
        banka bkn2=new banka("Ziraat",19,1980);

        System.out.println("bkn1 = " + bkn1);
        System.out.println("bkn2 = " + bkn2);


    }
}
