package Exceptions;

public class Excp7 {
    public static void main(String[] args) {
        //OUTER TRY-CATCH
        // An ArrayIndexOutOfBoundsException is caught in the outer try-catch block.
        try {

            // A NullPointerException is caught in the inner try-catch block
            //INNER TRY-CATCH
            try {
                // This will throw NullPointerException
                String str = null;
                str.length();

            } catch (
                    NullPointerException e1) {
                System.out.println("Exception1: " + e1.getMessage());
            }

            // This will throw ArrayIndexOutOfBoundsException
            int[] arr = new int[2];
            System.out.println(arr[3]);

        } catch (
                ArrayIndexOutOfBoundsException e2) {
            System.out.println("Exception2: " + e2.getMessage());
        }
    }
}
