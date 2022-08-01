package Gun33_haziran10.EnumEk;

public enum Aylar {
    OCAK(1, 31, "Ocak"),
    ŞUBAT(2, 28, "Şubat"),
    MART(3, 31, "Mart"),
    NİSAN(4, 30, "Nisan"),
    MAYIS(5, 31, "Mayıs"),
    HAZİRAN(6, 30, "Haziran"),
    TEMMUZ(7, 31, "Temmuz"),
    AGUSTOS(8, 30, "Ağustos"),
    EYLÜL(9, 31, "Eylül"),
    EKİM(10, 30, "Ekim"),
    KASIM(11, 30, "Kasım"),
    ARALIK(12, 31, "Aralık"),
    ;

   final int ayNo;
    final  int gunMiktar;
    final String isim;

    Aylar(int ayNo, int gunMiktar, String isim) {
        this.ayNo = ayNo;
        this.gunMiktar = gunMiktar;
        this.isim = isim;
    }
}
