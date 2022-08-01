package Odevler._19_OdevlerHaziran13_oop1.Soru1;

public class Student1 {
    private String isim;
    private int yas;

    public Student1(String isim, int yas) {
        setIsim (isim);
        setYas (yas);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return
                "Student name is " + isim + '\n' +
                "He is " + yas +" years old";
    }
}
