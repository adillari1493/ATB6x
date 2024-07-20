package Static;

public class StaticMethodEx2 {
    static void method()
    {
        System.out.println("I am a Static method!!!");
        //notStaticMehtod();    //we cant call this non static method inside a static method
    }

    public static void main(String[] args) {
        method(); //we can directly call this static method
        StaticMethodEx2.method(); //we can also call this static method along with class name
        StaticMethodEx2 ex = new StaticMethodEx2();
        ex.method(); // we can also call this static method using a instance variable, but this way is not correct way since static is meant for Memory saving
        ex.notStaticMehtod();
    }

    void notStaticMehtod()
    {
        System.out.println("I am a non-static method!!");
        method(); //we can call this static method inside a non static method
    }
}
