package Odevler._21_OdevlerHaziran15_ok;

public class Ogrenci extends Tip {
    String sube;

    public Ogrenci(String ad, String soyad, String gorevi, String sube) {
        super(ad, soyad, gorevi);
        setSube(sube);
    }

    public String getSube() {
        return sube;
    }

    public void setSube(String sube) {
        this.sube = sube;
    }

    public void kisiBelge() {

        System.out.println("Ogrenci{" +
                "sube='" + sube + '\'' +
                "} " + super.toString());
    }
}
