package Gun46;

public class S71 {
    public static void main(String[] args) {

        int [][]  arr =new int[2][4];
        arr[0]=new int[]{1,3,5,7};
        arr[1]=new int[]{1,3};

        System.out.println("arr.length = " + arr.length); // satır sayısı demek
        System.out.println("1.Satırın sutun sayısı = " + arr[0].length); // sutun sayısı demek
        System.out.println("2.Satırın sutun sayısı = " + arr[1].length); // sutun sayısı demek

        for (int[] a: arr){
            for (int i=0; i< arr.length;i++){
                System.out.print( a[i]+  "");
                break;
            }
            System.out.println();
        }

    }
}
