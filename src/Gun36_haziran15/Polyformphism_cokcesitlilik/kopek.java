package Gun36_haziran15.Polyformphism_cokcesitlilik;

public class kopek extends hayvan{
    public kopek(String name) {
        super(name);
    }

    @Override
    public void ses() {
        System.out.println("havladı");
    }
    public void kokladi(){
        System.out.println("kokladi");
    }
}
