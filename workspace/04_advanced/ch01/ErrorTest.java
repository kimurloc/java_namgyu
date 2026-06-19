package ch01;

public class ErrorTest {
    public static void main(String[] args){
        try{
            int result = 10/0;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

        try{
            makeError();
        }catch(Throwable t){
            t.printStackTrace();
            System.out.println(t.getClass().getSimpleName());
        }

        System.out.println("program terminated");
    }
    static void makeError(){
        makeError();
    }
}