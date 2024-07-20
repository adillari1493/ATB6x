package Super;

public class Super2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}

class Person
{
    void message()
    {
        System.out.println("I am Person's message...");
    }
}

class Student extends Person
{
    void message()
    {
        System.out.println("I am Student's message... ");
    }

    void display()
    {
        super.message(); // to call superclass method...
      //  this.message(); // to call own class method...
    }
}