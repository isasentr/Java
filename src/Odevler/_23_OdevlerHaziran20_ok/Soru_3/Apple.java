package Odevler._23_OdevlerHaziran20.Soru_3;

public class Apple extends Phone {

    @Override
    public void options(String a, String b) {
        if (a.contains("64") && b.contains("5.5")) {
            cart.add("$750");
        } else if (a.contains("64") && b.contains("6.5")) {
            cart.add("$850");
        } else if (a.contains("128") && b.contains("5.5")) {
            cart.add("$950");
        } else if (a.contains("128") && b.contains("6.5")) {
            cart.add("$1200");
        }
    }
}