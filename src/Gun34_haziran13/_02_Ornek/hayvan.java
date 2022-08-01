package Gun34_haziran13._02_Ornek;

public class hayvan {// dede
    String renk;
    int kilo;
    String cinsi;
    int hayvanId;



    public void konustu(){
        System.out.println("konustu");
    }


    @Override
    public String toString() {
        return "hayvan{" +
                "renk='" + renk + '\'' +
                ", kilo=" + kilo +
                ", cinsi='" + cinsi + '\'' +
                ", hayvanId=" + hayvanId +
                '}';
    }
}
