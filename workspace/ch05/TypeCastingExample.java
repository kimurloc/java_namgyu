package ch05;

public class TypeCastingExample {
    static void main() {
        int intNum = 1000000000;
        double doubleNum = intNum;

        System.out.println(intNum);
        System.out.println(doubleNum);

        double doublePi = 3.141592;
        int intPi = (int)doublePi;

        System.out.println(doublePi);
        System.out.println(intPi);
    }
}
