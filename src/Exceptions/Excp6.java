package Exceptions;

//Multiple Exceptions from Different Lines of Code
public class Excp6 {

    public static void main(String[] args) {
        try {
            // This will throw NullPointerException
            String str = null;
            str.length();
            // This will throw ArrayIndexOutOfBoundsException
            int[] arr = new int[5];
            System.out.println(arr[7]);

        } catch (NullPointerException e1) {
            System.out.println("Exception1 :" + e1.getMessage());
        } catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("Exception2 :" + e2.getMessage());
        }
    }
}

/*
        After catching the first exception, the second part of the code will not be executed
        because the program flow exits the try block after an exception is caught.
        This is why multiple exceptions in the same try block typically require
        separate try blocks or nested try-catch structures.*/
