package Gun37_haziran16.Ornek6_soru;

public class dikdortgen implements Isekil {

    @Override
    public double alan(double... dizi) {
        if (dizi.length == 1) { //kareyse
            return dizi[0] * dizi[0];
        }
        return dizi[0] * dizi[1];
    }

    @Override
    public double cevre(double... dizi) {
        if (dizi.length == 1) {//kareyse
            return dizi[0] * 4;
        }
        return (dizi[0] + dizi[1]) * 2;
    }
}
