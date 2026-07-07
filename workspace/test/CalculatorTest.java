import ch07.Calculator;

public class CalculatorTest {
    private Calculator calc;
    void setUp(){
        calc = new Calculator();
    }

    void add(){
        int result = calc.add(2, 3);
        if(result == 5){
            System.out.println("verified");
        }else{
            System.err.println("result should be 5");
        }
    }

    void add_3_4(){
        int result = calc.add(3, 4);
        if(result == 7){
            System.out.println("verified");
        }else{
            System.err.println("result should be 7");
        }
    }

    void divide(){
        double result = calc.divide(10, 6);
        if(result == 1.67){
            System.out.println("verified");
        }else{
            System.err.println("result should be 1.67");
        }
    }

    void divide_byZero(){
        try{
            calc.divide(10, 0);
        }catch(ArithmeticException e){
            System.err.println(e.getMessage());
        }
    }

    void main(){
        setUp();
        add();
        divide();
        add_3_4();
        divide_byZero();
    }
}
