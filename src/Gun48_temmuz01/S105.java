package Gun48;

public class S105 {

        int x, y;

        public S105(int x, int y) {
            initialize(x, y);
        }

        public void initialize(int x, int y) {
            this.x = x * x; // 81
            this.y = y * y; //25
        }

        public static void main(String[] args) {
            int x = 9, y = 5;
            S105 obj = new S105(x, y);

            System.out.println(obj.x + " " + obj.y); // 81 25
            System.out.println(x + " " + y); // 9 5
        }

}
