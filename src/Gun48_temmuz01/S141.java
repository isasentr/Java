package Gun48;

    public class S141 {

        String name;
        boolean contract;
        double salary;

        S141() {
            // line n1
            this("Joe", true, 100);
        }

        public S141(String name, boolean contract, double salary) {
            this.name = name;
            this.contract = contract;
            this.salary = salary;
        }

        public String toString() {

            return name + ":" + contract + ":" + salary;
        }

        public static void main(String[] args) {
            S141 e = new S141();
            // line n2
            System.out.println(e);


//            //   Replace line n2 with:
//            e.name = "Joe";
//            e.contract = true;
//            e.salary = 100;
//
//            //   Replace line n2 with:
//            this.name = "Joe";
//            this.contract = true;
//            this.salary = 100;
//
//            //   Replace line n1 with:
//            this.name = new String("Joe");
//            this.contract = new Boolean(true);
//            this.salary = new Double(100);

            //   Replace line n1 with:
//            name = "Joe";
//            contract =TRUE;
//            salary=100.Of;
//
//            //   Replace line n1 with:
//            this("Joe", true, 100);
        }
    }

