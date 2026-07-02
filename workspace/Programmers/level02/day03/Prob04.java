package level02.day03;

public class Prob04 {
    public int[] solution(int n) {
        int[] answer = new int[(n % 2 == 0) ? n/2 : n/2 + 1];
        System.out.println(answer.length);
        for(int i = 0; i < answer.length; i++){
            answer[i] = i*2 + 1;
        }
        return answer;
    }

    void main(){
        solution(10);
        solution(15);
    }
}
