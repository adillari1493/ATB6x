package Super;

public class SuperConstructor {
    public static void main(String[] args) {
        Student1 s1 = new Student1(); //this will call first Superclass 'Person1' default constructor and then its own constructor..
        Person1 p1 = new Person1(); // this will call its own constructor only

    }

}

// super.variable
//super.method()
// super() → DC
//super("pramod') → PC

class Person1
{
    Person1()
    {
        System.out.println("I am Person1 Default constructor...");
    }

    Person1(String a) {
            System.out.println("Person1 - PC");
    }

    Person1(String a,int a1){
            System.out.println("Person1 - PC");
    }
}


class Student1 extends Person1
{
    Student1()
    {
        super(); //it will always be here if we call 'Student1()'....it's implicit if explicitly not called superclass default constuctor..
        System.out.println("I am Student1 Default Constructor... ");
    }
}