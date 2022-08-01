package Gun31_haziran08.FinalModifier.Ornek1;

public class NufusMudurlugu {

    // Vatandas isimli bir Class tanımlayınız (fields: isim, tcNo)
    // tcNo değerini int olarak alınız ve nesne oluşturulurken
    // sıralı olarak atayınız.Daha sonradan değeri değiştirilemesin.
    // kontrol için mainde 2 kişi tanımlayınız.
    public static void main(String[] args) {
        Vatandas v1 = new Vatandas("ismet");
        Vatandas v2= new Vatandas("isa");
        Vatandas v3 = new Vatandas("mehmet");

        //final değişkenlerine sadece 1 kez veri atanabilir.
        //o da ya tanımlarınken, yada Constructor da yapılabilir.

        final double pi =3.14;

        System.out.println("pi = " + pi);
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);

    }
}
