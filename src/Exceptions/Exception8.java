package Exceptions;

        //Propagation of the Exception

/*
                If no appropriate catch block is found in the current method,
                the JVM propagates the exception to the caller of the method.
                This process continues up the call stack.
                The JVM moves to the method that called the current method,
                then to the method that called that method, and so on,
                until it either finds an appropriate catch block or
                reaches the top of the call stack (the main method).
*/



public class Exception8 {

    static void m2()
    {
        String str = null;
        str.length(); // NullPointerException is thrown here
    }

     static void m1()
    {
        m2();
    }

    public static void main(String[] args) {
     try{
         m1();
     }
     catch (NullPointerException e)
     {
         System.out.println("Exception Caught: "+e.getMessage());
         System.out.println("Exception Caught: "+e.toString());
         System.out.println("Exception Caught: "+e); //it'll work same as toString(), since it'll implicitly call it
     }
    }


}
