package Gun29_haziran06._02_Constructor;

public class Kitap {
    String name;
    int publishYear;
    String author;
    // Yapıcı metod : Constructor metod
    //1.yöntem
    Kitap() {// 1.Constructor
    }

    //2.yöntem

    Kitap(String name, int publishYear, String author) {
        this.name = name;
        this.publishYear = publishYear;
        this.author = author;
    }

    Kitap(String name, int publishYear) {
        this(name, publishYear, "");
    }

    Kitap(String name) {
        this(name, 0, "");
    }

    void yazdir(){

        System.out.println(name+" "+publishYear+" "+author);
    }


   public String toString(){

        return name+" "+publishYear+" "+author;
    }
}
