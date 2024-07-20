package Exercise;

/*      Program to Perform Arithmetic Operations using SWITCH
        Take a input from user, input1, input2 as int and ask
        the user what you want to do, enter char +, *, /, %, -, any other char should throw invalid operation!!!
*/

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: "); //User will enter first input
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: "); //User will enter second input
        int num2 = sc.nextInt();
        System.out.println("Enter Character to perform any operation with these 2 numbers: ");
        String enterChar = sc.next();
        char character = enterChar.charAt(0);

        float result;

        switch (character) {
            case '+':
                result = num1 + num2;
                System.out.println("Addition of input is: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Substration of input is: " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Division of input is: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication of input is: " + result);
                break;
            case '%':
                result = num1 % num2;
                System.out.println("Modulus of input is: " + result);
                break;
            default:
                System.out.println("Invalid Operation!!!");
        }

    }
}
