package Gun36_haziran15.Final.metod;

public class tasit {

    private String model;

    public tasit(String model) {
        setModel (model);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public final String toString() {
        return "tasit{" +
                "model='" + model + '\'' +
                '}';
    }
}
