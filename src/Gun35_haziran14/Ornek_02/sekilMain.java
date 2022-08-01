package Gun35_haziran14.Ornek_02;

public class sekilMain {
    public static void main(String[] args) {
        sekil skl=new sekil();
        dikdörtgen dik =new dikdörtgen(25,10);
        System.out.println("dik = " + dik.getalan());
        System.out.println("dik = " + dik.getcevre());
        
        kare kar=new kare(10);
        System.out.println("kar.getalan() = " + kar.getalan());
        System.out.println("kar = " + kar.getcevre());

        daire dar =new daire(5);
        System.out.println("dar = " + dar.getalan());
        System.out.println("dar = " + dar.getcevre());

    }
}
