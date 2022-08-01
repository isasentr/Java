package Gun40_haziran21.Ornek_4;

import java.util.ArrayList;

public class TechnoCafe {

    public static void menu() {
        System.out.println("******Menü******");
        System.out.print("1-Adana Kebap (55 TL)\n" +
                "2-Lahmacun (33 TL)\n" +
                "3-Borsh (33 TL)\n" +
                "4-Palov (44 TL)\n" +
                "0-Tamam\n");
    }

    public static void liste(ArrayList<TechnoCafe> siparis, int secim) {
        if (secim == 1) {
            siparis.add(new AdanaKebab());
        } else if (secim == 2) {
            siparis.add(new Lahmacun());
        } else if (secim == 3) {
            siparis.add(new Borsh());
        } else if (secim == 4) {
            siparis.add(new Palov());
        }
    }

    public static double adet(ArrayList<TechnoCafe> siparis) {
        double toplam = 0;
        for (TechnoCafe m : siparis) {
            if (m instanceof AdanaKebab) {
                toplam += ((AdanaKebab) m).ucret();
            } else if (m instanceof Lahmacun) {
                toplam += ((Lahmacun) m).ucret();
            } else if (m instanceof Borsh) {
                toplam += ((Borsh) m).ucret();
            } else if (m instanceof Palov) {
                toplam += ((Palov) m).ucret();
            }
        }
        return toplam;
    }

    public static void Yazdir(ArrayList<TechnoCafe> siparis) {
        for (TechnoCafe m : siparis) {
            if (m instanceof AdanaKebab) {
                System.out.println("*"+m.getClass().getSimpleName()+"*");
                ((AdanaKebab) m).grill();
                ((AdanaKebab) m).marinadel();
                ((AdanaKebab) m).taste();
            } else if (m instanceof Lahmacun) {
                System.out.println("*"+m.getClass().getSimpleName()+"*");
                ((Lahmacun) m).dough();
                ((Lahmacun) m).addMeat();
                ((Lahmacun) m).bake();
                ((Lahmacun) m).taste();
            } else if (m instanceof Borsh) {
                System.out.println("*"+m.getClass().getSimpleName()+"*");
                ((Borsh) m).boil();
                ((Borsh) m).eatTomorrow();
                ((Borsh) m).taste();
            } else if (m instanceof Palov) {
                System.out.println("*"+m.getClass().getSimpleName()+"*");
                ((Palov) m).fry();
                ((Palov) m).boil();
                ((Palov) m).taste();
            }
        }
    }
}


