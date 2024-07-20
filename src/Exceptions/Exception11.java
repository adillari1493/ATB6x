package Exceptions;

//separate try-catch blocks

/* so in this case both try-catch block will be executed, because both are handling the exception separately */

public class Exception11 {
    public static void main(String[] args) {

        //1st Try-catch
        try{
            String str = null;
            str.length();
        }
        catch (NullPointerException e1)
        {
            System.out.println("Exception1: "+e1);
        }

        //2nd TRY-catch
        try
        {
            int[] arr = new int[5];
            System.out.println(arr[7]);
        }
        catch (ArrayIndexOutOfBoundsException e2)
        {
            System.out.println("Exception2: "+e2);
        }

    }
}
