package ch10;

public class VarargsTest {
    static void sum(int... nums) {
        int sum = 0;
        for(int i : nums) {
            sum += i;
        }
        System.out.println(sum);
    }

    static void sum(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    static void sum(int n1, int n2, int n3) {
        int sum = 0;
        System.out.println(n1 + n2 + n3);
    }

    public static void main(String[] args) {
        sum(2, 3);
        sum(1, 2, 5);
        sum(4, 5, 6, 7);
    }
}
