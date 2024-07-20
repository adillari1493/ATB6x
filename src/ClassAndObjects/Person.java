package ClassAndObjects;

public class Person {

    //Attributes...
    String name;
    byte age;
    long phoneNum;
    String[] address;
    double height;
    boolean isMale;
    int Salary;
    String DOB;
    String eyeColor;

    //Behaviour/Functionality
    public void run() {
        System.out.println("I can run!!");
    }

    public void sleep() {
        System.out.println("I can sleep!!");
    }

    public void walk() {
        System.out.println("I can walk!!");
    }
}

//this class can't be run directly since it doesn't have main method.
