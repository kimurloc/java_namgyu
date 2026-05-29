package ch10;

public class MethodExample {
    /*void add() {
        int n1 = 10;
        int n2 = 20;
        System.out.println(n1 + n2);
    }

    int add100(int num) {
        return num + 100;
    }*/

    static void printArray(int[] array, String name) {
        System.out.print(name + " : ");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static void changeArray(int[] arr1, int[] arr2) {
        printArray(arr1, "origin");
        printArray(arr2, "copy");

        System.out.println("change 1st element");
        arr1[0] = 88;
        arr2[0] = 99;

        printArray(arr1, "origin");
        printArray(arr2, "copy");
    }

    public static void main(String[] args) {
        /*add();
        Scanner s = new Scanner(System.in);
        System.out.print("enter the number : ");
        int num = s.nextInt();
        System.out.println(num + " + 100 = " + add100(num));*/
        int[] original = {10, 20, 30};
        int[] shallow = original;

        /*printArray(original, "original");
        printArray(shallow, "shallow copy");

        original[0] = 88;
        shallow[0] = 99;

        printArray(original, "original");
        printArray(shallow, "shallow copy");*/

        System.out.println("shallow copy");
        changeArray(original, shallow);

        original[0] = 10;
        int[] target = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            target[i] = original[i];
        }
        System.out.println("deep copy");
        changeArray(original, target);
    }
}