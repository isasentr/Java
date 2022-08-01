package Gun47;
public class S73 {
    int x;
    int y;

    public void doStuff(int x, int y) { // 100  200
        x = x;  // parametreyi parametreye atadın x=100
        y = this.y; // parametre y, y=0

//        this.x=x; // this.x field , x ise parametreyi
//        this.y=y;
        // başında this yoksa parametredir.
    }

    public void display() {
        System.out.println(x + " " + y + " : ");
    }

    public static void main(String[] args) {
        S73 m1 = new S73();
        m1.x = 100;
        m1.y = 200;

        S73 m2 = new S73();
        m2.doStuff(m1.x, m1.y);

        m1.display();
        m2.display();
    }

}
