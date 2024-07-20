package Functions;

public class Function4 {
    public static void main(String[] args) {
        // function which will say Hi!!
        System.out.println("Start!!");
        sayHi();
        sayHi();
        //to call this method 100 times, we can use loop...
        for (int i = 1; i <= 100; i++) {
            sayHi();
        }
        sayBye();
        System.out.println("End!!");
    }

    static void sayBye() {
        System.out.println("Bye!!");
    }

    static void sayHi() {
        System.out.println("Hi!!");
    }


}
