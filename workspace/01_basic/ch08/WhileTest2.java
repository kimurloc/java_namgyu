package ch08;

public class WhileTest2 {
    public static void main(String[] args){
        int salary = 1;
        int month = 0;
        while(salary <= 100000000) {
            salary *= 2;
            month++;
        }
        System.out.println(month + ", " + salary);
    }
}
