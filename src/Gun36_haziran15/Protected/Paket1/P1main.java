package Gun36_haziran15.Protected.Paket1;
//aynı paketin içindeki erişim düzeylerini gördük.
public class P1main {
    public static void main(String[] args) {
        P1Hayvan h=new P1Hayvan();
        h.ad="karakedi"; // public erişildi.
        h.yas=2;// default erişildi
        h.cinsi="tekir"; // protected erişildi
//                h.renk private: sadece kendi classın içinden ulaşabilir.
//                    get set ile ulaşılabiliri.

        //access modifier

    }
}
