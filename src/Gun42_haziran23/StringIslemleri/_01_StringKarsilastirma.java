package Gun42_haziran23.StringIslemleri;

public class _01_StringKarsilastirma {
    public static void main(String[] args) {

        String cumle1 = "bugün hava çok güzel";
        String cumle2 = "bugün hava çok güzel";
        String cumle3 = new String("bugün hava çok güzel");
        String cumle4 = new String("bugün hava çok güzel");


        if (cumle1==cumle2) // ilkel tipler için Değerleri aynı mı, Nesneleriçin aynı nesne mi //eşit
            System.out.println("eşit");
        else
            System.out.println("eşit değil");

        if (cumle1.equals(cumle2)) // ilkel tipler ve Nesneler için değerler aynı mı  //eşit
            System.out.println("eşit");
        else
            System.out.println("eşit değil");



        //**********************************nesneler için sonuclar
        if (cumle3==cumle4) // ilkel tipler için Değerleri aynı mı, Nesneler için aynı nesne mi  //eşit değil
            System.out.println("eşit");
        else
            System.out.println("eşit değil");

        if (cumle3.equals(cumle4)) // ilkel tipler ve Nesneler için değerler aynı mı   //eşit
            System.out.println("eşit");
        else
            System.out.println("eşit değil");


        if (cumle3==cumle2) // ilkel tipler için Değerleri aynı mı, Nesneler için aynı nesne mi //eşit değil
            System.out.println("eşit");
        else
            System.out.println("eşit değil");

        if (cumle3.equals(cumle2)) // ilkel tipler ve Nesneler için değerler aynı mı //eşit
            System.out.println("eşit");
        else
            System.out.println("eşit değil");


//        eşitlik olunca nesneleri karşılaştırıyor, equals olunca değerleri karşılaştırıyor.

    }
}