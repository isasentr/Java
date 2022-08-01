package Z_1_Test._02_Soru;

public class DMGFile extends File implements IReadFile {
    public DMGFile(String fileName, String fileSize) {
        super(fileName, fileSize);
    }

    @Override
    public String open() {
        return "opening.dmg";
    }

    @Override
    public String read() {
        return "reading.dmg";
    }

    @Override
    public String save() {
        return "saving..dmg";
    }

    @Override
    public String close() {
        return "closing.dmg";
    }
}
