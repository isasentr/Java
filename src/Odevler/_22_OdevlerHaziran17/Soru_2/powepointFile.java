package Odevler._22_OdevlerHaziran17.Soru_2;

public class powepointFile extends files implements Ireadfile {
    public powepointFile(String filename, int filesize) {
        super(filename, filesize);
    }

    @Override
    public String open() { return "opening.ppt";}

    @Override
    public String read() {
        return "reading.ppt";
    }

    @Override
    public String save() {
        return "saving.ppt";
    }

    @Override
    public String close() {
        return "closing.ppt";
    }
}
