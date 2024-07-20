package Exercise;

import java.util.Scanner;

//To check number is positive, negative or zero
public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:"); //user will enter some number to check...
        int num = sc.nextInt();
        
        //now we'll create login to check number..

        if(num>0)
        {
            System.out.println("Number is POSITIVE");
        }
        else if(num<0)
        {
            System.out.println("Numnber is NEGATIVE");
        }
        else {
            System.out.println("Number is ZERO");
        }
    }
}
