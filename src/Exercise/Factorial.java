package Exercise;

// Factorial Program
// 1! 1
// 2! 2*1
// 3! 3*2*1 ⇨ 6
// 4! 4*3*2*1 → 24
// 5! 5*4*3*2*1 → 120

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        int fact = 1;
        int i = 1;
        for (i = 1; i <= num; i++) {
            fact = fact * i;

        }
        System.out.println(fact);
        sc.close();
    }
}
