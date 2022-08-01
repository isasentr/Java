package Z_1_Test.hav1;

public class hayvanMain {
    public static void main(String[] args) {
        kedi ked=new kedi("pamuk",false,"1990");
        System.out.println("kedi = " + ked);
        ked.sesi();
        ked.yiyecek();
        ked.yemekMiktari();


        kartal kart=new kartal("minik",true,"1995");
        System.out.println("kart = " + kart);
    }
}
