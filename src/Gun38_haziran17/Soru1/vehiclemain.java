package Gun38_haziran17.Soru1;

import java.util.ArrayList;

public class vehiclemain {
    public static void main(String[] args) {
        teslacar tesla = new teslacar("model 5", 310);
        toyotaprius toyo = new toyotaprius("pirus", 1200);
        bus busu = new bus("iveco", 7000);

        ArrayList<Vehicle> arabalar = new ArrayList<>();
        arabalar.add(tesla);
        arabalar.add(toyo);
        arabalar.add(busu);


        for (Vehicle v : arabalar) {
            System.out.println();
            System.out.println(v.getClass().getSimpleName());
            System.out.println("-----------------");

            System.out.println("v.getModel() = " + v.getModel());
            System.out.println("v.getEngine() = " + v.getEngine());

            if (v instanceof teslacar ){
                System.out.println(((teslacar)v).drive());
                System.out.println(((teslacar)v).changebattery());
            }
            if (v instanceof toyotaprius ){
                System.out.println(((toyotaprius)v).changebattery());
                System.out.println(((toyotaprius)v).drive());
                System.out.println(((toyotaprius)v).changeoil());
            }

            if (v instanceof bus ){
                System.out.println(((bus)v).drive());
                System.out.println(((bus)v).changediesel());
            }
        }
    }
}
