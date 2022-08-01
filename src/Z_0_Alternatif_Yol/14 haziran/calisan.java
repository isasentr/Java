package _35oop2;

public class calisan extends info {
    private int maas;
    public calisan(String isim, String adres, String okul,int maas,uyetip tip) {
        super(isim, adres, okul);
        setMaas(maas);

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
                "maas=" + maas +super.toString()+
                '}';
    }
}
