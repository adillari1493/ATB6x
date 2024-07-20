package Super;

public class AnimalRunner {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        // constructor chaining: Child Class constructor called -> Superclass default constructor will be called first...
        Dog d2 = new Dog("German Shepherd");
        d2.display();
    }
}
