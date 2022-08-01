package Gun39_haziran20.Ornek_2;

public class geometri {
    public static void main(String[] args) {
        dikdortgen d=new dikdortgen(5,6);
        d.setName("dikdörtgen");
        System.out.println(d);
        d.ciz();

        daire d1=new daire(5);
        d1.setName("daire");
        System.out.println(d1);
        d1.ciz();
    }
}
