package Gun40_haziran21.Ornek_4;

public class AdanaKebab extends TechnoCafe implements food {

    void marinadel(){
        System.out.println( "Güzelce marina edildi.");
    }
    void grill(){
        System.out.println( "Güzelce ateşte pişirildi.");
    }

    @Override
    public void taste() {
        System.out.println("yazın ayran ile iyi gider. Güzel tercih.");
    }

    @Override
    public double ucret() {

        return 55;
    }
}
