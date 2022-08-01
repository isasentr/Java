package Z_0_Mentoring.alistirmalar;

public class Polindrom {
    public static void main(String[] args) {


        //1881,1938

        String poli = "1881";
        String ters = "";

        for (int i = (poli.length()-1); i >= 0; i--) {
            ters+= poli.charAt(i);
        }

        if (ters.equals(poli))
            System.out.println("polindromdur.");

        else
            System.out.println("polindrom değildir.");
    }

}
