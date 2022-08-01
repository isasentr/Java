package Odevler._19_OdevlerHaziran13_oop1.Soru3;

public class Subscribe {
    private String name;
    private boolean doYouWanaSubscribe;
    Membership whichMember;

    public Subscribe(String name, boolean doYouWanaSubscribe, int whichMember) {
        setName(name);
        setDoYouWanaSubscribe(doYouWanaSubscribe);
        setWhichMember(whichMember);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDoYouWanaSubscribe() {
        return doYouWanaSubscribe;
    }

    public void setDoYouWanaSubscribe(boolean doYouWanaSubscribe) {
        this.doYouWanaSubscribe = doYouWanaSubscribe;
    }

    public Membership getWhichMember() {
        return whichMember;
    }

    public void setWhichMember(int whichMember) {
        if (whichMember==1) {
            System.out.println( "Welcome to membership Victoria. Your membership is 40 dollar for month you can enjoy the videos , all homework and see you soon.");
        this.whichMember=Membership.Gold;
        } else if (whichMember==2) {
            System.out.println( "Welcome to membership Victoria. Your membership is 20 dollar for month you can enjoy the videos and all homework.");
            this.whichMember=Membership.Silver;
        } else if (whichMember==3) {
            System.out.println("Welcome to membership Victoria. Your membership is 10 dollar for month you can enjoy the videos.");
            this.whichMember=Membership.Bronze;
        }
    }

    @Override
    public String toString() {
        return "Subscriber" + " " + name + " " + doYouWanaSubscribe + " " + whichMember;
    }
}
