package ch11.capsule.ex03;

public class AccountBad {
    public int balance;

    public void deposit(int amount) {
        this.balance += amount;
        System.out.println(amount + " won deposited. balance : " + balance);
    }

    public void withdraw(int amount) {
        if(balance - amount < 0) {
            System.out.println("balance is not enough. balance : " + balance);
        }else{
            balance -= amount;
            System.out.println(amount + " won witdrew. balance : " + balance);
        }
    }
}