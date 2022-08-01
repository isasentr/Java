package Gun39_haziran20.Ornek_2;
//1- içinde name field ı olan Sekil isimli bir Abstract Class yazınız.
//2- Bu classın Alan ve cevre abstract metodları
//ve içind eAlan ve cevre nin sonucu olan toString somut metodu,
//sekilin adını veren getName somut metodu ve ciz isimli somut metodlarını ekleyiniz.
//3- Bu sınıftan Dikdörtgen ve Daire isimli 2 class oluşturunuz.
//4- Bunlardan birer örnek main metodunda çalıştırınız.
public abstract class Sekil {
    private String name;
    public abstract double alan();
    public abstract double cevre();
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void ciz() {
        System.out.println(this.name + " isimli şekil çizildi.");
    }
    @Override
    public String toString() {
        return "Sekil{" +
                "name='" + name + '\'' +
                "alan='" + Math.round(alan()) + '\'' +
                "cevre='" + Math.round(cevre()) + '\'' +
                '}';
    }
}
