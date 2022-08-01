package Z_1_Test._01_Soru;

public class Cat implements IAnimal {

    private String species;
    private String habitat;

    public Cat(String species, String habitat) {
        setSpecies(species);
        setHabitat(habitat);
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
        return "Kediler etobur canlılardır ve enerjilerinin " +
                "büyük kısmını proteinden sağlarlar. Ancak " +
                "sevimli dostlarımızın daha sağlıklı beslenmesi için " +
                "dietlerine tahıl ve meyve ve sebzeler de eklemeliyiz.";
    }
}
