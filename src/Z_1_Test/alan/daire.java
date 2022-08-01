package Z_1_Test.alan;

public class daire extends sekil {
    private int yaricap;

    public daire(int yaricap) {
        setYaricap(yaricap);
    }

    public int getYaricap() {
        return yaricap;
    }

    public void setYaricap(int yaricap) {
        if (yaricap < 2){
            System.out.println("yarıçapı yanlış girdiniz.");
            this.yaricap = 1;
        }
        else
        this.yaricap = yaricap;
    }

    public double getalan() {

        return Math.PI * this.yaricap * this.yaricap;
    }

    public double getcevre() {

        return Math.PI * this.yaricap * 2;
    }

    @Override
    public String toString() {
        return "daire{" +
                "yaricap=" + yaricap +
                "} " + super.toString();
    }
}