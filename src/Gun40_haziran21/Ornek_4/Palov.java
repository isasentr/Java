package Gun40_haziran21.Ornek_4;

public class Palov extends TechnoCafe implements food {

    void fry(){
        System.out.println("pirinç taneleri kızartılır.");

    }

    void boil(){
        System.out.println("10 dk su da kaynatılır.");
    }
    @Override
    public void taste() {
        System.out.println("yazın ayran ile iyi gider. Güzel tercih.");
    }

    @Override
    public double ucret() {
        return 44;
    }
}
