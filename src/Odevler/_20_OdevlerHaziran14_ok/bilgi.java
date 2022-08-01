package Odevler._20_OdevlerHaziran14_ok;

public class bilgi {
    public enum uyetipi {ogrenci, calisan};

    private String isim;
    private String adres;
    private String okul;
    private uyetipi utipi;


    public bilgi(String isim, String adres, String okul, uyetipi utipi) {
        setIsim(isim);
        setAdres(adres);
        setOkul(okul);
        setUtipi(utipi);
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

    public uyetipi getUtipi() {
        return utipi;
    }

    public void setUtipi(uyetipi utipi) {
        this.utipi = utipi;
    }

    @Override
    public String toString() {
        return "bilgi{" +
                ", isim='" + isim + '\'' +
                ", adres='" + adres + '\'' +
                ", okul='" + okul + '\'' +
                ", utipi=" + utipi +
                '}';
    }
}
