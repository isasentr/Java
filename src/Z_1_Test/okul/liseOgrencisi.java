package Z_1_Test.okul;

public class liseOgrencisi extends ogrenci {
    public enum brans {MF, TM}

    ;
    private brans brans;

    public liseOgrencisi(String isim, tip tipi, liseOgrencisi.brans brans) {
        super(isim, tipi);
        setBrans (brans);
    }

    public liseOgrencisi.brans getBrans() {
        return brans;
    }

    public void setBrans(liseOgrencisi.brans brans) {
        this.brans = brans;
    }

    @Override
    public String toString() {
        return "liseOgrencisi{" +
                "brans=" + brans +
                "} " + super.toString();
    }
}
