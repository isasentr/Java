package Gun36_haziran15.Soru_h;

public class Calisan extends Kisi{
    private String departmani;
    public Calisan(String ad, String soyad, String gorevi, String departmani) {
        super(ad, soyad, gorevi);
        setDepartmani(departmani);
    }

    public String getDepartmani() {
        return departmani;
    }

    public void setDepartmani(String departmani) {
        this.departmani = departmani;
    }

    @Override
    public String toString() {
        return "Calisan{" + super.toString()+
                "departmani='" + departmani + '\'' +
                '}';
    }
}
