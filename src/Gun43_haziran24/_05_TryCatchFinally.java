package Gun43_haziran24;

public class _05_TryCatchFinally {
    public static void main(String[] args) {
        long startTime = 0;
        String str = "";

        try {
            startTime = System.currentTimeMillis();
            System.out.println("hatadan önceki nokta");
            char ilkharf = str.charAt(0);
            System.out.println("hatadan sonraki nokta");

        } catch (Exception hata) {

            System.out.println("catch bloğu çalıştı."); hata.printStackTrace();
        } finally { // try catch in finali
            long gecensure = System.currentTimeMillis() - startTime;
            System.out.println("gecensure = " + gecensure);
            System.out.println("try-catch bloğu ile ilgili son yapılacaklar");
            //hata olsun veya olmasın çalışacak final bölümü,
            //her zman çalışır
            //kullanım sebebi try catch in içinde yapılmış.
            //işlemlerde arta kalan kapama gibi bu bölüme ait işlemler
            //yapılarak kod düzeni sağlanmış olur.
        }

        System.out.println("try-catch bloğundan sonra çalışan kısım");
    }
}
