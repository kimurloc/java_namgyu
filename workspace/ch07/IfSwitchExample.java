package ch07;

public class IfSwitchExample {
    public static void main(String[] args) {
        int age = 70;
        int price = 20000;
        double discountRate = 0.0;

        if (age <= 7) {
            price = 0;
        } else if (age <= 13) {
            discountRate = 0.5;
        } else if (age <= 19) {
            discountRate = 0.3;
        } else if (age >= 65) {
            discountRate = 0.7;
        }
        price *= 1 - discountRate;
        System.out.println("your age : " + age + ", your discount rate : " + discountRate + ", your price : " + price);
    }
}