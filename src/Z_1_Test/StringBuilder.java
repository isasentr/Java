package Z_1_Test;

import java.util.Arrays;

public class StringBuilder {
    public static void main(String[] args) {
        
        String cumle="";

        cumle=cumle+"isa";
        cumle+=" alikemal";
        System.out.println("cumle = " + cumle);

        cumle=cumle.concat(" oldu");
        System.out.println("cumle = " + cumle);


        java.lang.StringBuilder s=new java.lang.StringBuilder();

        s.append("Bugün");
        s.append(" hava");
        s.append(" güzel.");
        System.out.println("s = " + s);


        System.out.println("s.length() = " + s.length());
        s.append(4);
        System.out.println("s = " + s);

        s.reverse();
        System.out.println("s = " + s);

        s.delete(0,5);
        System.out.println("s = " + s);

        s.deleteCharAt(3);
        System.out.println("s = " + s);
        
        s.insert(5,"isa");
        System.out.println("s = " + s);

        s.insert(4,5.6);
        System.out.println("s = " + s);

        int[]ali = {1,3,56,89};
        s.insert(2, Arrays.toString(ali));
        System.out.println("ali = " + s);

        s=new java.lang.StringBuilder("bugün hava sıcak");

        s.replace(3,6,"bu");
        System.out.println("s = " + s);


        String yenis=s.toString();
        yenis.replaceAll("0","");

    }
}
