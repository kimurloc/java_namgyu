package ch11.capsule.ex03;

public class AccountTest {
    public static void main(String[] args) {
        AccountBad myAccount = new AccountBad();
        myAccount.deposit(10000);
        myAccount.withdraw(5000);
        myAccount.withdraw(10000);
    }
}