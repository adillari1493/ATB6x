package Exceptions;

import java.util.Scanner;

public class UncheckedExceptions {
    public static void main(String[] args) {
        System.out.println("Program started...");
        Scanner sc  = new Scanner(System.in);
/*        //AirhtmaticException

        System.out.println("Enter a Number -> ");
        int num = sc.nextInt();

        System.out.println(100/num);*/

        int a[] = new int[5];
        System.out.println("Enter the Position(0-4): ");
        int pos = sc.nextInt();

        System.out.println("Enter a Value: ");
        int value = sc.nextInt();

        a[pos] = value;
        System.out.println(a[pos]);

        System.out.println("Program is completed..");
        System.out.println("Program Terminated..");
    }
}
