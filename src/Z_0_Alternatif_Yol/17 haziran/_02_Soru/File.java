package Z_1_Test._02_Soru;

public class File implements IReadFile {

    private String fileName;
    private String fileSize;

    public File(String fileName, String fileSize) {
        setFileName(fileName);
        setFileSize(fileSize);
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize;
    }

    @Override
    public String open() {
        return null;
    }

    @Override
    public String read() {
        return null;
    }

    @Override
    public String save() {
        return null;
    }

    @Override
    public String close() {
        return null;
    }
    public void Acilis (String fileName) {
                System.out.println(getFileName() + " adlı dosya işlemleri görüntüleniyor...");
        System.out.println("------------------------------------------------");
    }

}
