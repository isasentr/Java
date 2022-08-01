package Gun46;

public class SEk1 {
    public static void main(String[] args) {

        String[][] chs=new String[2][2];
        chs[0]=new String[4];
        chs[1]=new String[5];

        int i=97;

        for (int a=0;a< chs.length;a++){  // 5
            for (int b=0; b< chs.length;b++){ //5 chs[a].length
                chs[a][b]=""; // yeni oluşturduğu için
                chs[a][b]=chs[a][b].concat(" "+i);  // var olaana ekleme yapmaya çalışıyor ama var olan NULL
                i++;
            }
        }

        for (String[] ca:chs){
            for (String c:ca){
                System.out.println(c+" ");
            }
            System.out.println();
        }
    }
}
