package Gun37_haziran16.Ornek4_bir;


public class a4 implements Igosterir, Iyazdirir {

    @Override
    public void goster() {
        System.out.println("gosterdi");
    }

    @Override
    public void yaz() {
        System.out.println("yazdırdı");
    }
}
