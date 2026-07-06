package ch06.lambda;

public class LambdaTest {
    void test1(){
        class CalculatorImpl implements Calculator{
            @Override
            public int add(int a, int b){
                return a + b;
            }
        }
        Calculator cal1 = new CalculatorImpl();
        System.out.println(cal1.add(10, 20));
    }

    void test2(){
        Calculator cal1 = new Calculator() {
            @Override
            public int add(int a, int b){
                return a + b;
            }
        };
        System.out.println(cal1.add(30, 40));
    }

    void test3(){
        final int defaultVal = 20;
        //defaultVal = 10;
        Calculator cal1 = (int a, int b) ->  a + b + defaultVal;
        System.out.println(cal1.add(50, 60));
    }

    void main(){
        //test1();
        //test2();
        test3();
    }
}
