package Gun37_haziran16.Ornek6_soru;

public class daire implements Isekil {

    @Override
    public double alan(double... dizi) {
        return Math.round(Math.PI*dizi[0]*dizi[0]);
    }

    @Override
    public double cevre(double... dizi) {

        return Math.round(Math.PI*2*dizi[0]);
    }
}
