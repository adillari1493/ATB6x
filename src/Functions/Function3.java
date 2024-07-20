package Functions;

public class Function3 {
    public static void main(String[] args) {
        f1();
        f2();
        f1();
        f1();
        f2();
        f1();
        System.out.println("End!!!");
    }

    static void f1() {
        System.out.println("This is f1() function....");
    }

    static void f2() {
        System.out.println("This is f2() function....");
    }

}
