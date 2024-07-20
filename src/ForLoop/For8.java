package ForLoop;

//to check even and odd numbers..
public class For8 {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) //1-50
        {
            if (i % 2 == 0) {
                System.out.println("Even number: "+i);
            }
            else {
                System.out.println("Odd number:" +i);
            }
        }

    }
}
