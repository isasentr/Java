package Gun46;

public class S16 {
    public static void main(String[] args) {

        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");   // 00 -> A   01 -> B   10-> D  11-> E

                if (arr[i][j].equals("B")) {
                    break;
                }

            }
            continue;
        }
    }
}
