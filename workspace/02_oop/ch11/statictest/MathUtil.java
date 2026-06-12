package ch11.statictest;

public class MathUtil {
    final static double PI = 3.141592;
    static int r = 5;

    // static method는 static 요소만 사용 가능
    static void area() {
        System.out.println(PI*r*r);
    }

    // instance 요소를 사용하지 않으면 static으로 단독사용가능
    static int add(int n1, int n2) {
        return n1 + n2;
    }
}
