package Z_1_Test._03_Soru;

import java.util.Scanner;

public class AracMain {
    public static void main(String[] args) {
        Bicycle bisiklet = new Bicycle(30, 4);
        Car araba = new Car(40, 2);

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Please select your vehicle.\n1-Bicycle\n2-Car\n**Please enter \"q\" to exit.");
        System.out.print("Vehicle= ");
        String select = sc2.nextLine();
        if (select.equalsIgnoreCase("q"))
            System.out.println("Sistemden çıkış yaptınız...");

        while (select.equals("1")) {
            bisiklet.printAll();
            System.out.println("Please select what do you want to do.\n1-Change gear\n2-Speed up\n3-Apply brakes\n**Please enter \"q\" to exit.");
            System.out.print("Your selection= ");
            String selection = sc2.nextLine();
            if (selection.equalsIgnoreCase("q")) {
                System.out.println("Sistemden çıkış yaptınız...");
                break;
            }

            if (selection.equals("1")) {
                System.out.print("Please select the gear you want to use= ");
                int gear = sc.nextInt();
                bisiklet.changeGear(gear);

            }
            if (selection.equals("2")) {
                System.out.print("How much do you want to increase your speed?= ");
                int speedUpp = sc.nextInt();
                bisiklet.speedUp(speedUpp);


            }
            if (selection.equals("3")) {
                System.out.print("How much do want to decrease your speed?= ");
                int speedDown = sc.nextInt();
                bisiklet.applyBrakes(speedDown);

            }
        }
        while (select.equals("2")) {
            araba.printAll();
            System.out.println("Please select what do you want to do.\n1-Change gear\n2-Speed up\n3-Apply brakes\n**Please enter \"q\" to exit.");
            System.out.print("Your selection= ");
            String selection = sc2.nextLine();
            if (selection.equalsIgnoreCase("q")) {
                System.out.println("Sistemden çıkış yaptınız...");
                break;
            }

            if (selection.equals("1")) {
                System.out.print("Please select the gear you want to use= ");
                int gear = sc.nextInt();
                araba.changeGear(gear);

            }
            if (selection.equals("2")) {
                System.out.print("How much do you want to increase your speed?= ");
                int speedUpp = sc.nextInt();
                araba.speedUp(speedUpp);


            }
            if (selection.equals("3")) {
                System.out.print("How much do want to decrease your speed?= ");
                int speedDown = sc.nextInt();
                araba.applyBrakes(speedDown);

            }

        }
    }
}





