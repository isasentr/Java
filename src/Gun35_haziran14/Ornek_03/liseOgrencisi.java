package Gun35_haziran14.Ornek_03;

public class liseOgrencisi extends ogrenci {
    String brans;

    public liseOgrencisi(String isim, tip tipi, String brans) {
        super(isim, tipi);
        setBrans(brans);
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return "liseOgrencisi{" +
                "brans='" + brans + '\'' +
                "} " + super.toString();
    }
}
