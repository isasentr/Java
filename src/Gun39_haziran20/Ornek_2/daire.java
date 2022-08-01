package Gun39_haziran20.Ornek_2;
public class daire extends Sekil{
    private double yaricap;

    public daire(double yaricap) {
        setYaricap (yaricap);
    }

    @Override
    public double alan() {
        return Math.PI*yaricap*yaricap;
    }

    @Override
    public double cevre() {
        return Math.PI*yaricap*2;
    }

    public double getYaricap() {
        return yaricap;
    }

    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }
}
