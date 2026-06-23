package level02.day02;

public class Prob01 {
    public static int solution(int num1, int num2) {
        int answer = (int)((double)num1 / num2 * 1000);
        return answer;
    }

    public static void main(String[] args){
        System.out.println(solution(3, 2));
        System.out.println(solution(7, 3));
        System.out.println(solution(1, 16));
    }
}
