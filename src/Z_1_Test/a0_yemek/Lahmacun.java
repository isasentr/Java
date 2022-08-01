package Z_1_Test.a0_yemek;
public class Lahmacun extends Menu implements food{
    void dough(){
        System.out.println("lahmacun hamuru açıldı");}
    void topping(){
        System.out.println("lahmacun fırın ısıtıldı.");}
    void bake(){
        System.out.println("fırında 250 derecede pişirildi.");}

    @Override
    public void taste() {
        System.out.println("Lezzetli");
    }

    @Override
    public double ucret() {
        return 33;
    }
}
