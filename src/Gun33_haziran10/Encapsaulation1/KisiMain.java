package Gun33_haziran10.Encapsaulation1;

public class KisiMain {

    public static void main(String[] args) {

        Kisi kisi1 = new Kisi();
        kisi1.ad = "hakan";
        kisi1.soyad = "Taşdelen";
//      kisi1.yas = -25;
        kisi1.yasAta(-25);

        int yas = kisi1.yasGetir();
        System.out.println("kisi1 = " + kisi1);

        Kisi kisi2 = new Kisi("erol", "özgür", -30);
        System.out.println("kisi2 = " + kisi2);
    }
}
