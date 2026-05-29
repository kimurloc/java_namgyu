package ch08;

public class ForExample {
    public static void main(String[] args) {
        /*int num = Integer.parseInt(args[0]);
        int sum = 0;
        for(int i = 0; i <= num; i++) {
            sum += i;
            System.out.println(i);
        }
        System.out.println(sum);*/

        /*int salary = 1;
        int month = 0;
        for(; salary < 100000000; month++) {
            salary *= 2;
        }
        System.out.println(month + ", " + salary);*/

        /*int sum1 = 0;
        int sum2 = 0;
        for(int i = 1; i <= 100; i++) {
            // 1~100 전체 합 : sum1
            sum1 += i;
            // 1~100 중 짝수의 합 : sum2
            if(i % 2 == 0) {
                sum2 += i;
            }
        }
        System.out.println(sum1);
        // 1~100 전체 합에서 짝수의 합을 빼면 홀수의 합
        System.out.println(sum1 - sum2);
        System.out.println(sum2);*/

        /*Scanner s = new Scanner(System.in);
        System.out.println("number?");
        int num = s.nextInt();
        for(int i = 1; i < 10; i++) {
            System.out.println(num + "*" + i + " = " + num*i);
        }*/

    }
}