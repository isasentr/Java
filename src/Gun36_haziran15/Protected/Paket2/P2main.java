package Gun36_haziran15.Protected.Paket2;

import Gun36_haziran15.Protected.Paket1.P1Hayvan;

public class P2main {
    public static void main(String[] args) {
        P1Hayvan h2=new P1Hayvan();
        h2.ad="kopek";
        //h2.yas diğer paketten ulaşılamaz.
        //h2.cinsi protected ama p1hayvandan extend yaparsak kullanabiliriz.


P2kedi kedi1=new P2kedi("kopuk","scotish");
        System.out.println("kedi1 = " + kedi1);
    }
}
