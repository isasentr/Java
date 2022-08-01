package Gun33_haziran10.Encapsaulation3;

public class Ogrenci {

    private String ad;
    private String soyad;
    private int yas;

    private int okulNo;

    private static int idSayac=0;


    public Ogrenci(String ad, String soyad, int yas) {
        setAd(ad);
        setSoyad(soyad);
        setYas(yas);
        okulNo= ++idSayac;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                ", okulNo=" + okulNo +'}'+
                "\n";
    }
}
