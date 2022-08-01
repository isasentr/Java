package Gun34_haziran13._03_Ornek_isa;

public class kopek extends hayvan {
    public kopek(String renk, int kilo, String cinsi) {
        super(renk, kilo, cinsi);
    }

    @Override
    public void konustu() {
        super.konustu();
        System.out.println("hav hav dedi");
    }
}
