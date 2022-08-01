package Gun28_haziran03._03_Soru;

import java.util.ArrayList;

public class Student {

    String name;
    int maxCredit;

    ArrayList<Lesson> dersleri = new ArrayList<>();

    public void dersEkle(Lesson ders) {
    //gelen dersin kredisi ile eklenecek dersin krediyi toplayım max kredinin altında kalıyor mu ?

        int toplamAlinanKredi=0;
        for( Lesson l:dersleri) {
            toplamAlinanKredi += l.credit;
        }
                    System.out.println("toplamAlinanKredi = " + toplamAlinanKredi);

        if (toplamAlinanKredi+ders.credit<=maxCredit){
            dersleri.add(ders);
            System.out.println("Eklendi = " + ders.name);
        }
        else
            System.out.println("Alınabilecek kredi aşıldı = " + ders.name);

    }
}
