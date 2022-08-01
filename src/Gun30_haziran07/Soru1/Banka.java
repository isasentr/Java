package Gun30_haziran07.Soru1;

public class Banka {
    //Hesap (yatan, cekilen, bakiye(direk erişim olmamalı))
    //Musteri (hesapID, ad, soyad, MusteriHesap(hesap tipinde))

    //Bir banka uygulaması için 1 müşteri tanımlayınız,
    //Müşteri hesabına sırası ile 100 tl, 200 tl yatırınız,
    //sonra 50 tl cekiniz. Müşterinin kalan bakiyesini yazdırınız.
    //Bakiyeye direk para atanamadığının kontrol ediniz.
    public static void main(String[] args) {
        musteri mus1 =new musteri();
        mus1.hesapID=1;
        mus1.ad="kemal";
        mus1.soyad="sen";

        mus1.MusteriHesap= new hesap();

        mus1.MusteriHesap.paraYtir(100);
        mus1.MusteriHesap.paraYtir(200);
        mus1.MusteriHesap.paracek(350);


        System.out.println("Ekstre = " + mus1.MusteriHesap);

        // mus1.musteriHesap.bakiye ulasılamıyor, test i geçti


    }
}
