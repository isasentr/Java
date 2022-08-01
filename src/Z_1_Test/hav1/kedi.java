package Z_1_Test.hav1;

public class kedi extends hayvan{
    @Override
    void yiyecek() {
        System.out.println("balık");
    }

    @Override
    void yemekMiktari() {
        System.out.println("250 gr");
    }

    @Override
    void sesi() {
        System.out.println("miyav");
    }

    public kedi(String isim, boolean vahsimi, String dogumTarihi) {
        super(isim, vahsimi, dogumTarihi);
    }


}
