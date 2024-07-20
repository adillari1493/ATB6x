package Abstraction;

public class LGTv implements Remote {
    @Override
    public void power() {
        System.out.println("Turning ON/OFF TV..");
    }

    @Override
    public void volumeDown() {
        System.out.println("Decreasing Volume of TV..");
    }

    @Override
    public void volumeUp() {
        System.out.println("Increasing Volume of TV..");
    }
}
