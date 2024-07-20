package Arrays;

import java.util.Arrays;

public class Array5 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = {1, 2, 3, 4, 5};

        System.out.println(a == b); //FALSE, since both arrays are referring to different object, or Reference is not same.
        System.out.println(a.equals(b));//FALSE,
        // contents are same but still it'll be false because Arrays are object and this refers .equals from Object class and don't override
        //.equals method like string does.
        // so .equals method in Arrays works as same '==' to compare the reference of objects only.

        //TO COMPARE CONTENTS/VALUES in Arrays here we have different method.
        System.out.println(Arrays.equals(a, b)); //TRUE

    }
}
