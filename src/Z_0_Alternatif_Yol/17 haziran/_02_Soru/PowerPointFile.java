package Z_1_Test._02_Soru;

public class PowerPointFile extends File implements  IReadFile {


    public PowerPointFile(String fileName, String fileSize) {
        super(fileName, fileSize);
    }

    @Override
    public String open() {
        return "opening.ppt";
    }

    @Override
    public String read() {
        return "closing.ppt";
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
