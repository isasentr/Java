package Z_1_Test._02_Soru;

public class TxtFile extends File implements IReadFile{

    private String fileName;
    private String fileSize;

    public TxtFile(String fileName, String fileSize) {
        super(fileName, fileSize);
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
