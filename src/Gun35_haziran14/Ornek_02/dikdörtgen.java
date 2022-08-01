package Gun35_haziran14.Ornek_02;

public class dikdörtgen extends  sekil {
    private int uzunluk;
    private int genislik;

    public dikdörtgen(int uzunluk, int genislik) {
        setUzunluk(uzunluk);
        setGenislik(genislik);
    }

    @Override
    public double getalan() {
        return this.genislik*this.uzunluk;
    }

    @Override
    public double getcevre() {
        return (this.genislik+this.uzunluk)*2;
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        this.uzunluk = uzunluk;
    }

    public int getGenislik() {
        return genislik;
    }

    public void setGenislik(int genislik) {
        this.genislik = genislik;
    }

    @Override
    public String toString() {
        return "dikdörtgen{" +
                "uzunluk=" + uzunluk +
                ", genislik=" + genislik +
                "} " + super.toString();
    }
}
