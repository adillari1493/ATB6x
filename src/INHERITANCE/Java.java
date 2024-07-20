package INHERITANCE;

public class Java extends Programming {

    String newFeature;

    public Java() {
        System.out.println("Default Constructor of Java!!");
    }

    public Java(int version, String newFeature) {
        this.newFeature = newFeature;
        this.version = version;
    }

    public void printInfo() {
        System.out.println("Feature is-> " + this.newFeature);
        System.out.println("I am inside Java class!!");
    }
}
