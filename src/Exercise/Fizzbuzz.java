package Exercise;

        /*Write a program that prints numbers from 1 to 100.
        For multiples of 3, print "Fizz" instead of the number,
        and for the multiples of 5, print "Buzz".
        For numbers which are multiples of both 3 and 5,
        print "FizzBuzz".*/

import java.util.Scanner;

public class Fizzbuzz {
/*    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }*/

    public static void main(String[] args) {
        // Read an integer (n) from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("The Fizz, Buzz, and FizzBuzz numbers are:");

        // Iterate from 1 to n
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.print("Fizz");
            } else if (i % 5 == 0) {
                System.out.print("Buzz");
            } else {
                System.out.print(i);
            }
            System.out.print(", ");
        }

        // Close the scanner
        sc.close();
    }
}


