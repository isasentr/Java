package Z_1_Test.a0_yemek;
public class AdanaKebab extends Menu implements food {
    void marinade(){
        System.out.println("adana kebap güzel");}
    void grill(){
        System.out.println("mangalda pişti");}


    @Override
    public void taste() {
        System.out.println("Lezzetli");
    }

    @Override
    public double ucret() {
        return 55;
    }
}