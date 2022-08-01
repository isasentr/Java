package Z_1_Test.hav1;

public class kartal extends hayvan{
    @Override
    void yiyecek() {
        System.out.println("kuş");
    }

    @Override
    void yemekMiktari() {
        System.out.println("1 kg");
    }

    @Override
    void sesi() {
        System.out.println("gaakkkkk");
    }

    public kartal(String isim, boolean vahsimi, String dogumTarihi) {
        super(isim, vahsimi, dogumTarihi);
    }

}
