package Gun48.p2;

import Gun48.p1.Acc;

import java.util.ArrayList;

public class Test extends Acc {

    public void hesapla(){
        // r ve s ye buradan da erişebiliriz.
    }

    public static void main(String[] args) {
        Acc obj=new Test();
        obj.s =5;  // obj üzerinden sadece s ye ulaşılabilir

        Test t = new Test();
        t.r=5; // protected olanlara inheritance yapmış class
        t.s=6; // lardan ulaşılabilir.
    }

}
//    int p;    default : sadece kendi paketinden
//private int q; sadece kendi class ın dan
//        protected int r; sadece inheritance yolu
//        ile ulaşılabilir. diğer paketten direk erişilemez