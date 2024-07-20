package Encapsulation;

public class VW_Login {
    public String username; //if it will be private then no can access it and then it'll be safe
    public String password;  //if it will be private then no can access it and then it'll be safe

    public VW_Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
