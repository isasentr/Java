package Gun33_haziran10.Encapsaulation1;

public class Kisi {

    String ad;
    String soyad;
    int yas;

    public Kisi() {
    }

    public Kisi(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
//        this.yas = yas;
        yasAta(yas);
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", yas=" + yas +
                '}';
    }

    public void yasAta(int yas){
        this.yas=Math.abs(yas);
    }

    public int yasGetir(){
       return this.yas;
    }

}
