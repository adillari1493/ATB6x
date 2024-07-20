package RestAssured;

public class NoDesignPattern {

    public void step1() {
        System.out.println("Step 1");
    }

    public void step2() {
        System.out.println("Step 2");
    }

    public void step3() {
        System.out.println("Step 3");
    }


    public static void main(String[] args) {
        NoDesignPattern noDesignPattern = new NoDesignPattern();
        noDesignPattern.step1();
        noDesignPattern.step2();
        noDesignPattern.step3();
    }
}
