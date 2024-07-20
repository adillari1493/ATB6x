package Encapsulation;

public class Enc1 {
    public static void main(String[] args) {
        VW_Login vw1 = new VW_Login("admin","admin@123");
        /*vw1.username="admin";
        vw1.password="admin123";*/
        System.out.println(vw1.password); //anyone can see this password...
    }

}
