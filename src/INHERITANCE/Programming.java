package INHERITANCE;

//lets say this is super class..
public class Programming {
    int version;
    String author;
    int year;

    public Programming() {
        System.out.println("This is Default Constructor!!");
    }

    public Programming(int year, int version, String author) {
        this.version = version;
        this.author = author;
        this.year = year;
        System.out.println("Parameterized Constructor was called!!");
    }

    public void printInfo(){
        System.out.println("Programming year was -> "+year +" Programming Version Info -> "+ this.version + " Author -> "+ this.author);
        System.out.println("I am inside Programming class!!!");
    }

}
