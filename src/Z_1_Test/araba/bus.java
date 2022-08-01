package Z_1_Test.araba;

public class bus extends vehicle implements idiesel {
    public bus(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changediesel() {
        return "bus büyük araba";
    }

    @Override
    public String drive() {
        return "bus sürmesi zor.";
    }
}
