package Z_1_Test.araba;

public class vehicle {
    private String model;
    private double engine;

    public vehicle(String model, double engine) {
        setModel(model);
        setEngine(engine);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "vehicle{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
