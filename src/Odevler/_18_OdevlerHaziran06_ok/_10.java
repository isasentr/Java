package Odevler._18_OdevlerHaziran06_ok;
public class _10 {
//    String 2D array oluşturunuz.
//{{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}
//String de $ varsa 3.2 ile çarpın
//String de € varsa 4.2 ile çarpın
//double return ediniz.

    public static void main(String[] args) {
        String[][] tablo = {{"$12", "$22", "5$"}, {"€9", "€40", "$1", "$2"}, {"€12"}};

        System.out.println("toplam =" + toplam(tablo));
    }

    public static double toplam(String[][] tablo) {
        double islem = 0;
        for (int i = 0; i < tablo.length; i++) {
            for (int j = 0; j < tablo[i].length; j++) {
                if (tablo[i][j].contains("$")) {
                    String tutar1 = tablo[i][j].replaceAll("[^0-9]", "");
                    islem += Integer.parseInt(tutar1) * 3.2;

                } else if (tablo[i][j].contains("€")) {
                    String tutar1 = tablo[i][j].replaceAll("[^0-9]", "");
                    islem += Integer.parseInt(tutar1) * 4.2;
                }
            }
        }
        return islem;
    }
}
