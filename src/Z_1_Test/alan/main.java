package Z_1_Test.alan;

public class main {
    public static void main(String[] args) {
        daire dr1 = new daire(10);
        System.out.println("dr1.getalan() = " + dr1.getalan());
        System.out.println("dr1.getcevre() = " + dr1.getcevre());

        dikdörtgen dk1=new dikdörtgen(3,4);
        System.out.println("dk1.getalan = " + dk1.getalan());
        System.out.println("dk1.getcevre = " + dk1.getcevre());

        kare kr1=new kare(3);
        System.out.println("kr1.getalan() = " + kr1.getalan());
        System.out.println("kr1.getcevre() = " + kr1.getcevre());
    }
}
