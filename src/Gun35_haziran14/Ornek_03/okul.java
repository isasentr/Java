package Gun35_haziran14.Ornek_03;

public class okul {
    public static void main(String[] args) {
        liseOgrencisi lo1 =new liseOgrencisi("isa",tip.LISE,"mf");
        liseOgrencisi lo2 =new liseOgrencisi("ali",tip.ILK,"mf");

        ilkOgrenci il1= new ilkOgrenci("ayşe",tip.ILK,"tiyatro");
        ilkOgrenci il2= new ilkOgrenci("mali",tip.ILK,"satranc");


        System.out.println("lo1 = " + lo1);
        System.out.println("lo2 = " + lo2);
        System.out.println("il1 = " + il1);
        System.out.println("il2 = " + il2);

    }
}
