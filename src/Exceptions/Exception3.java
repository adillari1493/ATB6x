package Exceptions;

import java.io.File;
import java.io.FileReader;

public class Exception3 {
    public static void main(String[] args) {
       try{
           String ip = args[0];
           int a = Integer.parseInt(args[0]);
           int b = 10 / a;
           System.out.println(a);
           System.out.println(b);


       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
}
