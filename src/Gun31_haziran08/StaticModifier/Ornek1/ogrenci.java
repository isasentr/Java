package Gun31_haziran08.StaticModifier.Ornek1;

public class ogrenci {
    String ad;
    String soyad;
    static String okulAd="Yıldırım Ortaokulu";
    //hepsi için geçerli tek bir eleman
    //tekrarlanan ve tüm nesneler için kullaılacak
    //değişkenler için static kullanıyoruz.
    //static=sen bir tanesin
    //static varsa hafızadan tasarruf sağlar. hepsine atanır, tek olarak hafızada bulunur

    public ogrenci(String ad,String soyad){
        this.ad=ad;
        this.soyad=soyad;


    }

    @Override
    public String toString() {
        return "ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", okulAd='" + okulAd + '\'' +
                '}';
    }
}

