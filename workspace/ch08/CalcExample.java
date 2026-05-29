package ch08;

import java.util.Scanner;

public class CalcExample {
    public static void main(String[] args) {
        double result = 0;
        System.out.println("enter your calculation");
        Scanner s = new Scanner(System.in);
        double num1 = s.nextDouble();
        String operator = s.next();
        double num2 = s.nextDouble();
        switch (operator) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1*num2;
            case "/" -> result = num1/num2;
            default -> System.out.println("operator error!!!");
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
