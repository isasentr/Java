package Gun35_haziran14.Ornek_01;

public class arac {
    private String renk;
    private double motor;
    private String marka;

    private int aracKapisayisi;

    public arac(String renk, double motor, String marka, int aracKapisayisi) {
        setRenk(renk);
        setMotor(motor);
        setMarka(marka);
        setAracKapisayisi(aracKapisayisi);

    }
    public double arabafiyati(){
        return motor*aracKapisayisi;
    }

    public int getAracKapisayisi() {
        return aracKapisayisi;
    }

    public void setAracKapisayisi(int aracKapisayisi) {
        if(aracKapisayisi<5 && aracKapisayisi>0)
        this.aracKapisayisi = aracKapisayisi;
        else {
            System.out.println("KAPI SAYISI 5 TEN FAZla olmaz");
            this.aracKapisayisi = 0;
        }
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "arac{" +
                "renk='" + renk + '\'' +
                ", motor=" + motor +
                ", marka='" + marka + '\'' +
                ", aracKapisayisi=" + aracKapisayisi +
                '}';
    }
}
