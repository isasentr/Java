package Z_1_Java_Exercise;
import java.util.Scanner;
public class A23_Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String K_adi,parola;
        System.out.print("Kullanıcı Adınızı Giriniz:");
        K_adi= scan.nextLine();

        System.out.print("Parola Giriniz:");
        parola= scan.nextLine();

        if (K_adi.equals("isa şen")&&parola.equals("123456")){
            System.out.println("Başarılı giriş yapılmıştır.");
        }else {
            System.out.println("Kullanıcı Adı veya Şifre Yanlış ");
        }
    }

}
