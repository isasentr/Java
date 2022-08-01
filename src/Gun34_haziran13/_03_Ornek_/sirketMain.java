package Gun34_haziran13._03_Ornek_;

public class sirketMain {
    public static void main(String[] args) {
        calisan p1=new calisan("ali",2500,1.5);
        System.out.println("p1.maasHesapla() = " + p1.maasHesapla());
        System.out.println("p1 = " + p1);

        genelMudur p2=new genelMudur("isa",2500, 1.5, 1650);
        System.out.println("p2.maasHesapla() = " + p2.maasHesapla());
        System.out.println("p2 = " + p2);

    }
}
