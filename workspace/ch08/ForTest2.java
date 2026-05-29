package ch08;

public class ForTest2 {
    public static void main(String[] args) {
        //star1();
        //star2();
        //star3();
        //star4();
        calc();
    }
    static void star1() {
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void star2() {
        for(int i = 0; i < 50; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void star3() {
        for(int i = 0; i < 50; i++) {
            for (int j = 0; j < 50 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void star4() {
        for(int i = 0; i < 50; i++) {
            for (int j = 0; j < 50 - i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void calc() {
        for(int i = 2; i < 10; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.println(i + "*" + j + " = " + i*j);
            }
        }
    }
}