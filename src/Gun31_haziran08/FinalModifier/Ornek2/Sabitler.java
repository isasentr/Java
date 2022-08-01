package Gun31_haziran08.FinalModifier.Ornek1;

public class Sabitler {

    final static int birgundekisaatsayisi = 24;
    final static int birsaatdekidakikasayisi = 60;
    final static int birdakikadakiisaniyesayisi = 60;


    public static int hesapla(int gun,
                              int saat,
                              int dak){
        int toplamSaniye = gun * birgundekisaatsayisi * birsaatdekidakikasayisi * birdakikadakiisaniyesayisi + saat * birsaatdekidakikasayisi * birdakikadakiisaniyesayisi + dak * birdakikadakiisaniyesayisi;

        return toplamSaniye;
    }
}
