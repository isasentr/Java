package Z_1_Test._01_Soru;

public class Shark implements IAnimal, ISailing {

    private int lifeSpan;
    private String species;

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Shark(int lifeSpan, String species) {
        setLifeSpan(lifeSpan);
        setSpecies(species);
    }

    @Override
    public String food() {
        return "Köpek balıklarının doğal besinleri arasında " +
                "büyük balıklar, bazı deniz memelileri, " +
                "büyük mürekkep balıkları " +
                "ve diğer köpek balıkları bulunur.";
    }

    @Override
    public String getSailing() {
        return "Kolaylıkla 75 km/saat hıza çıkabilirler, hatta 96 km/saat hızla yüzenlere dahi rastlanmıştır.";
    }
}
