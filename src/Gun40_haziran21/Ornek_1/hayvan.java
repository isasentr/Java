package Gun40_haziran21.Ornek_1;

public abstract class hayvan {

    private final  int id;
    private String isim;
    private boolean vahsi;
    private String dogumtarihi;

    private static int sayac=0;

    public abstract void yiyecek();
    public abstract void yemekMiktari();
    public abstract void gunlukUykuSuresi();
    public abstract void sesi();

    public hayvan(String isim, boolean vahsi, String dogumtarihi) {
        this.id = ++sayac;
        setIsim (isim);
        setVahsi (vahsi);
        setDogumtarihi (dogumtarihi);
    }
    @Override
    public String toString() {




        return "{" +
                "id='" + id + '\'' +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumtarihi='" + dogumtarihi + '\'' +
                ", sesi='" + dogumtarihi + '\'' +

                '}';
    }

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }

    public void setVahsi(boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumtarihi() {
        return dogumtarihi;
    }

    public void setDogumtarihi(String dogumtarihi) {
        this.dogumtarihi = dogumtarihi;
    }


}
