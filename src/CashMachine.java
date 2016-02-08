
public class CashMachine {
    public static void main(String args[]) {
        money money = new money(20, 10, 10);
        money.addHundred(10);
        money.addFifty(20);
        money.addTwenty(50);
        System.out.println(money);
        money.withdraw(390);
        System.out.println(money);
}
}
