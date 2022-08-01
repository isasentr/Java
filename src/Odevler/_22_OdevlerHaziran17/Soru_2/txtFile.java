package Odevler._22_OdevlerHaziran17.Soru_2;

public class txtFile extends files implements Ireadfile{
    public txtFile(String filename, int filesize) {
        super(filename, filesize);
    }

    @Override
    public String open() {
        return "opening.txt";
    }

    @Override
    public String read() {
        return "reading.txt";
    }

    @Override
    public String save() {
        return "saving.txt";
    }

    @Override
    public String close() {
        return "closing.txt";
    }
}
