package Z_1_Test.arac;

public class arac {
    private String renk;
    private int motor;
    private String marka;

    public arac(String renk, int motor, String marka) {
        setRenk(renk);
        setMotor(motor);
        setMarka(marka);
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        if (renk.equalsIgnoreCase("siyah"))
            System.out.println("yanlış seçim siyah olmaz");
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if (motor==1600){
            System.out.println("yasak");
        }
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
                '}';
    }
}
