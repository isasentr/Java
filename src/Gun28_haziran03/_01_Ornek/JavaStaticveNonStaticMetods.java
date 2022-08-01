package Gun28_haziran03._01_Ornek;

public class JavaStaticveNonStaticMetods {
    public static void main(String[] args) {

        //1.yöntem Javanın kendi metodları ile yapılan çevirme işleri
        int sayi = 345;
        String strRakam = String.valueOf(sayi);
        int intRakam = Integer.parseInt(strRakam);


        //2.Yöntem kendi sınıfımı yazayım ve oradan kullanayım
        Utility util = new Utility();
        strRakam = util.getString(sayi);
        intRakam= util.getInt(strRakam);

        //3.yöntem
        Math.max(3,4);
        strRakam=Utility.getString2(sayi);
        intRakam=Utility.getInt2(strRakam);

        System.out.println("intrakam "+intRakam);
        System.out.println("strRakam = " + strRakam);
    }
}
