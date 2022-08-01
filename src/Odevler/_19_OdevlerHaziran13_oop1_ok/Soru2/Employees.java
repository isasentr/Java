package Odevler._19_OdevlerHaziran13_oop1.Soru2;

public class Employees {
    private String name;
    private int salary;
    private int dob;

    public Employees(String name, int dob) {
        setName(name);
        setSalary(salary);
        setDob(dob);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = 8000;
    }

    public int getDob() {
        return (2022 - dob);
    }

    public void setDob(int dob) {

        this.dob = dob;
    }

    @Override
    public String toString() {
        if ((2022 - this.dob) > 18) {
            return "Welcome to our company Fernando your salary is 80000";
        } else if ((2022 - this.dob) < 18) {
            return "come back when you are 18 years old.";
        }
        return "we can have inter with you after that you can have a 80000 salary";
    }

    public int ageCalculator() {
        return (2022 - this.dob);
    }
}
