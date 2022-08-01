package Gun40_haziran21.Ornek_4;

public class Borsh extends TechnoCafe implements food{

   void boil(){

       System.out.println("su 100 dereceye gelene kadar kaynatıldı.");
   }
    void eatTomorrow(){

        System.out.println("bir gün sonrası yemek yavsiye edilir.");
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
