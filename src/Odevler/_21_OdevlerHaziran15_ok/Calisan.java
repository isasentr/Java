package Odevler._21_OdevlerHaziran15_ok;

public class Calisan extends Tip {
    String departman;

    public Calisan(String ad, String soyad, String gorevi, String departman) {
        super(ad, soyad, gorevi);
        setDepartman (departman);
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }

    public void kisiBelge() {
        System.out.println("Calisan{" +
                "departman='" + departman + '\'' +
                "} " + super.toString());
    }

}
