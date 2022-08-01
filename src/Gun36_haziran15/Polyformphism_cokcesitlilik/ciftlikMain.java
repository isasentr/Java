package Gun36_haziran15.Polyformphism_cokcesitlilik;

//todo bu konuda mülakatta soru var. hoca hatırlatın dedi.
public class ciftlikMain {
    public static void main(String[] args) {

        kopek kop1 = new kopek("alis");
        kedi ke1 = new kedi("kopuk");

        hayvan kopek2 = new kopek("rodi");
        hayvan kedi = new kedi("tekir");

        kop1.ses(); // gerçekten kopek
        kop1.kokladi(); // gerçekten kopek

        kopek2.ses(); //hayvan gibi görünüyor ,ama kopek

        ((kopek) kopek2).kokladi(); // tip değişikliği yaptık dounle int çevirir gibi

        System.out.println("------------------------");
        hayvanSes(kop1);
        hayvanSes(ke1);
    }

    public static void hayvanSes(hayvan h) {
        h.ses();
    }


}
