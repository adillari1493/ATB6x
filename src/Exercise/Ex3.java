package Exercise;
//write a program to check input character is VOWEL or CONSONANT...

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String input = sc.next();
        char character = input.charAt(0);

        switch (character) {
            case 'a':
                System.out.println("It's a VOWEL");
                break;
            case 'A':
                System.out.println("It's a VOWEL");
                break;
            case 'e':
                System.out.println("It's a VOWEL");
                break;
            case 'E':
                System.out.println("It's a VOWEL");
                break;
            case 'i':
                System.out.println("It's a VOWEL");
                break;
            case 'I':
                System.out.println("It's a VOWEL");
                break;
            case 'o':
                System.out.println("It's a VOWEL");
                break;
            case 'u':
                System.out.println("It's a VOWEL");
                break;
            case 'U':
                System.out.println("It's a VOWEL");
                break;
            default:
                System.out.println("Not a VOWEL, it's a CONSONANT");
                break;
        }

        sc.close();

    }
}
