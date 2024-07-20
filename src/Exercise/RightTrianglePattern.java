package Exercise;

import java.util.Scanner;

public class RightTrianglePattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for the right triangle: ");
        int rows = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*   Now let's explain the code:

        We import java.util.Scanner to take input from the user.

        We define a class called RightTriangle.

        Inside the main method, we create a Scanner object to read input from the user.
        We prompt the user to enter the number of rows for the right triangle.

        We use a for loop to iterate from 1 to the number of rows specified by the user.
        This loop controls the rows of the triangle.

        Inside the outer loop, we have two nested loops:

        The first nested loop (for (int j = 1; j <= rows - i; j++)) is responsible for printing spaces.
        It prints spaces equal to the difference between the total number of rows and the current row number.
        This ensures that each row is indented properly to form a right triangle.

        The second nested loop (for (int k = 1; k <= i; k++)) is responsible for printing asterisks. It prints asterisks equal to the current row number.
        After printing the spaces and asterisks for each row, we move to the next line (System.out.println()) to start a new row.

*/