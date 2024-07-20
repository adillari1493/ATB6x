package Arrays;

//find maximum value in an Array

public class Array8 {
    public static void main(String[] args) {

        int a[] = {23, 534, 32, 54, 653, 134, 124};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }
        System.out.println("Maximum Value of Array is: " + max);


    }
}
