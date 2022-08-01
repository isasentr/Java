package _35oop2;

public class ogrenci extends info {
    private int ucret;
    public ogrenci(String isim, String adres, String okul, int ucret, uyetip tip) {
        super(isim, adres, okul);
        setUcret(ucret);
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    @Override
    public String toString() {
        return "ogrenci{" +
                "ucret=" + ucret +super.toString()+
                '}';
    }
}
