package Super;

public class SuperKeyword1 {
    // Super keyword in Java
    // parent child
    // Super keyword reference to parent class
    // Variable of Parent.
    // Method of the parent.
    // Constructor of the parent.
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.display();
    }
}


class Vehicle
{
    int maxSpeed =100; //instance var
    void message()
    {
        System.out.println("This is Vehicle class method");
    }

}

class Car extends  Vehicle
{
    private int maxSpeed= 150;
    void display()
    {
        System.out.println("Max speed of Vehicle can be: "+super.maxSpeed);//this will use 'maxSpeed' from Superclass
        System.out.println("Max speed of this car is: "+this.maxSpeed); //this will use 'maxSpeed' of its own
    }
}