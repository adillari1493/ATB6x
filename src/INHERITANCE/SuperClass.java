package INHERITANCE;

public class SuperClass {
    int version;
    String author;

    public SuperClass() {
        System.out.println("This is Default Constructor of SuperClass!!");
    }

    public SuperClass(int version, String author) {
        this.version = version;
        this.author = author;
        System.out.println("Parameterized Constructor was called!!");
    }

    public void printInfo() {
        System.out.println(" Programming Version Info -> " + this.version + " Author -> " + this.author);
        System.out.println("I am inside Programming class!!!");
    }
}
