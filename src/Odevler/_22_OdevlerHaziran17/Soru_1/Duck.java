package Odevler._22_OdevlerHaziran17.Soru_1;

public class Duck implements Isailing,Iflying{

    private String species;
    private String habitat;

    public Duck(String species, String habitat) {
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
        return "ekmek";
    }

    @Override
    public String getflying() {
        return "Mevsim geçiişlerinde göç ederleri.";
    }

    @Override
    public String getsailing() {
        return "sulak alanlar yumurtlama yerlleridir.";
    }
}
