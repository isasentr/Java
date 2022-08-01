package Odevler._22_OdevlerHaziran17.Soru_2;

public class exeFile extends files implements Ireadfile{

    public exeFile(String filename, int filesize) {
        super(filename, filesize);
    }

    @Override
    public String open() {return "opening.exe";}

    @Override
    public String read() {
        return "reading.exe";
    }

    @Override
    public String save() {
        return "saving.exe";
    }

    @Override
    public String close() {
        return "closing.exe";
    }
}
