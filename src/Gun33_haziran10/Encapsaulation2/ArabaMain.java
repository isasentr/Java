package Gun33_haziran10.Encapsaulation2;

public class ArabaMain {
    public static void main(String[] args) {
        Araba araba1 = new Araba();
        araba1.setRenk("Kırmızı");
        araba1.setModel("sedan");
        araba1.setMotorHacmi(1800);
        araba1.setKapısayisi(4);

        System.out.println("araba1 = " + araba1);

        System.out.println("araba1.getModel() = " + araba1.getModel());
    }

    //Kural : genel yazılım kuralıdır.
    //bütün değişkenler private yapılır.
    //yani Kapsülleme ile kullanılır.
    // eğer gerekiyorsa private kaldırılır.
    
}
