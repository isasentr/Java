package Gun36_haziran15.Soru_h;

public class OkulMain {
    public static void main(String[] args) {
        Ogrenci ogr=new Ogrenci("halil","fındık","Ders Çalışmak","11A");
        Calisan cal=new Calisan("Onur", "İncedayi", "calismak","Test Team");

        System.out.println("ogr = " + ogr);
        System.out.println("cal = " + cal);

        Kisi.KimlikBelgesiYaz(ogr);
        Kisi.KimlikBelgesiYaz(cal);

    }
}
