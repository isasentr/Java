package Gun43_haziran24;

public class _01_JavaRuntimeException {
    public static void main(String[] args) {

        System.out.println("Program çalıştı");

        String kelime = "";
        if (kelime.length() > 3)
            kelime.charAt(3);

        System.out.println("Program bitti");


        //daha Program çalışmadan önce oluşmuş eksiklerden
        // kaynaklı hatalara derleme zamanıyani Compile error/ Exception diyoruz.

        //Program çalıştıktan sonra çalışma zamanı içerisindeki hatalara
        // çalışma zamanı yani RUNTIME ERROR, Exception diyoruz.

    }
}
