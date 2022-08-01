package Z_1_Test.alan;

public class dikdörtgen extends sekil {
    private int uzunluk;
    private int genislik;

    public dikdörtgen(int uzunluk, int genislik) {
        setUzunluk(uzunluk);
        setGenislik(genislik);
    }

    public int getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(int uzunluk) {
        if (uzunluk < 5)
            System.out.println("uzunluk 5 ten küçük olamaz");
        this.uzunluk = uzunluk;
    }

    public int getGenislik() {
        return genislik;
    }

    public void setGenislik(int genislik) {
        if (genislik < 4)
            System.out.println("genislik 4 ten küçük olamaz");
        this.genislik = genislik;
    }

    public double getalan() {

        return this.genislik * this.uzunluk;
    }

    public double getcevre() {

        return this.genislik *2+2* this.uzunluk;
    }

    @Override
    public String toString() {
        return "dikdörtgen{" +
                "uzunluk=" + uzunluk +
                ", genislik=" + genislik +
                "} " + super.toString();
    }


}
