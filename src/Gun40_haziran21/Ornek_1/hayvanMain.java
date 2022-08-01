package Gun40_haziran21.Ornek_1;

public class hayvanMain {
    public static void main(String[] args) {
        kedi ked=new kedi("mavis",true,"1990");
        kartal kart=new kartal("duss",true,"1988");

        System.out.println((ked.getClass().getSimpleName())+ked);
        System.out.println((kart.getClass().getSimpleName())+kart);


    }
}
