package Z_1_Test;

public class a6 {
    public static void main(String[] args) {
        String[][] array = {{"$12", "$22", "5$"}, {"€9", "€40", "$1", "$2"}, {"€12"}};

        System.out.println("getSum(array) = " + getSum(array));


        int a=5;
        System.out.println(String.valueOf(a));
    }

    public static double getSum(String[][] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j].contains("$")) {
                    String para1 = array[i][j].replaceAll("\\$", "");
                    sum = sum + Integer.parseInt(para1)*3.2;
                } else if (array[i][j].contains("€")) {
                    String para2 = array[i][j].replaceAll("€", "");
                    sum = sum + Integer.parseInt(para2)*4.2;
                }
            }
        }
        return sum;
    }





}