package Z_1_Test._03_Soru;

public class Bicycle implements IVEHICLE{
    private int speed;
    private int gear;

    public Bicycle(int speed, int gear) {
       setGear(gear);
       setSpeed(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    @Override
    public int changeGear(int sayi) {
        return gear=sayi;
    }

    @Override
    public int speedUp(int sayi) {
        this.speed=getSpeed()+sayi;
        return this.speed;
    }

    @Override
    public int applyBrakes(int sayi) {
        this.speed=getSpeed()-sayi;
        return this.speed;
    }

    public void printAll() {
        System.out.println("Your current speed is " + getSpeed() + " and your gear count is " + getGear() +"!");

    }


}
