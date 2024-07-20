package Functions;

public class MethodOverloadingExample {

/*
    This demonstrates that Java recognizes the order of parameter types as part of the method signature
    when it comes to method overloading.
    It's important to note that while this is a valid way to overload methods,
    it's generally not recommended to have multiple methods with the same name and the same number of parameters
    but a different order of parameter types, as it can lead to confusion and reduced code readability.
    A better practice is to use descriptive method names that clearly convey the purpose and signature of the method.
*/


    public static void main(String[] args) {
        MethodOverloadingExample obj = new MethodOverloadingExample();
        obj.printValues(10, 20.5);
        obj.printValues(20.5, 10);
    }

    public void printValues(int x, double y) {
        System.out.println("Integer: " + x + ", Double: " + y);
    }

    public void printValues(double x, int y) {
        System.out.println("Double: " + x + ", Integer: " + y);
    }

}
