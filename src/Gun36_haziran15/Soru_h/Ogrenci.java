package Gun36_haziran15.Soru_h;

public class Ogrenci extends Kisi {
    private String subesi;

    public Ogrenci(String ad, String soyad, String gorevi, String subesi) {
        super(ad, soyad, gorevi);
        setSubesi(subesi);
    }

    public String getSubesi() {
        return subesi;
    }

    public void setSubesi(String subesi) {
        this.subesi = subesi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" + super.toString()+
                "subesi='" + subesi + '\'' +
                '}';
    }
}
