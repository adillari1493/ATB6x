package Functions;

public class Function8 {
    public static void main(String[] args) {
        saySomethingPlease();
        sayHello("Adil");
        sumOfTwo(32,564);
        sumOfTwoWithReturn(45,12); //not executed !!!!!!!

    }

    static void saySomethingPlease()
    {
        System.out.println("Non Return type with no parameter!!");
    }
    static void sayHello(String name)
    {
        System.out.println("Hello "+name);
    }
    static void sumOfTwo(int a, int b)
    {
        System.out.println(a+b);
    }
    static int sumOfTwoWithReturn(int a, int b)
    {
        return a+b;
    }

}
