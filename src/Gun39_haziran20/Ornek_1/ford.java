package Gun39_haziran20.Ornek_1;
public class ford extends binekOto {
    @Override
    public String getMarka() {
        return "ford";
    }
    @Override
    public int getUretimYili() {
        System.out.println("üretildiği yıl =");
        return super.getUretimYili();
    }
    public void getUretimYili(int i) {
    }
}
