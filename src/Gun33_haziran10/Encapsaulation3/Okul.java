package Gun33_haziran10.Encapsaulation3;

import java.util.ArrayList;

public class Okul {
    private String okulAd;
    private int kontenjan;
     ArrayList<Ogrenci> ogrenciler = new ArrayList<>();

    public Okul(String okulAd, int kontenjan) {
        setOkulAd(okulAd);
        setKontenjan(kontenjan);
    }

    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        this.kontenjan = kontenjan;
    }

}
