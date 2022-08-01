package Odevler._22_OdevlerHaziran17.Soru_1;

public class Swallow implements Iflying, Ianimal {

    private String species;
    private String habitat;

    public Swallow(String species, String habitat) {
        setSpecies (species);
        setHabitat (habitat);
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String food() {
        return "insan ";
    }

    @Override
    public String getflying() {
        return "uzun süre havada kalabilirler.";
    }
}

