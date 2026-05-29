package ch08;

public class WhileExample {
    public static void main(String[] args) {
        /*int num = Integer.parseInt(args[1]);
        int i = 1;
        int sum = 0;

        while(i <= num) {
            sum += i;
            i++;
        }
        System.out.println(sum);*/

        /*int salary = 1;
        int month = 0;
        while(salary <= 100000000) {
            salary *= 2;
            month++;
        }
        System.out.println(month + ", " + salary);*/

        /*int j = (int) (Math.random()*6 + 1);;
        int count = 1;
        while(j != 6) {
            System.out.println(j);
            j = (int) (Math.random()*6 + 1);
            count++;
        }
        System.out.println(j + ", " + count);*/

        int j = 0;
        int count = 0;
        do {
            j = (int) (Math.random()*6 + 1);
            System.out.println(j);
            count++;
        } while (j != 6);
        System.out.println(j + ", " + count);
    }
}