package Gun38_haziran17.Soru1;

public class teslacar extends Vehicle implements elektric{
    public teslacar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String drive() {
        return "batarya 50 yıl gider";
    }

    @Override
    public String changebattery() {
        return "otonom";
    }
}
