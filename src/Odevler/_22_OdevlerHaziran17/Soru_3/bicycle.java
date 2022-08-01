package Odevler._22_OdevlerHaziran17.Soru_3;

import java.util.Scanner;

public class bicycle implements ivehicle {

   private int speed;
    private  int gear;

    public bicycle(int speed, int gear) {
        setSpeed (speed);
        setGear (gear);
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

    public void setGear(int sayi) {
        this.gear =sayi;
    }

    @Override
    public int changegear(int sayi) {
        return gear=sayi;
    }

    @Override
    public int speedUp(int sayi) {this.speed=(getSpeed()+sayi);
        return this.speed;
    }

    @Override
    public int applybreaks(int sayi) {
        this.speed=(getSpeed()-sayi);
        return this.speed;

    }
    public String printAll(){
       return ("Current Speed ="+ speed + ", Gear Count =" + gear);
    }
}
