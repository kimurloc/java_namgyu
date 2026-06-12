package ch08;

public class ForSolve {
    public static void main(String[] args){
        int sum1 = 0;
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
        System.out.println(sum2);
    }
}
