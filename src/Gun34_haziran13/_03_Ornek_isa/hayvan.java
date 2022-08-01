package Gun34_haziran13._03_Ornek_isa;

public class hayvan {
    String renk;
    int kilo;
    String cinsi;

    public hayvan(String renk, int kilo, String cinsi) {
        this.renk = renk;
        this.kilo = kilo;
        this.cinsi = cinsi;
    }

    public void konustu(){
        System.out.println("konustu");
    }


    @Override
    public String toString() {
        return "hayvan{" +
                "renk='" + renk + '\'' +
                ", kilo=" + kilo +
                ", cinsi='" + cinsi + '\'' +
                '}';
    }
}
