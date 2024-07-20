package INHERITANCE;

//Consider this class as a Runner class...
public class RunnerClass {

    //Inherits Attributes and Behaviour from Parents or Grandparents
    //Superclass | Parent Class, Base class
    //Subclass | Child Class | Derived class

    // Parent -> child relationship between classes
    //child class 'extends' parent class

    public static void main(String[] args) {

/*

        //creating object of Programming class...
        Programming p2 = new Programming();
        Programming p1 = new Programming(2006, 12, "James Gosling");

        //creating object of Java class...
        Java j1 = new Java(8,"JDK 8 was updated...");

        //calling method 'printInfo()' by using p1 reference of Programming class...
        p1.printInfo();
        p2.printInfo();
        j1.printInfo();

*/

/*        SuperClass sc = new SuperClass();
        SuperClass sc1 = new SuperClass(12, "James Gosling");*/
        ChildClass1 cc1 = new ChildClass1(17, "Tomm Holland");

/*
        sc.printInfo();
        sc1.printInfo();
*/


    }


}
