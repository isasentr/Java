package Gun32_haziran09._01_Ornek;


public class OrnekEnum {

    enum Aylar {
        OCAK, ŞUBAT, MART, NİSAN, MAYIS, HAZİRAN, TEMMUZ, AGUSTOS,
        EYLÜL, EKİM, KASIM, ARALIK
    }

    public static void main(String[] args) {

        Aylar ay = Aylar.ŞUBAT;

        switch (ay) {
            case ŞUBAT:
                System.out.println(28);
                break;
            case OCAK:
            case MART:
            case MAYIS:
            case TEMMUZ:
            case AGUSTOS:
            case EKİM:
            case ARALIK:
                System.out.println(31);
                break;
            case NİSAN:
            case HAZİRAN:
            case EYLÜL:
            case KASIM:
                System.out.println(30);
                break;
        }

        System.out.println("ay = " + ay); //görünen simge
        System.out.println("ay.name() = " + ay.name());  //görünen simge
        System.out.println("ay.ordinal() = " + ay.ordinal()); //indexini


        for (Aylar a : Aylar.values() )
            System.out.println(a.ordinal()+"= " + a);

        if (ay==Aylar.ŞUBAT)
            System.out.println("Zam ayı");
    }
}
