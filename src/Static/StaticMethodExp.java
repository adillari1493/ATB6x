package Static;

public class StaticMethodExp {

    int a = 10;
    int b =15;
    int c;
    public static void main(String[] args) {
        StaticMethodExp sc = new StaticMethodExp();
        sc.sum();
    }
    //below static method is not possible, since it's using 'a'  &  'b' which are non-static in nature..

    /*    static void sum()
    {
        c=a+b;
        System.out.println("Summation of 'a' & 'b': "+c);
    }*/

    void sum()
    {
        c=a+b;
        System.out.println("Summation of 'a' & 'b': "+c);
    }

}
