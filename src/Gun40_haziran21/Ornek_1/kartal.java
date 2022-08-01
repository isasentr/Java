package Gun40_haziran21.Ornek_1;

public class kartal extends hayvan{
    public kartal( String isim, boolean vahsi, String dogumtarihi) {
        super( isim, vahsi, dogumtarihi);
    }

    @Override
    public void yiyecek() {
        System.out.println(getClass()+"balık yer");
    }

    @Override
    public void yemekMiktari() {
        System.out.println(getClass()+"500 gr yer");
    }

    @Override
    public void gunlukUykuSuresi() {
        System.out.println(getClass()+"2 saat uyur.");
    }

    @Override
    public void sesi() {
        System.out.println(getClass()+"gakkk der.");
    }
}
