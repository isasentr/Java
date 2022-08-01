package Gun35_haziran14.Ornek_02;

public class daire extends sekil{

private  int yaricap;

    public daire(int yaricap) {
        setYaricap( yaricap);
    }

    public int getYaricap() {
        return yaricap;
    }

    public void setYaricap(int yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double getcevre() {
        return Math.PI*2*this.yaricap;
    }

    @Override
    public double getalan() {
        return Math.PI*this.yaricap*this.yaricap;
    }

    @Override
    public String toString() {
        return "daire{" +
                "yaricap=" + yaricap +
                "} " + super.toString();
    }
}


