package Gun37_haziran16.Ornek6_soru;

public class GeometriMain {
    public static void main(String[] args) {
        
        dikdortgen d=new dikdortgen();
        System.out.println("d.alan(4,5) = " + d.alan(4,5));
        System.out.println("d.cevre(4,5) = " + d.cevre(4,5));

        kare kr=new kare();
        System.out.println("kr.alan(5) = " + kr.alan(5));
        System.out.println("kr.cevre(5) = " + kr.cevre(5));
    
    daire dr=new daire();
        System.out.println("dr.alan(6) = " + dr.alan(6));
        System.out.println("dr.cevre(6) = " + dr.cevre(6));
    
    }
}
