package Z_1_Test.a5;

import java.util.Scanner;

public class a5 {
//        TODO 1.Adım  :ayrı dosyada olmak üzere Musteri isimli
//         (fields: name) isimli bir class tanımlayınız.
//        TODO 2.Adım  :ayrı bir dosyada ElektrikHesabi isimli (fields : toplamTuketim, oran(double),
//         OdenecekTutar)
//        TODO 3.Adım  :Musteri a bir ElektrikHesabi ekleyiniz.
//        TODO 4.Adım  :1 tane müşteri oluşturunuz, Hesabı u dahil;
//        TODO 5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
//        TODO          tuketimEkle olasun her verilen aylık rakamı toplayarak biriktirsin.
//        TODO 6.Adım  :Ödenecek rakamı  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız yazdırınız.

//        TODO ipucu : hesabı olşuturduktan sonra tuketimEkle metoduna 2,3 ay tüketim ekletiniz, faturayı
//        TODO         ondan sonra toplam alarak çıkartınız
    public static void main(String[] args) {

        musteri hesap = new musteri();
        hesap.name="isa";
        hesap.elektrikHesabi=new ElektrikHesabi();

        hesap.elektrikHesabi.tuketimEkle(100);
        hesap.elektrikHesabi.tuketimEkle(250);
        hesap.elektrikHesabi.tuketimEkle(500);


        System.out.println("hesap.name = " + hesap.name);
        hesap.elektrikHesabi.toplamTuketimYaz();
        hesap.elektrikHesabi.odenecekTutarYaz();


    }
}
