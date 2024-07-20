package Exercise;

public class Ex10 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) { // 1 - 9
            if (i % 2 == 0) {
                System.out.println("Even →" + i);
                continue; //continue means it'll go back to FOR loop...
            }
            System.out.println("Odd →" + i);
        }
    }
}
