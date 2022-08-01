package Z_1_Test._01_Soru;

public class Swallow implements IAnimal, IFlying {

    private String color;
    private String habitat;

    public Swallow(String color, String habitat) {
        setColor(color);
        setHabitat(habitat);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String food() {
        return "Kırlangıçlar tüm böcek ve sinek türleri ile beslenebilirler. " +
                "Havada uçarken beslenmek en önemli özellikleridir. " +
                "Uçuş esnasında omurgasız küçük sinek ve böcek gibi " +
                "canlıları yiyerek yaşamlarını sürdürürler.";
    }

    @Override
    public String getFlying() {
        return "Kırlangıçlar hiç durmadan 8 saat uçabilme " +
                "özelliğine sahiptir";
    }
}
