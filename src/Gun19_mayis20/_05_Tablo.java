package Gun19_mayis20;

import java.util.Arrays;

public class _05_Tablo {
    public static void main(String[] args) {
        //  {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}  int 2D arrayini  olustur
        //   2D arrayinden max number print et

      //  int[][] tablo = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 10, 3}};

        int [][] tablo ={
                {1,2,3},
                {2,3,1},
                {5,5,5},
                {2,10,3}

        };

        int enb= tablo[0][0];

        System.out.println("satır="+tablo.length);
        System.out.println("1.satırın sütün sayısı = " + tablo[0].length);
        System.out.println("2.satırın sütün sayısı = " + tablo[1].length);
        System.out.println("3.satırın sütün sayısı = " + tablo[2].length);
        System.out.println("4.satırın sütün sayısı = " + tablo[3].length);

        for (int i = 0; i < tablo.length; i++) {// 4 e kadar tablo.lengh satır sayısı
            for (int j = 0; j < tablo[i].length; j++) {// 3 her satırın eleman sayısını veriyor yani 3
                if (tablo[i][j]>enb)
                    enb=tablo[i][j];

            }

        }
        System.out.println("enb = " + enb);

//        int enb = tablo[0][0];
//        for (int i = 0; i < 4; i++) {
//            for (int j = 0; j < 3; j++) {
//                enb=Math.max(enb,tablo[i][j]);
//
//          ikinci yöntem
//                if (enb < tablo[i][j]) {
//                    enb = tablo[i][j];
//                }
//            }
//        }
//        System.out.println("enb = " + enb);
    }
}
