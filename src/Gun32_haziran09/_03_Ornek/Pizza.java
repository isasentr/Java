package Gun32_haziran09._03_Ornek;

public class Pizza {
    PizzaSize size;

    public Pizza(PizzaSize size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                '}';
    }
}
