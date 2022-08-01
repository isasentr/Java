package Gun40_haziran21.Ornek_1;

public class kedi extends hayvan {

    public kedi(String isim, boolean vahsi, String dogumtarihi) {
        super( isim, vahsi, dogumtarihi);
    }

    @Override
    public void yiyecek() {
        System.out.println(getClass()+"balık yer");
    }

    @Override
    public void yemekMiktari() {
        System.out.println(getClass()+"200 gr yer");
    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println(getClass()+"10 saat uyur.");
    }

    @Override
    public void sesi() {
        System.out.println(getClass()+"miyav der.");
    }
}
