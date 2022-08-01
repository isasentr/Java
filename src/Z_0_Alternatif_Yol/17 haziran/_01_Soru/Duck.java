package Z_1_Test._01_Soru;

public class Duck implements ISailing, IFlying{

    private String species;
    private String habitat;

    public Duck(String species, String habitat) {
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
        return "Ördekler otobur hayvanlardır ve sindirim sistemleri "  +
                "otla beslenmeye daha uygundur. En sevdikleri yiyecekler arasında " +
                "marul, maydanoz, brokoli, lahana ve ıspanak bulunur.";
    }

    @Override
    public String getFlying() {
        return "Ördeklerin yalnızca bazı türleri uçabilir " +
                "ve uçabilen türleri 40 ila 60 kişilik gruplar halinde " +
                " V şeklinde uçar.";
    }

    @Override
    public String getSailing() {
        return "Ördeklerin kuyruklarının dibinde üropigal bez adı verilen bir " +
                "bez bulunur ve bu bez sayesinde ördeklerin tüyleri su çekmez" +
                " ve suyun içinde bile kuru kalırlar";
    }
}
