package Z_1_Test.a5;

public class ElektrikHesabi {
    int toplamTüketim=0;
    double oran =0.9;
    int odenecekTutar=0;

    public void tuketimEkle(int tuketim){

        toplamTüketim+=tuketim;
    }

    public void toplamTuketimYaz(){

        System.out.println("toplamTüketim = " + toplamTüketim);
    }
    public void odenecekTutarYaz(){

        System.out.println("odenecekTutar = " + (toplamTüketim*oran));
    }

}
