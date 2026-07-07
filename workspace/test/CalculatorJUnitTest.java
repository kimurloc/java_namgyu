import ch07.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorJUnitTest {
    private Calculator calc;

    @BeforeEach
    void setUp(){
        calc = new Calculator();
    }

    @Test
    @DisplayName("verifying 2 + 3")
    void add(){
        int result = calc.add(2, 3);
        assertEquals(5, result, "result should be 5");
        /*if(result == 5){
            System.out.println("verified");
        }else{
            System.err.println("result should be 5");
        }*/
    }

    @Test
    @DisplayName("verifying 3 + 4")
    void add_3_4(){
        int result = calc.add(3, 4);
        assertEquals(7, result, "result should be 7");
        /*if(result == 7){
            System.out.println("verified");
        }else{
            System.err.println("result should be 7");
        }*/
    }

    void divide(){
        double result = calc.divide(10, 6);
        if(result == 1.67){
            System.out.println("verified");
        }else{
            System.err.println("result should be 1.67");
        }
    }

    @Test
    @DisplayName("throw arithmetic exception")
    void divide_byZero(){
        assertThrows(ArithmeticException.class, () -> {
            calc.divide(10, 0);
        });
        /*try{
            calc.divide(10, 0);
        }catch(ArithmeticException e){
            System.err.println(e.getMessage());
        }*/
    }

    void main(){
        setUp();
        add();
        divide();
        add_3_4();
        divide_byZero();
    }
}
