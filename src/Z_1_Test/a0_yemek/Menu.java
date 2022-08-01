package Z_1_Test.a0_yemek;

import java.util.ArrayList;

public class Menu {
    public static void menulist() {
        System.out.println("----MENU---");
        System.out.print(
                "1-Adana Kebap (55 TL)\n" +
                        "2-Lahmacun (33 TL)\n" +
                        "3-Borsh (33 TL)\n" +
                        "4-Palov (44 TL)\n" +
                        "0-Tamam\n");
    }

    public static void list(ArrayList<Menu> list, int secim) {
        if (secim == 1) {
            list.add(new AdanaKebab());
        } else if (secim == 2) {
            list.add(new Lahmacun());
        } else if (secim == 3) {
            list.add(new Borsh());
        } else if (secim == 4) {
            list.add(new Palov());
        }
    }

    public static double tutar(ArrayList<Menu> list) {
        double toplam = 0;
        for (Menu m1 : list) {
            if (m1 instanceof AdanaKebab) {
                toplam += ((AdanaKebab) m1).ucret();
            } else if (m1 instanceof Lahmacun) {
                toplam += ((Lahmacun) m1).ucret();
            } else if (m1 instanceof Borsh) {
                toplam += ((Borsh) m1).ucret();
            } else if (m1 instanceof Palov) {
                toplam += ((Palov) m1).ucret();
            }
        }
        return toplam;
    }

    public static void Yazdir(ArrayList<Menu> list) {
        System.out.println("Açıklama--------------");
        for (Menu m1 : list) {
            if (m1 instanceof AdanaKebab) {
                System.out.println("*" + m1.getClass().getSimpleName());
                ((AdanaKebab) m1).marinade();
                ((AdanaKebab) m1).grill();
                ((AdanaKebab) m1).taste();
                System.out.println();
            } else if (m1 instanceof Lahmacun) {
                System.out.println("*" + m1.getClass().getSimpleName());
                ((Lahmacun) m1).dough();
                ((Lahmacun) m1).topping();
                ((Lahmacun) m1).bake();
                ((Lahmacun) m1).taste();
                System.out.println();
            } else if (m1 instanceof Borsh) {
                System.out.println("*" + m1.getClass().getSimpleName());
                ((Borsh) m1).boil();
                ((Borsh) m1).eatTomorrow();
                ((Borsh) m1).taste();
                System.out.println();
            } else if (m1 instanceof Palov) {
                System.out.println("*" + m1.getClass().getSimpleName());
                ((Palov) m1).fry();
                ((Palov) m1).boil();
                ((Palov) m1).taste();
                System.out.println();
            }
        }
    }

    public static void ozet(ArrayList<Menu> list) {
        int sip1 = 0;
        double sip1fiyat = 0;
        int sip2 = 0;
        double sip2fiyat = 0;
        int sip3 = 0;
        double sip3fiyat = 0;
        int sip4 = 0;
        double sip4fiyat = 0;
        for (Menu m1 : list) {
            if (m1 instanceof AdanaKebab) {
                sip1fiyat = ((AdanaKebab) m1).ucret();
                sip1++;
            } else if (m1 instanceof Lahmacun) {
                sip2fiyat = ((Lahmacun) m1).ucret();
                sip2++;
            } else if (m1 instanceof Borsh) {
                sip3fiyat = ((Borsh) m1).ucret();
                sip3++;
            } else if (m1 instanceof Palov) {
                sip4fiyat = ((Palov) m1).ucret();
                sip4++;
            }
        }
        if (sip1 != 0) {
            System.out.println("AdanaKebab x " + sip1 + " ad x " + sip1fiyat + " TL");
        }
        if (sip2 != 0) {
            System.out.println("Lahmacun x " + sip2 + " ad x " + sip2fiyat + " TL");
        }
        if (sip3 != 0) {
            System.out.println("Borsh x " + sip3 + " ad x " + sip3fiyat + " TL");
        }
        if (sip4 != 0) {
            System.out.println("Palov x " + sip4 + " ad x " + sip4fiyat + " TL");
        }
    }
}

