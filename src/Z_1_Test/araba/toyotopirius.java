package Z_1_Test.araba;

public class toyotopirius extends vehicle implements ielectric,igas{
    public toyotopirius(String model, double engine) {
        super(model, engine);
    }

    @Override
    public String changebattery() {
        return "prius batarya dayanıklı";
    }

    @Override
    public String changeoil() {
        return "pirius her 50 bin değiş";
    }

    @Override
    public String drive() {
        return "prius sürüş keyfi fena değil.";
    }
}
