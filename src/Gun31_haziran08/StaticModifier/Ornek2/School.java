package Gun31_haziran08.StaticModifier.Ornek2;

public class School {

    // Student (id, name, surName)
    // Yukarıdaki gibi 5 öğrenci tanımlayınız.
    // Her öğrencinin takip eden bir numarası olmalı.
    // Ve en son kaç öğrenci olduğunu bulabilmeliyim.

    public static void main(String[] args) {
        student stu1=new student("isa","sen");
        student stu2=new student("ali","sener");
        student stu3=new student("mes","alis");
        student stu4=new student("kes","keli");
        student stu5=new student("tes","teli");

        System.out.println("stu1 = " + stu1);
        System.out.println("stu2= " + stu2);
        System.out.println("stu3= " + stu3);
        System.out.println("stu4 = " + stu4);
        System.out.println("stu5 = " + stu5);

        System.out.println("öğrencisayısı= " + student.sayac);

    }

    // TODO: Kullanıcıya bir menu ile öğrenci ekleme, silme , arama
    // TODO: duzeltme imkanı veriniz. Öğrenci silinse bile en son
    // TODO: öğrenci sayısı doğru gözükmeli.
}
