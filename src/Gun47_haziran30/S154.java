package Gun47;

public class S154 {
    int count;

    public static void displayMsg(){

        //System.out.println("Welcome Visit Count: "+ count++); // sen kimsin hangi nesnenin elemanısın
        // nesnen nerde değilse, static de değilsin öyleyse sen kimsin

    }

    public static void main(String[] args) {
        S154.displayMsg();
        displayMsg();
    }

}
