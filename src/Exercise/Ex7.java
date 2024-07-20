package Exercise;

//Write a program to print table of any entered number...

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Table of Entered number is: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + "*" + i + " = " + num * i);
        }
        sc.close();

    }
}
