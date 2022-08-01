package Z_1_Test.araba;

public class teslacar extends vehicle implements ielectric{

    public teslacar(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changebattery() {
        return "tesla batarya değiştir.";
    }

    @Override
    public String drive() {
        return "tesla otonom sürüşü keyif verir.";
    }
}
