package ex_20042024;

public class ex_06 {
    public static void main(String[] args) {
        String str1= "Java";
        String str2 = new String("Java");

        System.out.println(str2==str1); //checks for ref....which is different here   //FALSE
        System.out.println(str2.equals(str1)); //checks the value...which is same here  //TRUE

    }

}
