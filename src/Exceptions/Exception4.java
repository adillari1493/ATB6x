package Exceptions;

public class Exception4 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,5};
        System.out.println(numbers[5]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 4
    }
}
