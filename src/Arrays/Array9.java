package Arrays;
//Double the value of array and Print it....


public class Array9 {
    public static void main(String[] args) {
        int array1[] = {12, 23, 42, 23}; //Horizontal Arrays
        int array2[] = new int[4];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i] * 2;
            System.out.println(array2[i]);
        }

    }
}
