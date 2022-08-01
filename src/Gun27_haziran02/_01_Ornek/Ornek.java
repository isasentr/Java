package Gun27_haziran02._01_Ornek;

public class Ornek {
    public static void main(String[] args) {
        // 1- Adım : Person isimli bir class tanımlayınız : name, surname, age
        // 2- Adım : main de 2 tane bu sınıftan nesne oluşturup deger atayınız.
        // 3- Adım : Bu degerlerı yazıdırınız.
        // 4- Adım :getBirthYear isminde Person a ait bir metod yazınız,
        // çalıştığında kişinin doğum yılını versin.
        // 5- Adım : getInitials isminde kişiniz adının ilk harfi.soyadının ilk harfi
        //  şeklinde (Büyük harf) veren metodu yazınız. örnek
        //  ahmet demir : A.D.ilkHarf

        Person kisi1 = new Person();
        kisi1.name = "Hatice";
        kisi1.surname = "Namlı";
        kisi1.age = 20;

        Person kisi2 = new Person();
        kisi2.name = "Vasif";
        kisi2.surname = "Zeynalov";
        kisi2.age = 25;

        //1. yöntem

        System.out.println("kisi1 = " + kisi1.name);
        System.out.println("kisi1 = " + kisi1.surname);
        System.out.println("kisi1 = " + kisi1.age);

        System.out.println("kisi2 = " + kisi2.name);
        System.out.println("kisi2 = " + kisi2.surname);
        System.out.println("kisi2 = " + kisi2.age);
        System.out.println();
        //2.yöntem method

        BilgiYazdir(kisi1);
        BilgiYazdir(kisi2);
        System.out.println();

        //3.yöntem
        kisi1.BilgiYazdir();
        kisi1.getBirthYear();

        System.out.println();

        kisi2.BilgiYazdir();
        kisi2.getBirthYear();
        System.out.println();

        kisi1.getInitials();
        kisi2.getInitials();

    }
    //2.yöntem
    public static void BilgiYazdir(Person kisi) {

        System.out.println("kisi = " + kisi.name);
        System.out.println("kisi = " + kisi.surname);
        System.out.println("kisi = " + kisi.age);

    }
}
