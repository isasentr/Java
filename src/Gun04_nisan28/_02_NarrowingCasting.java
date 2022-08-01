package Gun04;

public class _02_NarrowingCasting {
    public static void main(String[] args) {
        double oran=3.2;
        int sayi=5;

        sayi= (int)oran; // double tipindeki 3.2 degeri int tipine atıldı.
        // bu tip dönüşüme daraltma yönünde olduğundan Narrowing Casting denir.
        // diğer adıyla extra işlem yapıldığından manuel dönüşüm de denir.

        System.out.println("sayi = " + sayi);



        int sinifNo=5;
        char subeAdi = 'B';
        boolean gectiMi =true;

        System.out.println("sinifNo = " + sinifNo);
        System.out.println("subeAdi = " + subeAdi);
        System.out.println("gectiMi = " + gectiMi);
        System.out.println(sinifNo +"-"+ subeAdi + ":" + gectiMi);




    }
}
