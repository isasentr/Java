package Gun33_haziran10.Encapsaulation2;

public class Araba {
    private String renk;
    private String model;
    private int motorHacmi;
    private int kapısayisi;


    public Araba(String renk, String model, int motorHacmi, int kapısayisi) {
        setRenk(renk);
        setModel(model);
        setMotorHacmi(motorHacmi);
        setKapısayisi(kapısayisi);
    }

    public Araba() {
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        this.motorHacmi = motorHacmi;
    }

    public int getKapısayisi() {
        return kapısayisi;
    }

    public void setKapısayisi(int kapısayisi) {
        if (kapısayisi<5)
        this.kapısayisi = kapısayisi;
   else
            System.out.println("böyle araç yok");

    }
}
