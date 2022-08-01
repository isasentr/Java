package Gun37_haziran16.Ornek3;

public class geometri {
    public static void main(String[] args) {
        //bir interface in birden fazla class tarafından implimente edilmesi
        cember c = new cember(); // bütün metodlara erişim var
        c.ciz();

        dikdortgen d = new dikdortgen();
        d.ciz();

//interfacelerden nesne üretilen fakat referans tipi
        //oluşturmaktadır.bu size polymorphism sağladı.
        Icizdirir c2 = new cember(); // direkolarak sadece nterface
        // deki//isim verlmişolanlar metodlara çıkanilir.
        c2.ciz();
    }
}
