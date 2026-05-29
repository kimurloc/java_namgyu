package ch06;

public class OperatorExample {
    static void main() {
        int a = 3;
        boolean b = ((++a + 10) >= 14) && ((2 + 3 * ++a) >= 10);
        System.out.println(a);
        System.out.println(b);
    }
}
