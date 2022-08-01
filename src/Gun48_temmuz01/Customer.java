package Gun48;

public class Customer {
    ElectricAccount acct = new ElectricAccount();

    public void faturaYaz(){
        System.out.println("acct.getBill() = " + acct.getBill());
    }

    public void useElectricity(double kWh) {
        acct.addKWh(kWh);

    }


    public static void main(String[] args) {
        Customer c=new Customer();
        c.useElectricity(10);
        c.useElectricity(100);

        c.faturaYaz();
    }

}

class ElectricAccount {
    private double kWh;
    private double rate = 0.07;
    private double bill;

    //line n1
        public void addKWh(double kWh) {
            if (kWh > 0) {
                this.kWh += kWh;
                this.bill = this.kWh * this.rate;
            }
        }

    public double getBill() {
        return bill;
    }
}

//    public void addKWh(double kWh) {
//        this.kWh += kWh;
//        this.bill = this.kWh + this.rete;
//    }


//    public void addKWh(double kWh) {
//        if (kWh > 0) {
//            this.kWh += kWh;
//            this.bill = this.kWh + this.rete;
//        }
//    }


//    private void addKWh(double kWh) {
//        if (kWh > 0) {
//            this.kWh += kWh;
//            this.bill = this.kWh + this.rete;
//        }
//    }


//    public void addKWh(double kWh) {
//        if (kWh > 0) {
//            this.kWh += kWh;
//            setBill(this.kWh);
//        }
//    }
//
//    public void setBill(double kWh) {
//        bill = kWh * rate;
//    }