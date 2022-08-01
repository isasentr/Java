package Gun36_haziran15.Final.metod;

public class araba extends tasit{

    private String renk;
    public araba(String model) {
        super(model);
    }
public  void arabaYazdir(){
    System.out.println("renk = " + renk);
}

//    @Override
//    public String toString() { // miras alınan clastaki  Final metodları değiştiremeyiz.
//        return super.toString();
//    }
}
