package ch09;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] original = {10, 20, 30};
        int[] shallow = original;

        shallow[0] = 99;
        System.out.println(shallow[0]); // 99
        System.out.println(original[0]); // 99

        original[0] = 10;

        int[] target = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            target[i] = original[i];
        }

        target[0] = 99;
        System.out.println(target[0]); // 99
        System.out.println(original[0]); // 10
    }
}
