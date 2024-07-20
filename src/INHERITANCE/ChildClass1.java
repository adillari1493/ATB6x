package INHERITANCE;

public class ChildClass1 extends SuperClass{
    String newFeature;

    public ChildClass1() {
        System.out.println("Default Constructor of 'ChildClass1' class!!");
    }

    public ChildClass1(int version, String newFeature) {
        this.newFeature = newFeature;
        this.version = version;
        System.out.println("I am inside Parameterized constructor..");
    }

    public void printInfo() {
        System.out.println("Feature is-> " + this.newFeature);
        System.out.println("I am inside 'ChildClass1' class!!");
    }
}
