package Odevler._18_OdevlerHaziran06_ok._17;

import java.util.ArrayList;

//// 1- filedları id, username, password, active (boolean), signedIn (boolean), userRole(ADMIN, OGRENCI, CALISAN, HOCA)
////    olan User isimli bir class tanımlayınız.
//// 2- bütün fieldları parametre alan bir concructor tanımlayınız.
//// 3- bütün fieldları için getter ve setter metodları oluşturunuz.
//// 4- UserMain isminde main için bir class oluşturunuz.
//// 5- Kullanicidan 2 adet user bilgisi isteyerek bir ArrayList e doldurunuz.
////    active ve signedIn default olarak true veya false atayabilirsiniz.
////    id yi sistem otomatik versin.,
//// 6- eğer password 6 dan küçük olursa yeniden istesin.passwordun
////    6 karakterden küçük olup olmadığını (classın içinde) kontrol ediniz.

public class userMain {
    public static void main(String[] args) {
        ArrayList<user> list = new ArrayList<>();

        user u1 = new user("isa", "12345678", true, true, "admin");
        user u2 = new user("ali", "14567", true, true, "çalışan");

        list.add(u1);
        list.add(u2);

        for ( user i: list){

            System.out.println("i = " + i.username);
            System.out.println("i = " + i.password);
            System.out.println("i = " + i.active);
            System.out.println("i = " + i.signedln);
            System.out.println("i = " + i.userRole);
            System.out.println("-------");
        }

    }
}
