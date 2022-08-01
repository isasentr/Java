package Gun47;


class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class S103 {
    public static void main(String[] args) {

        Student[] students = new Student[3];
        students[1] = new Student("Richard");
        students[2] = new Student("Donald");
        for (Student s : students) {
            System.out.print("" + s.name); // NULL un name i yazılamaz null exception
        }
    }
}




