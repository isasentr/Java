package Odevler._18_OdevlerHaziran06_ok;

public class _06 {
//    {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}
//    int 2D arrayini oluşturunuz.
//            2D arrayinden min number print ediniz.

    public static void main(String[] args) {

        int[][] tablo = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 1, 3}};

        System.out.println("minNumber="+minNumber(tablo));

    }
    public static int minNumber( int[][] tablo ){
        int enk = tablo[0][0];
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                enk=Math.min(enk,tablo[i][j]);
            }
        }
       return enk;
    }
}





