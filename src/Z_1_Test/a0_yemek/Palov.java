package Z_1_Test.a0_yemek;

public class Palov extends Menu implements food {
    void fry(){
        System.out.println("pilav tavada haşlandı.");
    }

    void boil(){
        System.out.println("pilav suda kaynatıldı.");
    }


    @Override
    public void taste() {
        System.out.println("Lezzetli");
    }

    @Override
    public double ucret() {
        return 44;
    }
}
