package Odevler._18_OdevlerHaziran06_ok._17;

public class user {
    int id;
    String username;
    String password;
    boolean active;
    boolean signedln;
    String userRole;

   public static int idsayac=0;

    public user( String username, String password, boolean active, boolean signedln, String userRole) {
        setId (id);
        this.username = username;
        setPassword (password);
        this.active = active;
        this.signedln = signedln;
        this.userRole = userRole;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = ++idsayac;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length()<6){
            this.password = "password 6 karakterden küçük tekrar giriniz";
        }else
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedln() {
        return signedln;
    }

    public void setSignedln(boolean signedln) {
        this.signedln = signedln;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                ", signedln=" + signedln +
                ", userRole='" + userRole + '\'' +
                '}';
    }
}
