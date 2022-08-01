package Odevler._21_OdevlerHaziran15_ok;

public class Tip {
    private String ad;
    private String soyad;
    private String gorevi;

    public Tip(String ad, String soyad, String gorevi) {
        setAd (ad);
        setSoyad (soyad);
        setGorevi (gorevi);
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

    public String getGorevi() {
        return gorevi;
    }

    public void setGorevi(String gorevi) {
        this.gorevi = gorevi;
    }

    @Override
    public String toString() {
        return "Tip{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", gorevi='" + gorevi + '\'' +
                '}';
    }
}
