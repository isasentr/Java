package Gun29_haziran06._01_Constructor;

import java.util.Scanner;

public class okul {
    // Bir Student sınıfı oluşturunuz (id, name, surName, classroom(int)) ve
    // bundan 7 adet öğrenci oluşturunuz.
    public static void main(String[] args) {
        //1.yöntem
        Scanner oku = new Scanner(System.in);
        Student ogr1 = new Student();// () parametre yeri
        ogr1.id = 1;
        ogr1.name = "Ali Kemal";
        ogr1.surName = "Inal";
        ogr1.classroom = 11;
        System.out.println("ogr1.name = " + ogr1.name);

        Student ogr2 = new Student();// () parametre yeri
        ogr2.id = 1;
        ogr2.name = "metin";
        ogr2.surName = "haşal";
        ogr2.classroom = 12;
        System.out.println("ogr2.name = " + ogr2.name);

        //2.yöntem
        Student ogr3 = new Student(3, "Yasin", "Erkol", 9);
        System.out.println("ogr3.name = " + ogr3.name);


        Student ogr4 = new Student(5, "Murat", "Erkol", 9);
        Student ogr6 = new Student(6, "isa", "Erkol");
        Student ogr7 = new Student(7, "Onur");
        Student ogr8 = new Student(7);


    }
}
