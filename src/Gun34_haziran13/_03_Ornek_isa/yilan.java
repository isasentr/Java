package Gun34_haziran13._03_Ornek_isa;

public class yilan extends hayvan {
    int uzunluk;

    public yilan(String renk, int kilo, String cinsi, int uzunluk) {
        super(renk, kilo, cinsi);
        this.uzunluk = uzunluk;
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("tıs tıs dedi");
    }

    @Override
    public String toString() {
        return "yilan{" +
                "uzunluk=" + uzunluk +
                ", renk='" + renk + '\'' +
                ", kilo=" + kilo +
                ", cinsi='" + cinsi + '\'' +
                '}';
    }
}
