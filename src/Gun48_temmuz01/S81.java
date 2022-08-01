package Gun48;


public class S81 {
    int id;
    String name;

    public S81(int id, String name) {
        this.id = id;
        this.name = name;

    }


    public static void main(String[] args) {

        S81 p1= new S81(101, "Pen");
        S81 p2=  new S81(101, "Pen");
        S81 p3= p1;

        boolean ans1= p1==p2; // 2 tane mehmet kişisi var , aynı kiler mi  HAYIR
        boolean ans2= p1.name.equals(p2.name); // peki isimleri aynı mı    EVET
        System.out.println(ans1 + ":"+ ans2);

        boolean ans3= p1==p3; // adı mehmet göbek adı ali yani aynı kişi
        System.out.println("ans3 = " + ans3);
    }
}
// And given the code fragment:

//    4. Product p1= new Product(101, "Pen");
//    5. Product p2=  new Product(101, "Pen");
//    6. Product p3= p1;
//    7. boolean ans1= p1==p2;
//    8. boolean ans2= p1.name.equals(p2.name);
//    9. System.out.println(ans1 + ":"+ ans2);
