package Gun36_haziran15.Polyformphism_cokcesitlilik;

public class hayvan {
    private String name;

    public void ses() {
        System.out.println("ses çıkardı......");
    }

    public hayvan(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
