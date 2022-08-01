package Gun30_haziran07.Soru1;

public class hesap {
    private int yatan=0;
    private  int cekilen=0;
    private int bakiye=0;


    public void paraYtir ( int gelenPara){
        this.bakiye+=gelenPara;
        this.yatan+=gelenPara;
    }

    public void paracek ( int cekilenpara) {
        if (this.bakiye < cekilenpara) {
            System.out.println("Bakiye yetersiz");
        } else {
            this.bakiye -= cekilenpara;
            this.yatan -= cekilenpara;
        }
    }

    @Override
    public String toString() { // generate ile to string yazdı otomatik geldi
        return "hesap{" +
                "yatan=" + yatan +
                ", cekilen=" + cekilen +
                ", bakiye=" + bakiye +
                '}';
    }
}
