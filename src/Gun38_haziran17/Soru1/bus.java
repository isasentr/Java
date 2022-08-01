package Gun38_haziran17.Soru1;

public class bus extends Vehicle implements diesel{
    public bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String drive() {
        return "şehir içine girme ve yavaş sür";
    }

    @Override
    public String changediesel() {
        return "bir depo ile 1000 km  gider.";
    }
}
