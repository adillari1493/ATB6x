package Encapsulation;

public class VMLogin1 {
    private String username;
    private String password;

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
        this.password = password;
    }

    public VMLogin1(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
