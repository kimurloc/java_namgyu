package ch07;

public class Calculator {
    public int add(int a1, int a2){
        return a1 + a2;
    }

    public double divide(int n1, int n2){
        if(n2 == 0) throw new ArithmeticException();
        return Math.round((double)n1/n2*100)/100.0;
    }
}
