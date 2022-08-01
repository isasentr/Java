package Gun46;

public class S18 {
    public static void main(String[] args) {
        String[][] chs=new String[5][2];
        chs[0]=new String[4]; // 1.satır uzunluğu 2
        chs[1]=new String[5]; // 2.Satır uzunluğu 5

        int i=97;

        for (int a=0;a< chs.length;a++){  // 5
            for (int b=0; b< chs.length;b++){ //5 chs[a].length
                chs[a][b]=""+i;
                i++;
            }
        }
        // Her bir satırı sütun sayısı kadar gitmesi gerekirken
        // Her bir satırı kendi sutun sayısı kadar ilerletttiği için hata veriyor
        // çünkü 0 indexli satır sutun sayısı 2 , yani 0 veya 1 olabilir.

        for (String[] ca:chs){
            for (String c:ca){
                System.out.println(c+" ");
            }
            System.out.println();
        }
    }
}
