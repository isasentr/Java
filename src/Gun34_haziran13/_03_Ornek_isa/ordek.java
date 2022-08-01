package Gun34_haziran13._03_Ornek_isa;

public class ordek extends hayvan {

    int kanatAcikligi;


    public ordek(String renk, int kilo, String cinsi, int kanatAcikligi) {
        super(renk, kilo, cinsi);
        this.kanatAcikligi = kanatAcikligi;
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("vak vak dedi");
    }

    @Override
    public String toString() {
        return "ordek{" +
                "kanatAcikligi=" + kanatAcikligi +
                ", renk='" + renk + '\'' +
                ", kilo=" + kilo +
                ", cinsi='" + cinsi + '\'' +
                "} " + super.toString();
    }
}

