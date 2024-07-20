package Arrays;

//2D Array...
public class Array10 {
    public static void main(String[] args) {
      //  int array1[][] = new int[3][3];
        int array2[][] = {{12,23,52},{15,45,16},{43,85,31}};
        
        //How to print this array values...

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.println(array2[i][j]);
            }
        }

    }
}
