package Exercise;

//check largest number among 3 numbers....using Ternary operator

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number:");
        int num2 = sc.nextInt();
        System.out.print("Enter 3rd number:");
        int num3 = sc.nextInt();

    // using IF ELSE condition...
     /*  if(num1>num2 && num2>num3)
       {
           System.out.println("Number1 is largest");
       }
       else if(num2>num1 && num2>num3)
       {
           System.out.println("Number2 is largest");
       }
       else {
           System.out.println("Number3 is largest");
       }*/


        //using Ternary operator...
        int largest1 = (num1>num2 ? num1 : num2);
        int largest2 = (num2>num3 ? num2 : num3);

        int largest = largest1>largest2 ? largest1 : largest2 ;

        System.out.println("Largest number is: "+largest);
        sc.close();

    }
}
