package ForLoop;

public class For11 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.println(i);
            if(i==6)
            {
                System.out.println("Value of i is matching as per condition.");
                continue;
            }
            System.out.println("After!!");
        }
    }
}
