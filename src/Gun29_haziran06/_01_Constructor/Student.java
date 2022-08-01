package Gun29_haziran06._01_Constructor;

public class Student {

    int id;
    String name;
    String surName;
    int classroom;


    //yapıcı metod - constructor
    Student() {
        this(0, "", "", 0);

    }

    //2.yöntem
    public Student(int id, String name, String surName, int classroom){
        this.id=id; // değişkenlerin karışmaması için, burdaki manasında
        this.name=name;  //başlarına this ekliyoruz.
        this.surName=surName;
        this.classroom=classroom;
    }

    Student(int id1, String name1, String surName1) {
        this(id1, name1, surName1, 0);
    }

    Student(int id1, String name1) {
        this(id1, name1, "", 0);// this: Class ın içindeyken Classdan
        // bahsettiğimizde kullanılır

    }

    Student(int id1) {
        this(id1, "", "", 0);

//        id = id1;
//        name = name1;
//        surName = surName1;
//        classroom = classroom1;
    }
}