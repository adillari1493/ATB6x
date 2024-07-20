package Exceptions;

//Methods Throwing Different Exceptions

/*
        m1() throws a NullPointerException, which is caught by the corresponding catch block.
        m2() is not executed because the flow exits the try block after the first exception is caught.
*/

public class Exception9 {
    static void m1()
    {
        String str = null;
        str.length();
    }
    static void m2()
    {
        int[] arr = new int[4];
        System.out.println(arr[5]);
    }

    public static void main(String[] args) {
        try{
            m1();
            m2();
        }
        catch (NullPointerException e1)
        {
            System.out.println("Exception1: "+e1.toString());
        }
        catch (ArrayIndexOutOfBoundsException e2)
        {
            System.out.println("Exception2: "+e2.toString());
        }
    }
}
