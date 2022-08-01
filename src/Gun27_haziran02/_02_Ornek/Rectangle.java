package Gun27_haziran02._02_Ornek;

public class Rectangle {

    int width;

    int length;

    //2.yöntem class
    public void cevre() {
        System.out.println("cevre:"+(width * 2 + length * 2));
    }

    public void alan() {
        System.out.println("alan:"+(width * length));
    }

    //3.yöntem return
    public int Alan2(){
        return  (width * length);
    }

}