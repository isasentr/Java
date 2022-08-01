package Odevler._22_OdevlerHaziran17.Soru_2;

public class files {

    String filename;

    int filesize;

    public files(String filename, int filesize) {
        setFilename (filename);
        setFilesize (filesize);
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getFilesize() {
        return filesize;
    }

    public void setFilesize(int filesize) {
        this.filesize = filesize;
    }

}
