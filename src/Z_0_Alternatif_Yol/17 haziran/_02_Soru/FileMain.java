package Z_1_Test._02_Soru;

import java.util.ArrayList;

public class FileMain {
    public static void main(String[] args) {
        ArrayList<File> list=new ArrayList<>();
        File txt=new TxtFile("Encapsulation.txt", "10 MB");
        File ppt=new PowerPointFile("Inheritance.ppt", "25 MB");
        File dmg=new DMGFile("Methods.dmg", "12 MB");
        File exe=new EXEFile("Loops.exe", "11 MB");
        list.add(txt);
        list.add(ppt);
        list.add(dmg);
        list.add(exe);

        for (File file : list )
        {
            file.Acilis(file.getFileName());

            if (file instanceof TxtFile) {
                System.out.println("1. işlem = " + ((TxtFile) file).open());
                System.out.println("2. işlem = " + ((TxtFile) file).read());
                System.out.println("3. işlem = " + ((TxtFile) file).save());
                System.out.println("4. işlem = " + ((TxtFile) file).close());
            }

            if (file instanceof PowerPointFile) {
                System.out.println("1. işlem = " + ((PowerPointFile) file).open());
                System.out.println("2. işlem = " + ((PowerPointFile) file).read());
                System.out.println("3. işlem = " + ((PowerPointFile) file).save());
                System.out.println("4. işlem = " + ((PowerPointFile) file).close());

            }
            if (file instanceof DMGFile) {
                System.out.println("1. işlem = " + ((DMGFile) file).open());
                System.out.println("2. işlem = " + ((DMGFile) file).read());
                System.out.println("3. işlem = " + ((DMGFile) file).save());
                System.out.println("4. işlem = " + ((DMGFile) file).close());
            }
            if (file instanceof EXEFile) {
                System.out.println("1. işlem = " + ((EXEFile) file).open());
                System.out.println("2. işlem = " + ((EXEFile) file).read());
                System.out.println("3. işlem = " + ((EXEFile) file).save());
                System.out.println("4. işlem = " + ((EXEFile) file).close());
            }

        }

        System.out.println();
        System.out.println("Sistemden çıkılıyor...");
    }
}
