package Odevler._20_OdevlerHaziran14_ok;

public class calisan extends bilgi{
    private int maas;

    public calisan(String isim, String adres, String okul, uyetipi utipi, int maas) {
        super(isim, adres, okul, utipi);
        setMaas (maas);
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    @Override
    public String toString() {
        return "calisan{" +
                "maas=" + maas +
                "} " + super.toString();
    }
}
