package Gun36_haziran15.Protected.Paket2;

import Gun36_haziran15.Protected.Paket1.P1Hayvan;

public class P2kedi extends P1Hayvan {
    public P2kedi(String ad,String cinsi) {
        super.ad=ad; // kendi classı olsaydı this diyecektik, üst class olduğundan super dedik
        super.cinsi=cinsi;
    }

    @Override
    public String toString() {
        return "P2kedi{" +
                "ad='" + ad + '\'' +
                ", cinsi='" + cinsi + '\'' +
                "} ";
    }
}
