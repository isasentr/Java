package Gun02;

public class _03_EscapeCharacter {
    public static void main(String[] args) {

// Escape Character
        // \n -> Yeni satır açıyor
        // \t -> Tab tuşuna başılmış etkisi yapıyor.
        // \b -> BackSpace basılmış gibietki yapar, yani 1 karakter geri siler.
        // \" -> Çift tırnak yazar.
        // \\ -> \ işaretini koyar.
        // \r -> Satır başına kadar olan karakterlerin hepsini siler

        System.out.println("Merhaba Dünya");
        System.out.println("Merhaba \nDünya");
        System.out.println("Merhaba \tDünya");
        System.out.println("Merhaba \bDünya");
        System.out.println("Merhaba \"Dünya");
        System.out.println("Merhaba \\Dünya");
        System.out.println("Merhaba \rDünya");
    }
}
