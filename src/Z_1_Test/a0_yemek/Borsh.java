package Z_1_Test.a0_yemek;
public class Borsh extends Menu implements food{
    void boil(){
        System.out.println(" Borsh güzelce haşlandı");}
    void eatTomorrow(){
        System.out.println("borch bir gün sonrası afiyetle yenildi.");}

    @Override
    public void taste() {
        System.out.println("Lezzetli");
    }

    @Override
    public double ucret() {
        return 33;
    }
}
