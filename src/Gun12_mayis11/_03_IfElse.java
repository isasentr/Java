package Gun12_mayis11;

import java.util.Scanner;

public class _03_IfElse {
    // Otopark ücretleri :
    // 3 saate kadar 10 tl, 5 saate kadar 15 tl, 10 saate kadar 20 tl  dir.
    // kullanıcıdan kac saat kaldıgını alarak ucretı yazdırınız
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Otoparkda kaç saat kaldınız :");
        int saat = oku.nextInt();

        if (saat<=3){
            System.out.print("Otopark ücreti:10 TL dir.");
        }else{
            if (saat<=5){
                System.out.print("Otopark ücreti:15 TL dir.");
            }else{
                System.out.print("Otopark ücreti:20 TL dir.");
            }
        }
    }
}
