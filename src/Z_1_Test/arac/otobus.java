package Z_1_Test.arac;

public class otobus extends arac {

    private int yolcuKpaistesi;

    public otobus(String renk, int motor, String marka, int yolcuKpaistesi) {
        super(renk, motor, marka);
        this.yolcuKpaistesi = yolcuKpaistesi;
    }

    public int getYolcuKpaistesi() {
        return yolcuKpaistesi;
    }

    public void setYolcuKpaistesi(int yolcuKpaistesi) {
        if (yolcuKpaistesi>50)
            System.out.println("imkansız böyle yolcu olmaz");
        this.yolcuKpaistesi = yolcuKpaistesi;
    }

    @Override
    public String toString() {
        return "otobus{" +
                "yolcuKpaistesi=" + yolcuKpaistesi +
                "} " + super.toString();
    }
}
