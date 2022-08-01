package Gun34_haziran13._03_Ornek_;

public class calisan {
    private  String isim;
    private  double maas;
    private  double maasKatsayisi;

    public calisan(String isim, double maas, double maasKatsayisi) {
        this.isim = isim;
        this.maas = maas;
        this.maasKatsayisi = maasKatsayisi;
    }

    public  double  maasHesapla() {

        return maas*maasKatsayisi;
    }
    @Override
    public java.lang.String toString() {
        return "calisan{" +
                "isim=" + isim +
                ", maas=" + maas +
                ", maasKatsayisi=" + maasKatsayisi +
                '}';
    }



}
