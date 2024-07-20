package Super;

public class Animal {
    String type;
    public Animal() {
        System.out.println("Animal DC...");
    }

    public Animal(String type) {
        this.type = type;
        System.out.println("Animal Parameterized Constructor...");
    }
}

class Dog extends Animal
{
    String breed;
    public Dog() {
        // super(); //this will be implicitly called if not defined here
        System.out.println("Dog DC...");
    }

    public Dog(String breed) {
        super("DOG Type");
        this.breed = breed;
        System.out.println("Dog Para constructor...");
    }

    void display()
    {
        System.out.println("Type: "+super.type+ " ,Breed: "+this.breed);
    }
}