package Arrays;

public class Array1 {
    public static void main(String[] args) {
        int a = 10;
        //Arrays
        // collection of Similar data type
        int[] age = {21,25,38,48,61,58,45}; //initialization of array 1st way...
        System.out.println("Address: "+age); //it'll print some address for array
        System.out.println("Value of array at index 0: "+age[0]); //this will print value of array at particualr index
        System.out.println("Value of array at index 3: "+age[3]); //same as above
        System.out.println("Length of Array: "+age.length); //this will return length of array
        System.out.println("Index out of bound: "+age[7]); //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7


        int[] age2 = new int[5]; //2nd way of initiallization of array
        age2[0] = 31;
        age2[1] = 51;
        age2[2] = 36;
        age2[3] = 24;
        age2[4] = 33;

      /*  for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }*/
    }
}
