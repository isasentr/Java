package Z_0_Alternatif_Yol;

import java.util.Scanner;

public class _17_Odev1 {
    public static void main(String[] args) {
        //10-Kullanıcından 10 sayı isteyiniz, eğer sonra girilen
        // önce girilenden büyük ise döngü sonlansın.


        Scanner oku=new Scanner(System.in);

        int sonraki=0;
        for(int i=0;i<10;i++){

            System.out.print("Sayı giriniz=");
            int sayi=oku.nextInt();

            if (sonraki > sayi)
                 break;

            sonraki=sayi;
        }




    }
}
