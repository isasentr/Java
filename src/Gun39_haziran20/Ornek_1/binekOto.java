package Gun39_haziran20.Ornek_1;

public abstract class binekOto {// hem inheritance hem interface

    private String marka;
    private int uretimYili;

    private int vitesadedi;

    // implemente edilmek zorunda
    public abstract String getMarka();

    // ister override yapılabilir.
    //istenirse yapılmayabilir.
    public int getUretimYili() {
        return uretimYili;
    }

    public void setUretimYili(int uretimYili) {
        this.uretimYili = uretimYili;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }
}
