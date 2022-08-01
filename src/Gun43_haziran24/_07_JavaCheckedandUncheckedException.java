package Gun43_haziran24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _07_JavaCheckedandUncheckedException {
    public static void main(String[] args) {
        //Checked and unchecked Exception
        //Java derki yani yazılımcı bıraktığı hatalara Unchecked exception
        //ama öyle komutlar varki bana ait: bunları hata kontrolü yapmadan
        //yani try-catch e almadan kullanıma izin vermem. bu gibi hat durumlarına
        //checked yani kontrol ettiğim hatalara denir.


//1.yöntem tercih edilir.
        try {
            FileInputStream file = new FileInputStream("liste.txt");
        } catch (FileNotFoundException e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }

//bu komut dosya okuma işlemini başlatır. dosyayı açar
        try {
            dosyaAc();
        } catch (FileNotFoundException  e){
            System.out.println("dosya bulunamadı");
        }
    }

//2.yöntem çok kullnılmıyor.
    public  static void dosyaAc() throws FileNotFoundException {

        FileInputStream file=new FileInputStream("liste.txt");
    }
    }
