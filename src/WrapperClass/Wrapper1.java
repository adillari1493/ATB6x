package WrapperClass;

public class Wrapper1 {
    public static void main(String[] args) {
        int a =123;
        //String x= a;
       // String x = (String) a;
        String x = String.valueOf(a);
        System.out.println(x);
    }
}
