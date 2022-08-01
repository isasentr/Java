package Gun31_haziran08.FinalModifier.Ornek1;

public class Vatandas {

    String isim;

    final int tcNo; // değiştirilemez
    //yani sadece birkez veri atanabilir.

static int tcNoSayac=1001; // bitanesin

    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo=++tcNoSayac;
        //final değişkenlerine sadece 1 kez veri atanabilir.
        //o da ya tanımlarınken, yada Constructor da yapılabilir.
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "tcNo=" + tcNo +
                ", isim='" + isim + '\'' +
                '}';
    }
}
