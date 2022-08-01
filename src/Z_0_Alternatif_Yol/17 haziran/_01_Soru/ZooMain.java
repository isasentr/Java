package Z_1_Test._01_Soru;

import java.util.ArrayList;

public class ZooMain {
    public static void main(String[] args) {
        ArrayList<IAnimal> list=new ArrayList<>();
        Swallow kirlangıc=new Swallow("Kahverengi", "Sıcak ve sulak açık alanlar");
        list.add(kirlangıc);
        Cat kedi=new Cat("Bombay Cat", "India");
        list.add(kedi);
        Shark Kbaligi=new Shark(25, "Tiger Shark");
        list.add(Kbaligi);
        Duck ordek=new Duck ("Ancona", "United Kingdom");
        list.add(ordek);

        for (IAnimal hayvan : list ) {
            System.out.println(hayvan.getClass().getSimpleName());
            System.out.println("********************************");
            if (hayvan instanceof Swallow) {
                System.out.println("Rengi ve habitatı= " + ((Swallow) hayvan).getColor()
                        + ", " + ((Swallow) hayvan).getHabitat());
                System.out.println("Beslenme= " + hayvan.food());
                System.out.println("Uçuş bilgisi= " + ((Swallow) hayvan).getFlying());
            }

            if (hayvan instanceof Cat) {
                System.out.println("Türü ve habitatı= " + ((Cat) hayvan).getSpecies()
                        + ", " + ((Cat) hayvan).getHabitat());
                System.out.println("Beslenme= " + hayvan.food());
            }
            if (hayvan instanceof Shark) {
                System.out.println("Türü ve habitatı= " + ((Shark) hayvan).getSpecies()
                        + ", " + ((Shark) hayvan).getLifeSpan());
                System.out.println("Yüzme bilgileri= " + ((Shark) hayvan).getSailing());
                System.out.println("Beslenme= " + hayvan.food());
            }

            if (hayvan instanceof Duck) {
                System.out.println("Türü ve habitatı= " + ((Duck) hayvan).getSpecies()
                        + ", " + ((Duck) hayvan).getHabitat());
                System.out.println("Yüzme bilgileri= " + ((Duck) hayvan).getSailing());
                System.out.println("Uçma bilgileri= " + ((Duck) hayvan).getFlying());
                System.out.println("Beslenme= " + hayvan.food());
            }



        }

    }
}
