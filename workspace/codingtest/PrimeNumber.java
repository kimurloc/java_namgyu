package codingtest;

public class PrimeNumber {
    public static void main(String[] args) {
        // https://school.programmers.co.kr/learn/courses/30/lessons/12921
        int n = 2;
        int answer = 0;
        for(int i = 2; i <= n; i++) {
            for(int j = 2; j <= i; j++) {
                if(i % j == 0 && j < i){
                    break;
                }else if(i == j){
                    answer++;
                }
            }
        }
        System.out.println(answer);

        /*int n = 13;
        int answer = 1;
        for(int i = 3; i <= n; i++) {
            for(int j = 2; j <= i; j++) {
                if(i % j == 0 && j < i){
                    break;
                }else if(i == j){
                    answer++;
                }
            }
        }
        System.out.println(answer);*/
    }
}