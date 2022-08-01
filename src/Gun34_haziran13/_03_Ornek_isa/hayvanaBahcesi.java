package Gun34_haziran13._03_Ornek_isa;

public class hayvanaBahcesi {
    public static void main(String[] args) {
        ordek o1 = new ordek("beyaz", 2, "pekin", 3);
        o1.konustu();

        kopek o2 =new kopek("sari",15,"husky");
        o2.konustu();

        yilan o3 =new yilan("benekli",55,"boga",5);
        o3.konustu();

        System.out.println(o3.toString());

        System.out.println("o3 = " + o3);

    }
}
