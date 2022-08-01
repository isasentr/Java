package Gun32_haziran09._02_Ornek;

import java.util.ArrayList;

public class Soru {

    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.ADMIN yetkili kullanıcıya
    // SILME işlemi kontrolü yapınız bir metod için.
    public static void main(String[] args) {
        ArrayList<User> userlar = new ArrayList<>();
        User user1 = new User("ismet", Statu.AKTIF, Role.ADMIN);
        User user2 = new User("ismet", Statu.AKTIF, Role.PERSONEL);
        User user3 = new User("ismet", Statu.PASIF, Role.MUDUR);
        user3.role = Role.PERSONEL;

        userlar.add(user1);
        userlar.add(user2);
        userlar.add(user3);
        for (User a : userlar) {
            System.out.println("userlar = " +  a.name +"-" +a.role+ " -" +a.statu);

        }

        UserSil(user1);
    }

    public static void UserSil(User user) {
        if (user.role == Role.ADMIN)
            System.out.print("Admin silinemez");
    }

}
