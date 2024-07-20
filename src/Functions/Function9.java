package Functions;

public class Function9 {
    public static void main(String[] args) {
        // 1 friend - Money
        // 1 Begger - Money

        giveMoneyToFriend(1000);
        giveMoneyToBegger();
    }

    static void giveMoneyToBegger() {
        System.out.println("Sorry I have nothing to return....i can give you Blessings!!!");
    }

    static int giveMoneyToFriend(int money) {
        //after 6 month
        System.out.println(money);
        return money;
    }


}
