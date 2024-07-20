package Exceptions;

public class Ex5 {
    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or more than 18!!");
        }
    }


    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (
                IllegalArgumentException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }

}