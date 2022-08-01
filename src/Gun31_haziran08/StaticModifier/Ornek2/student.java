package Gun31_haziran08.StaticModifier.Ornek2;

public class student {
    int id ;
    String name;
    String surName;

    static int sayac=0;

    public student(String name, String surName) {
        this.id=++sayac;
        this.name = name;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                '}';
    }
}
