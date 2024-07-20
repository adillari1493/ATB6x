package Arrays;

public class Array4 {
    public static void main(String[] args) {
        final int b[] = new int[4];
        //b = 0,0,0,0
        //Size can't be changed, since it is using final

        b[2]=12;
        System.out.println(b[2]);

        //here don't get confused with final keyword, it won't impact anything for values...it won't allow you to change size

    }
}
