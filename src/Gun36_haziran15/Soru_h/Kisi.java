package Gun36_haziran15.Soru_h;

public class Kisi {
    private String ad;
    private String soyad;
    private String gorevi;

    public Kisi(String ad, String soyad, String gorevi) {
        setAd(ad);
        setSoyad(soyad);
        setGorevi(gorevi);
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
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", gorevi='" + gorevi + '\'' +
                '}';
    }

    public static void KimlikBelgesiYaz(Kisi gelenKisi)
    {
        System.out.println("*** Kimlik Belgesi ***");
        System.out.println("ad = " + gelenKisi.ad);
        System.out.println("soyad = " + gelenKisi.soyad);
        System.out.println("gorevi = " + gelenKisi.gorevi);

        if (gelenKisi instanceof Ogrenci) // Bu gelen kişi öğrenci mi
            System.out.println("subesi = " +   ((Ogrenci)gelenKisi).getSubesi());

        if (gelenKisi instanceof Calisan)
            System.out.println("departmani = " + ((Calisan)gelenKisi).getDepartmani());
    }

}
