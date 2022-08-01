package Odevler._20_OdevlerHaziran14_ok;

public class ogrenci1 extends bilgi {
    private int ucret;

    public ogrenci1(String isim, String adres, String okul, uyetipi utipi, int ucret) {
        super(isim, adres, okul, utipi);
        setUcret (ucret);
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    @Override
    public String toString() {
        return "ogrenci1{" +
                "ucret=" + ucret +
                "} " + super.toString();
    }
}
