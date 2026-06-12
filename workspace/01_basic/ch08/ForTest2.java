package ch08;

public class ForTest2 {
    public static void main(String[] args){
        int salary = 1;
        int month = 0;
        for(; salary < 100000000; month++) {
            salary *= 2;
        }
        System.out.println(month + ", " + salary);
    }
}
