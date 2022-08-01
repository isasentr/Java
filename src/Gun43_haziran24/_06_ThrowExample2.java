package Gun43_haziran24;

import java.util.Scanner;

public class _06_ThrowExample2 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.println("Yeni Kullanıcı ve şifre giriniz=");

        System.out.print("Kullanıcı =");
        String userName = oku.nextLine();

        System.out.print("Şifre=");
        String password = oku.nextLine();
        try {
            if (password.length() < 8)
                throw new Exception("Şifre 8 karakterden az olamaz.");

            if (password.length() > 15)
                throw new Exception("Şifre 15 karakterden fazla olamaz.");

        } catch (Exception ex) {
            System.out.println("Lütfen dikkat");
            System.err.println("Lütfen dikkat");
            System.out.println("Uyari= " + ex.getMessage());
            // log tutuluyor.
            // kimler bu hatalı girişleri yapmış
            // ....
            // bir çok kontrol tek yerde toplanıyor.


        // throw ile kendimiz hata oluşturuyoruz.
        // böylece kritelerimize girmeyenler için de
        // catch bloğunua düşürerek, paratik kullanım sağlıyoruz.
        // Burada ayrıca programın devamının çalışmasına gerek olmadığı için,
        // break gibi programın devamının çalışmasını engelliyoruz.

        }
    }
}