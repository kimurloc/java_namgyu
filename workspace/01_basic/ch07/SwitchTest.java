package ch07;

public class SwitchTest {
    public static void main(String[] args) {
        int month = 5;
        switch(month) {
            case 2:
                System.out.println("28");
                break;
            case 4, 6, 8, 11:
                System.out.println("30");
                break;
            default:
                System.out.println("31");
                break;
        }

        int price = 10000;
        char grade = 'B';
        int discountRate;

        switch(grade) {
            case 'A':
                discountRate = 50;
                break;
            case 'B':
                discountRate = 30;
                break;
            case 'C':
                discountRate = 10;
                break;
            default:
                discountRate = 0;
                break;
        }
        price *= 1 - (discountRate / 100.0);
        System.out.println("your grade : " + grade + ", price : " + price);
    }
}
