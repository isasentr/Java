package Gun30_haziran07.PrivateErisim;
public class Calisan {
    int id;
    String name;
    String surName;
    private String password = "";
    public void sifreAl(String sifre) {

        if (sifre.length() < 8 )
            System.out.println("Lütfen kurala uygun şifre giriniz");
        else{
            this.password = sifre;
            System.out.println("Şİfre başarı ile atandı.");
    }    }
    public void sifreGoster() {// private olduğu için kontrol ekleyip veriye ulaştık.
        if (password.length() >= 8)
            System.out.println("****" + password.substring(4));
    }
}
