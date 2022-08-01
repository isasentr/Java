package Odevler._22_OdevlerHaziran17.Soru_1;

import Z_1_Test._01_Soru.IAnimal;

import java.util.ArrayList;
import java.util.Collections;

public class animalMain {
    /*
    1-  Yanda Ekli tasarıma göre: (animal)

Ekteki Tasarıma göre gerekli modülleri yazınız.
Sonra her birinden nesne üretiniz.

- ürettiğiniz nesneleri bir ArrayListe ekletip, daha sonra bu ArrayList i
bir döngü ile metodlarını ekrana yazdırınız.
     */
    public static void main(String[] args) {
        ArrayList<Ianimal> list = new ArrayList<>();
        Swallow slist = new Swallow("etcil", "kuş türü");
        list.add(slist);
        Duck dlist = new Duck("pekin", "yabani");
        list.add(dlist);
        Shark hlist = new Shark("cam göz", "deniz");
        list.add(hlist);
        Cat clist = new Cat("van", "turkey");
        list.add(clist);

        for (Ianimal hayvan : list) {
            System.out.println(hayvan.getClass().getSimpleName());
            System.out.println("_______________");
            if (hayvan instanceof Swallow) {
                System.out.println("türü ve habitaı =" + ((Swallow) hayvan).getSpecies() + "," + ((Swallow) hayvan).getHabitat());
                System.out.println("beslenme=" + hayvan.food());
                System.out.println("uçuş  yeteneği=" + ((Swallow) hayvan).getflying());
                System.out.println();
            }
            if (hayvan instanceof Duck) {
                System.out.println("türü ve habitaı =" + ((Duck) hayvan).getSpecies() + "," + ((Duck) hayvan).getHabitat());
                System.out.println("beslenme=" + hayvan.food());
                System.out.println("uçuş  yeteneği=" + ((Duck) hayvan).getflying());
                System.out.println();
            }

            if (hayvan instanceof Shark) {
                System.out.println("türü ve habitaı =" + ((Shark) hayvan).getSpecies() + "," + ((Shark) hayvan).getHabitat());
                System.out.println("beslenme=" + hayvan.food());
                System.out.println("uçuş  yeteneği=" + ((Shark) hayvan).getsailing());
                System.out.println();
            }
            if (hayvan instanceof Cat) {
                System.out.println("türü ve habitaı =" + ((Cat) hayvan).getSpecies() + "," + ((Cat) hayvan).getHabitat());
                System.out.println("beslenme=" + hayvan.food());
                System.out.println();
            }
        }
    }
}
