package Odevler._19_OdevlerHaziran13_oop1.Soru2;

public class Main {
    public static void main(String[] args) {
        Employees emp=new Employees("isa",1990);
        System.out.println(emp);
        System.out.println("Yaş= "+emp.ageCalculator());
    }
}
