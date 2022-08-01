package Gun38_haziran17.Soru1;

public class toyotaprius extends Vehicle implements gas,elektric {
    public toyotaprius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String drive() {
        return "ilk 10 km elektrikle gider.";
    }

    @Override
    public String changebattery() {
        return "ömür boyu kullan";
    }

    @Override
    public String changeoil() {
        return "bir depo ile 300 km gider";
    }
}
