package Gun37_haziran16.Ornek5_cakis;

public class test implements Igosterir,Iyazdirir {

    @Override
    public void goster() {
        System.out.println("goster");
    }

    @Override
    public void yaz(String mesaj) {
        System.out.println("mesaj "+mesaj);
    }

    @Override
    public void yaz() {
        System.out.println("yazdirir");
    }
}
