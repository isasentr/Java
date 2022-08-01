package Z_1_Test.hav1;
//1- id ,isim, vahsi(boolean),
//   dogumTarihi (String) fieldları olan ve
//
//   yiyecegi, yemekMiktari, gunlukUykuSuresi ve sesi isimlerinde abstract metodları,
//   toString şeklinde normal metodu ve get ve set leri olan Hayvan isminde
//   bir abstract class yazınız.
//
//2- Kedi, kartal şeklinde 2 tane extend alacak normal class yazınız.
//
//3- Main de 1 er nesne oluşturup, değerlerini atayıp, yazdırınız.
//
//4- Benzersiz ID leri olmalı, buna göre güvenli dizayn yapınız.

public abstract class hayvan {
    private int id;
    private String isim;
    private boolean vahsimi;
    private String dogumTarihi;

    static int sayac=0;

    abstract void yiyecek();
    abstract void yemekMiktari();
    abstract void sesi();

    public hayvan(String isim, boolean vahsimi, String dogumTarihi) {
        setId (id);
        setIsim (isim);
        setVahsimi (vahsimi);
        setDogumTarihi (dogumTarihi);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = ++sayac;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsimi() {
        return vahsimi;
    }

    public void setVahsimi(boolean vahsimi) {
        this.vahsimi = vahsimi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return "hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsimi=" + vahsimi +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                '}';
    }
}
