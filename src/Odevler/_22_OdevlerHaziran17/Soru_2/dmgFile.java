package Odevler._22_OdevlerHaziran17.Soru_2;

public class dmgFile extends files implements Ireadfile{

    public dmgFile(String filename, int filesize) {
        super(filename, filesize);
    }

    @Override
    public String open() {return "opening.dmg";}

    @Override
    public String read() {
        return "reading.dmg";
    }

    @Override
    public String save() {
        return "saving.dmg";
    }

    @Override
    public String close() {return "closing.dmg";}
}
