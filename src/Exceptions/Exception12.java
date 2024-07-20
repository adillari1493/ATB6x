package Exceptions;

//Try block without Catch

public class Exception12 {
    public static void main(String[] args) {
        try{
            String str = null;
            str.length();
        }
        finally {
            System.out.println("This is an example of Try without catch");
        }
    }
}
