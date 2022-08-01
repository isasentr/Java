package Odevler._23_OdevlerHaziran20.Soru_3;

public class Samsung extends Phone {
    @Override
    public void options(String a, String b) {
        if (a.contains("256") && b.contains("5.5")) {
            cart.add("$1000");
        } else if (a.contains("256") && b.contains("7.5")) {
            cart.add("$1200");
        } else if (a.contains("512") && b.contains("5.5")) {
            cart.add("$1300");
        } else if (a.contains("512") && b.contains("6.5")) {
            cart.add("$1400");
        }
    }
}
