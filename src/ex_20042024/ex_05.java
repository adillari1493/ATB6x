package ex_20042024;

public class ex_05 {
    public static void main(String[] args) {
        String str1 = "JAVA";
        String str2 = "java";
        String str3 = "java";

        System.out.println(str1 == str2); //checks the reference    //false
        System.out.println(str1.equals(str3));//checks the value   //false
        System.out.println(str2.equals(str3));    //true
    }
}
