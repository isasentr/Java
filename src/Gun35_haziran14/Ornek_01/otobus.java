package Gun35_haziran14.Ornek_01;

public class otobus extends arac {//Arac baba
    private  int yolcuKapasitesi;

    public otobus(String renk, double motor, String marka, int yolcuKapasitesi,int aracKapisayisi) {
        super(renk, motor, marka,aracKapisayisi); // miras alınan yer süper class olarak alınır
                                                    //kendisi subclass yani altclass,yani evlat

        setYolcuKapasitesi(yolcuKapasitesi);
    }

    @Override
    public double arabafiyati() {
        return super.arabafiyati();
    }

    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    @Override
    public String toString() {
        return "otobus{" +
                "yolcuKapasitesi=" + yolcuKapasitesi +
                "} " + super.toString();
    }
}
