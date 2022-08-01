package Gun32_haziran09._03_Ornek;

import java.util.ArrayList;
import java.util.Scanner;

public class PizzaSiparisHattı {

    // Bir pizza sipariş hattı yapılmak isteniyor.
    // Kullanıcıya Pizza için 1-Small,2-Medium,3-Large, 4-Goster
    // seçeneklerini bir menü şeklinde vererek, verdiği pizzaları
    // bir ARRAYLIST e atınız.
    // Goster (4) ü seçtiğinde her pizzadan kaçar tane sipariş
    // verdiğini bir metodda yazdırınız.
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        ArrayList<Pizza> siparis = new ArrayList<>();

        int secim = 0;

        do {
            menu();
            secim = oku.nextInt();

            switch (secim) {
                case 1:
                    Pizza p1 = new Pizza(PizzaSize.Small);
                    siparis.add(p1);break;

                case 2:
                    Pizza p2 = new Pizza(PizzaSize.Medium);
                    siparis.add(p2);break;

                case 3:
                    Pizza p3 = new Pizza(PizzaSize.Large);
                    siparis.add(p3);break;

                case 4:siparisYaz( siparis);break;
            }
        } while (secim <=4);
    }

    public static  void menu(){

        System.out.println("*****PIZZA MENU*****");
        System.out.println("1-Small");
        System.out.println("2-Medium");
        System.out.println("3-Large");
        System.out.println("4-Islema Al");
        System.out.println("5-Çıkış");
        System.out.print("Seçim=");
    }
    public static void siparisYaz(ArrayList<Pizza> siparis){

        int smallCnt=0;
        int mediumCnt=0;
        int largeCnt=0;

        for (Pizza p : siparis){
            if (p.size==PizzaSize.Small) smallCnt++;
            if (p.size==PizzaSize.Medium) mediumCnt++;
            if (p.size==PizzaSize.Large) largeCnt++;
        }
        System.out.println();
        System.out.println("**Sipariş içeriği**");
        System.out.println("Large Pizza =" + largeCnt);
        System.out.println("Medium Pizza =" + mediumCnt);
        System.out.println("Small Pizza =" + smallCnt);
        System.out.println("Siparişiniz alınmıştır.");
        System.out.println();
    }

    //todo her pizza tipi için ücret belirleyerek toplam ücreti yazdırınız.
}
