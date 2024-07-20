package Arrays;

public class Array6 {
    public static void main(String[] args) {
        int a[] = {23, 43, 12, 41, 65, 54, 56, 1, 7};
        //to print all values of arrays...

        //USING FOR LOOP..
        System.out.println("Using for loop....");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        //USING WHILE LOOP..
        System.out.println("Using while loop....");
        int i=0;
        while(i<a.length)
        {
            System.out.println(a[i]);
            i++;
        }
    }
}
