package Z_1_Test.okul;

public class ogrenci {
    public enum tip {ILK, ORTA, LISE}

    ;

    private int id;
    private String isim;
    private tip tipi;

    private static int sayac = 0;

    public ogrenci(String isim, tip tipi) {
        setId(id);
        setIsim(isim);
        setTipi(tipi);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = ++sayac;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public tip getTipi() {
        return tipi;
    }

    public void setTipi(tip tipi) {
        this.tipi = tipi;
    }

    @Override
    public String toString() {
        return "ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tipi=" + tipi +
                '}';
    }
}

