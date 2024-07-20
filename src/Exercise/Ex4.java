package Exercise;

//Write a Program for (3/x^2 + y^2 -|z|) or cbrt(x^2 + y^2 -|z|)
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of X: ");
        double x = sc.nextDouble();
        System.out.println("Enter value of Y: ");
        double y = sc.nextDouble();
        System.out.println("Enter value of Z: ");
        double z = sc.nextDouble();

        // 3/x^2 + y^2 -|z|

        double result;

        result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println("Cuberoot is: "+result);
    }
}
