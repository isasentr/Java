package Gun43_haziran24;

public class _04__JavaTryCatch {
    public static void main(String[] args) {
        String str = "Bugün";
        int a = 5;
        int b = 0;
        int c = 0;

        // catch blockarında hangi hata önce geliyorsa ona uygun hata adı yazılır. genel exception en sona yazılır.
        try {
            System.out.println("1.adım");
            char ilkharf = str.charAt(0); // hata olduğu anda devamı çalışmaz uygun catch gider
            System.out.println("2.adım");
            c = a / b;
            System.out.println("3.adım");

        } catch (StringIndexOutOfBoundsException hata) // burada özel hata ismi yazlırsa , ilgili hata gelirse
        // catch kısmı çalışır. ilgili hatanın dışında başka hata gelirse bunun için başka bölüm olmadığından program kırılır.
        {
            System.out.println("kelime boş olduğu için harf alınamadı");
        } catch (ArithmeticException hata) {
            System.out.println("sayı sıfıra bölünemez");
        } catch (Exception hata) // hangi hata olurssa olsun hata olduğunda Exception catch çalışır.
        {
            System.out.println(hata.getMessage());
        }
    }
}
