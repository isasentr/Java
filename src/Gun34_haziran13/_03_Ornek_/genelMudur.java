package Gun34_haziran13._03_Ornek_;

public class genelMudur extends calisan {
    private  int tazminat;

    public genelMudur(String isim, double maas, double maasKatsayisi, int tazminat) {
        super(isim, maas, maasKatsayisi);
        this.tazminat = tazminat;
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla()+tazminat;
    }

    @Override
    public String toString() {
        return "genelMudur{" +
                "tazminat=" + tazminat +
                "} " + super.toString();
    }
}
