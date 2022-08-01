package Gun40_haziran21.Ornek_4;

public class Lahmacun extends TechnoCafe implements food {

    void dough(){
        System.out.println("hamur ince açıldı");
    }

    void addMeat(){
        System.out.println("Kıyma taze çekildi.");
    }

    void bake(){
        System.out.println("250 derece sıcaklıkta fırında 10 dk pişirildi.");
    }

    @Override
    public void taste() {
        System.out.println("yazın ayran ile iyi gider. Güzel tercih.");
    }

    @Override
    public double ucret() {
        return 33;
    }
}
