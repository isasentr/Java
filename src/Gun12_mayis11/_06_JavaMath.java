package Gun12_mayis11;

public class _06_JavaMath {
    public static void main(String[] args) {
        int a =12;
        int b =4;

        System.out.println("A nın mutlak değeri="+ Math.abs(a)); //12
        System.out.println("A ve B nin en büyük olanı=" + Math.max(a,b)); //12
        System.out.println("A ve B nin en küçük olanı=" + Math.min(a,b)); //4
        System.out.println("B nın karakökü=" + Math.sqrt(b)); //2
        System.out.println("2 nin 3. kuvveti=" + Math.pow(2,3)); //8
        System.out.println("Yuvarlama round=" + Math.round(3.1)); //3
        System.out.println("Yuvarlama round=" + Math.round(3.5)); //4
        System.out.println("Yukarı yuvarla ceil=" + Math.ceil(3.1)); //4
        System.out.println("Yukarı yuvarla ceil=" + Math.ceil(3.5)); //4
        System.out.println("aşağı yuvarla floor=" + Math.floor(3.1)); //3
        System.out.println("aşağı yuvarla ceil=" +  Math.floor(3.5)); //3

    }
}
