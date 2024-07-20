package Exceptions;

public class Exception10 {

        public static void main(String[] args) {
            try {
                handleMultipleExceptions();
            } catch (NumberFormatException e) {
                System.out.println("Caught NumberFormatException: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            }
        }

        public static void handleMultipleExceptions() {
            // Convert string to integer
            String[] numbers = {"42", "not_a_number", "56"};
            for (String number : numbers) {
                // This line can throw NumberFormatException
                int num = Integer.parseInt(number);
                System.out.println(num);
            }

            // Access an invalid array index
            int[] arr = new int[2];
            System.out.println(arr[3]); // This line will throw ArrayIndexOutOfBoundsException
        }
    }

