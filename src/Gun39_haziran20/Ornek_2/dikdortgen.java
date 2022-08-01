package Gun39_haziran20.Ornek_2;

public class dikdortgen extends Sekil {

    private double kisaKenar;
    private double uzunKenar;

    public dikdortgen(double kisaKenar, double uzunKenar) {
        setKisaKenar (kisaKenar);
        setUzunKenar (uzunKenar);
    }
    @Override
    public  double alan() {
        return kisaKenar*uzunKenar;
    }
    @Override
    public double cevre() {
        return (kisaKenar+uzunKenar)*2;
    }

    public double getKisaKenar() {
        return kisaKenar;
    }
    public void setKisaKenar(double kisaKenar) {
        this.kisaKenar = kisaKenar;
    }

    public double getUzunKenar() {
        return uzunKenar;
    }

    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }
}
