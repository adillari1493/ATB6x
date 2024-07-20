package Exercise;

//continue statement...
public class Ex8 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) { //0 - 9
            System.out.println("Value of i: " + i);
            if (i == 5 || i == 9) {
                System.out.println("Now this will jump the iteration and will not execute remaining code in this iteration...");
                continue;
            }
            System.out.println("After!!");
        }
    }
}
