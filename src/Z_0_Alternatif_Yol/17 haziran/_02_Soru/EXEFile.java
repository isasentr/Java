package Z_1_Test._02_Soru;

public class EXEFile extends File implements IReadFile{
    public EXEFile(String fileName, String fileSize) {
        super(fileName, fileSize);
    }

    @Override
    public String open() {
        return "opening.exe";
    }

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
