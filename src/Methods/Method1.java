package Methods;

public class Method1 {
    /*static int c;
    public static void main(String[] args) {
        int a = 9;
        int b = 21;
        int sum = sum(a,b);
        int sum1 = sum;
        System.out.println(sum);
    }

    static int sum(int a, int b)
    {
        c=a+b;
        return c;
    }*/

    //SAME OPTIMISED CODE...

    public static void main(String[] args) {
        int a = 9;
        int b = 21;
        int sum = sum(a, b);
        System.out.println(sum);
    }

    static int sum(int a, int b) {
        return a + b;
    }
}

