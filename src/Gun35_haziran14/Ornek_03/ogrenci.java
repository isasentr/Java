package Gun35_haziran14.Ornek_03;

public class ogrenci {
   private int id;
    private String isim;
    private  tip tipi;

   private static int sayac=0; //bitanecik

    public ogrenci( String isim, tip tipi) {
        setId(id); // sayaca bağladığımız için
        setIsim( isim);
        setTipi ( tipi);
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
