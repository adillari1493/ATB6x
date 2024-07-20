package Exceptions;

public class Exception1 {
    int a ;
    int b ;

    public Exception1(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
       Exception1 ex1 = new Exception1(12,4);
       ex1.divide();// this will give correct result
       Exception1 ex2 = new Exception1(10,0);
       ex2.divide(); //this will throw airthmatic exception, sice 10/0 is not correct
    }

    void divide()
    {
        System.out.println("a/b: "+a/b);
    }
}
