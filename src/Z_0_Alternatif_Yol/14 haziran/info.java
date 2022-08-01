package _35oop2;

public class info {
    String isim;
    String adres;
    String okul;


    public info(String isim, String adres, String okul) {
        setIsim(isim);
        setAdres(adres);
        setOkul(okul);

    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getOkul() {
        return okul;
    }

    public void setOkul(String okul) {
        this.okul = okul;
    }




    public enum uyetip{
        OGRENCI,CALISAN
    }

    @Override
    public String toString() {
        return "common{" +
                "isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                ", okul='" + okul + '\'' +
                '}';
    }
}
