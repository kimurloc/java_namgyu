package ch07;

public class IfExample {
    public static void main(String[] args) {
        int month = 5;
        if (month == 2) {
            System.out.println("28");
        } else if (month < 8 && month % 2 == 0 || month >= 8 && month % 2 == 1) {
            System.out.println("30");
        } else {
            System.out.println("31");
        }
    }
}