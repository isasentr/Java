package Gun48;


    public class S107 {
        int x, y;

        public S107(int x, int y) {
            initialize(x, y);
        }

        public void initialize(int x, int y) {

            this.x = x * x;
            this.y = y * y;

        }

        public static void main(String[] args) {
            int x = 3, y = 5;
            S107 obj = new S107(x, y);
            System.out.println(x + " " + y);
        }
    }


