package Odevler._19_OdevlerHaziran13_oop1.Soru4;

public class rentApartments {

    private String name;

    private int roomCount;

    private boolean balconyOrNo;

    public rentApartments(String name, int roomCount, boolean balconyOrNo) {
        setName(name);
        setRoomCount(roomCount);
        setBalconyOrNo(balconyOrNo);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomCount() {

        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public boolean isBalconyOrNo() {
        return balconyOrNo;
    }

    public void setBalconyOrNo(boolean balconyOrNo) {
        this.balconyOrNo = balconyOrNo;
    }


    public static int room(int roomCount) {
        if (roomCount == 0) {
            return 1400;
        } else if (roomCount == 1) {
            return 1700;
        } else if (roomCount == 2) {
            return 2200;
        } else
            return 2700;
    }

    public int balcony(boolean balconyOrNo) {
        if (balconyOrNo = true)
            return 200;
        return 200;
    }

    @Override
    public String toString() {
        return
                name + " rent is " +( room(roomCount)+balcony(balconyOrNo))+" USD";
    }
}
