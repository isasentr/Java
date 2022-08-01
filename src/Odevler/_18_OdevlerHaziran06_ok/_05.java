package Odevler._18_OdevlerHaziran06_ok;

public class _05 {

    //    - {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}
//    int 2D arrayini oluşturunuz.
//            2D arrayinden max number print ediniz.
    public static void main(String[] args) {

        int[][] tablo = {{1, 2, 3}, {2, 3, 1}, {5, 5, 5}, {2, 10, 3}};

        System.out.println("maxNumber="+maxNumber(tablo));
    }

    public static int maxNumber(int[][] tablo1){
        int enb = tablo1[0][0];
        for (int i = 0; i < tablo1.length; i++) {
            for (int j = 0; j < tablo1[i].length; j++) {
//                if (tablo[i][j] > enb)
//                    enb = tablo[i][j];

                enb=Math.max(enb,tablo1[i][j]);
            }
        }
       return enb;
    }
}