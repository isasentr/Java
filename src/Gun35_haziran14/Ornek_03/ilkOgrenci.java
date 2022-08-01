package Gun35_haziran14.Ornek_03;

public class ilkOgrenci extends ogrenci {
    private String clup;

    public ilkOgrenci(String isim, tip tipi, String clup) {
        super(isim, tipi);
        setClup (clup);
    }

    public String getClup() {
        return clup;
    }

    public void setClup(String clup) {
        this.clup = clup;
    }

    @Override
    public String toString() {
        return "ilkOgrenci{" +
                "clup='" + clup + '\'' +
                "} " + super.toString();
    }
}
