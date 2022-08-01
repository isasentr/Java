package Z_1_Test.okul;

public class ilkogrenci extends ogrenci{
    public enum clup{satranc, tiyatro, muzik}
    private String clup;

    public ilkogrenci(String isim, tip tipi, String clup) {
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
        return "ilkogrenci{" +
                "clup='" + clup + '\'' +
                "} " + super.toString();
    }
}
