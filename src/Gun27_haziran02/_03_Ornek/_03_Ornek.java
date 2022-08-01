package Gun27_haziran02._03_Ornek;

public class _03_Ornek {
    public static void main(String[] args) {
//        TODO 1.Adım  :ayrı dosyada olmak üzere Musteri isimli (fields: name) isimli bir class tanımlayınız.
//        TODO 2.Adım  :ayrı bir dosyada ElektrikHesabi isimli (fields : toplamTuketim, oran(double), OdenecekTutar)
//        TODO 3.Adım  :Musteri a bir ElektrikHesabi ekleyiniz.

//        TODO 4.Adım  :1 tane müşteri oluşturunuz, Hesabı u dahil;
//        TODO 5.Adım  :Musteriye ait her ay tüketilen enerjiyi toplayacak bir metod yazınız.
//        TODO          tuketimEkle olasun her verilen aylık rakamı toplayarak biriktirsin.
//        TODO 6.Adım  :Ödenecek rakamı  toplam tüketimi  oran(0.7) ile çarparak hesaplatınız yazdırınız.
//
//        TODO ipucu : hesabı olşuturduktan sonra tuketimEkle metoduna 2,3 ay tüketim ekletiniz, faturayı
//        TODO         ondan sonra toplam alarak çıkartınız


        Musteri mus1 = new Musteri();
        mus1.name = "ismet";
        mus1.elektrikHesabi = new ElektrikHesabi();

        mus1.elektrikHesabi.tuketimEkle(100);
        mus1.elektrikHesabi.tuketimEkle(200);
        mus1.elektrikHesabi.tuketimEkle(150);


        System.out.println("Müşteri Adı=" + mus1.name );
        mus1.elektrikHesabi.toplamTuketimYaz();

        mus1.elektrikHesabi.odenecekTutarYaz();


    }
}
